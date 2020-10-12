package DataStructures;

public class Node<K> implements INode<K> {
	private K key;
	private Node<K> next;
	public Node(K i)
	{
		this.key=i;
	}
	public Node<K> getNext() {
		return next;
	}
	public void setNext(INode<K> myNode) {
		next=(Node<K>) myNode;
	}
	public K getKey()
	{
		return key;
	}
	public void setKey(K key)
	{
		this.key=key;
	}
}
