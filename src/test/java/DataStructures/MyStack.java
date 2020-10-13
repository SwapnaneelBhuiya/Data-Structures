package DataStructures;

public class MyStack<K> {

	public LinkedList<K> myLinkedList;

	public MyStack() {
		this.myLinkedList=new LinkedList();
	}

	public void push(INode<K> newNode) {
		myLinkedList.append(newNode);
	}

	public void printStack() {
		myLinkedList.printMyNode();
	}

	public INode<K> peek() {
		return myLinkedList.head;
	}

	public INode<K> pop() {
		return myLinkedList.popLast();
	}
	
}
