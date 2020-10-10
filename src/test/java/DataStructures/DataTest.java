package DataStructures;

import org.junit.Test;

public class DataTest {
	@Test
	@Test
	public void given3numbersWhenLinkedShouldPassedLinedListTest()
	{
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		new LinkedList();
		LinkedList myLinkedList=new LinkedList();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		myLinkedList.printMyNode();
		boolean result=myfirstNode.getNext().equals(mysecondNode)
				&&mysecondNode.getNext().equals(mythirdNode);
		Assert.assertEquals(true,result);
	}
	@Test
	public void given3numbersWhenAddedToLinkedListShouldBeAddedToTop()
	{
		Node<Integer> mythirdNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> myfirstNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		new LinkedList();
		LinkedList myLinkedList=new LinkedList();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		boolean result=myfirstNode.getNext().equals(mysecondNode)
				&&mysecondNode.getNext().equals(mythirdNode);
		Assert.assertEquals(true,result);
	}
}
