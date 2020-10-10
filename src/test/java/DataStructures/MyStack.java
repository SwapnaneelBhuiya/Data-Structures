package DataStructures;

public class MyStack {

	public LinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList=new LinkedList();
	}

	public void push(INode newNode) {
		myLinkedList.add(newNode);
	}

}
