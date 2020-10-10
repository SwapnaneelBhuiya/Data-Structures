package DataStructures;

import org.junit.Assert;
import org.junit.Test;

public class DataTest {
	@Test
	public void given3numbersWhenLinkedShouldPassedLinkedListTest()
	{
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
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
		LinkedList myLinkedList=new LinkedList();
		myLinkedList.add(mythirdNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(myfirstNode);
		boolean result=myfirstNode.getNext().equals(mysecondNode)
				&&mysecondNode.getNext().equals(mythirdNode);
		Assert.assertEquals(true,result);
	}
	@Test
	public void given3numbersWhenAppendedShouldBeAddedLast()
	{
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList myLinkedList=new LinkedList();
		myLinkedList.add(myfirstNode);
		myLinkedList.append(mysecondNode);
		myLinkedList.append(mythirdNode);
		boolean result=myLinkedList.head.equals(myfirstNode)
				&&myLinkedList.head.getNext().equals(mysecondNode)&&
				myLinkedList.tail.equals(mythirdNode);
		Assert.assertEquals(true,result);
	}
	@Test
	public void given3numbersWhenInsertingSecondInBetweenShouldPassLinkedListResult()
	{
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList myLinkedList=new LinkedList();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mythirdNode);
		myLinkedList.insert(myfirstNode, mysecondNode);
		boolean result=myLinkedList.head.equals(myfirstNode)
				&&myLinkedList.head.getNext().equals(mysecondNode)&&
				myLinkedList.tail.equals(mythirdNode);
		Assert.assertEquals(false,result);
	}
	@Test
	public void givenFirstElementWhenDeletdShouldPassLinkedListResult()
	{
		Node<Integer> mythirdNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> myfirstNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList myLinkedList=new LinkedList();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		INode res=myLinkedList.pop();
		myLinkedList.printMyNode();
		Assert.assertEquals(myfirstNode, res);
	}
	@Test
	public void givenLastElementWhenDeletedShouldPassLinkedListResult()
	{
		Node<Integer> mythirdNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> myfirstNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList myLinkedList=new LinkedList();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		INode res=myLinkedList.popLast();
		myLinkedList.printMyNode();
		Assert.assertEquals(mythirdNode, res);
	}
	@Test
	public void abilityToSearchForNode30()
	{
		Node<Integer> mythirdNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> myfirstNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList myLinkedList=new LinkedList();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		INode res=myLinkedList.search(30);
	}
}
