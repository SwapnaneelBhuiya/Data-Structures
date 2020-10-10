package DataStructures;

public class MyStack {

	public LinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList=new LinkedList();
	}

	public void push(INode newNode) {
		myLinkedList.add(newNode);
	}

	public void printStack() {
		myLinkedList.printMyNode();
	}

	public INode peek() {
		return myLinkedList.head;
	}

	public INode pop() {
		return myLinkedList.pop();
	}
	
}
