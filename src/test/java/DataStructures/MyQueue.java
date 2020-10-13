package DataStructures;

public class MyQueue<K> {

	public LinkedList<K> myLinkedList;
	public MyQueue()
	{
		myLinkedList=new LinkedList();
	}
	public void enqueue(INode<K> newNode) {
		myLinkedList.append(newNode);
	}
	public void printQueue() {

		myLinkedList.printMyNode();
	}
	public INode<K> dequeue() {
		INode<K> del=myLinkedList.delete(myLinkedList.head);
		return del;
	}

}
