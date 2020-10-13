package DataStructures;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;
	public void add(K key)
	{
	this.setRoot(this.addRecursively(getRoot(),key));
	}
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key)
	{
		if(current ==null)
			return new MyBinaryNode<>(key);
		int compareResult=key.compareTo(current.key);
		if(compareResult==0)return current;
		if(compareResult<0)
		{
			current.left=addRecursively(current.left,key);
		}
		else
			current.right=addRecursively(current.right,key);
		return current;
	}
	public int getSize()
	{
		return this.getSizeRecursive(getRoot());
	}
	private int getSizeRecursive(MyBinaryNode<K> current)
	{
		return current ==null? 0:1+this.getSizeRecursive(current.left)+this.getSizeRecursive(current.right);
	}
	public MyBinaryNode<K> search(MyBinaryNode<K> current,K key)
	{
		if (current == null)
            return null;
        else if (current.key.compareTo(key) == 0)
            return current;
        else if (current.key.compareTo(key) < 0)
            return search(current.right, key);
        else
            return search(current.left, key);
	}
	public boolean search(K key) {
        return search(root, key) != null;
    }
	public MyBinaryNode<K> getRoot() {
		return root;
	}
	public void setRoot(MyBinaryNode<K> root) {
		this.root = root;
	}
}
