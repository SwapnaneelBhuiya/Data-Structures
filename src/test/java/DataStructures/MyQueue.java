package DataStructures;

public class MyQueue {

	public LinkedList myLinkedList;
	public MyQueue()
	{
		myLinkedList=new LinkedList();
	}
	public void enqueue(INode newNode) {
		myLinkedList.append(newNode);
	}
	public void printQueue() {

		myLinkedList.printMyNode();
	}
	public LinkedList dequeue() {
		myLinkedList.delete(myLinkedList.head.getKey());
		return myLinkedList;
	}

}
