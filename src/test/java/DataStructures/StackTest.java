package DataStructures;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	@Test
	public void given3NumbersWhenAddedToStackShallHaveLastNode()
	{
		MyStack<Integer> myStack=new MyStack<Integer>();
		Node<Integer> myfirstNode=new Node<>(70);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(56);
		myStack.push(myfirstNode);
		myStack.push(mysecondNode);
		myStack.push(mythirdNode);
		INode newNode=myStack.peek();
		Assert.assertEquals(newNode, myfirstNode);
	}
	@Test
	public void given3NumbersWhenPoppedShouldShowLastNumber()
	{
		MyStack<Integer> myStack=new MyStack();
		Node<Integer> myfirstNode=new Node<>(70);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(56);
		myStack.push(myfirstNode);
		myStack.push(mysecondNode);
		myStack.push(mythirdNode);
		INode newNode=myStack.pop();
		Assert.assertEquals(newNode, mythirdNode);
	}
}
