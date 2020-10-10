package DataStructures;

import org.junit.Test;

public class DataTest {
	@Test
	public void given3numbersWhenLinkedShouldPassedLinedListTest()
	{
		Node<Integer> mythirdNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> myfirstNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		boolean result=myfirstNode.getNext().equals(mysecondNode)
				&&mysecondNode.getNext().equals(mythirdNode);
		new LinkedList();
		LinkedList myLinkedList=new LinkedList();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		myLinkedList.printMyNode();
	}
}
