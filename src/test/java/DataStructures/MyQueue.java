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
		INode del=myLinkedList.delete(myLinkedList.head);
		return myLinkedList;
	}

}
