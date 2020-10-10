package DataStructures;

public class Node<K> implements INode<K> {
	private K key;
	private Node next;
	public Node(K i)
	{
		this.key=null;
		this.next=null;
	}
	public INode getNext() {
		return next;
	}
	public void setNext(INode myNode) {
		next=(Node) myNode;
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
