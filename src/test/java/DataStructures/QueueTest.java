package DataStructures;

import org.junit.Test;


public class QueueTest {
	@Test
	public void given3NumbersWhenAddedToQueue()
	{
		MyQueue<Integer> myQueue=new MyQueue();
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myQueue.enqueue(myfirstNode);
		myQueue.enqueue(mysecondNode);
		myQueue.enqueue(mythirdNode);
		myQueue.printQueue();
	}
	@Test
	public void given3NumbersImplementDequeue()
	{
		MyQueue<Integer> myQueue=new MyQueue<>();
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myQueue.enqueue(myfirstNode);
		myQueue.enqueue(mysecondNode);
		myQueue.enqueue(mythirdNode);
		INode<Integer> del=myQueue.dequeue();
		System.out.println(del.getKey());
	}
}
