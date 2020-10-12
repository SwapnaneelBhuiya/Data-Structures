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
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		//myLinkedList.printMyNode();
		boolean result=myfirstNode.getNext().equals(mysecondNode)
				&&mysecondNode.getNext().equals(mythirdNode);
		Assert.assertEquals(false,result);
	}
	@Test
	public void given3numbersWhenAddedToLinkedListShouldBeAddedToTop()
	{
		Node<Integer> mythirdNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> myfirstNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
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
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
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
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
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
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
		myLinkedList.append(myfirstNode);
		myLinkedList.append(mysecondNode);
		myLinkedList.append(mythirdNode);
		INode res=myLinkedList.pop();
		//myLinkedList.printMyNode();
		Assert.assertEquals(myfirstNode.getKey(), res.getKey());
	}
	@Test
	public void givenLastElementWhenDeletedShouldPassLinkedListResult()
	{
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
		myLinkedList.append(myfirstNode);
		myLinkedList.append(mysecondNode);
		myLinkedList.append(mythirdNode);
		INode res=myLinkedList.popLast();
		//myLinkedList.printMyNode();
		Assert.assertEquals(mythirdNode.getKey(), res.getKey());
	}
	@Test
	public void abilityToSearchForNode30()
	{
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		INode res=myLinkedList.search(30);
	}
	@Test
	public void abilityToInsert40After30()
	{
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		Node<Integer> myfourthNode=new Node<>(40);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		INode res=myLinkedList.search(30);
		myLinkedList.insert(res, myfourthNode);
	}
	@Test
	public void abilityToDelete40After30()
	{
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		Node<Integer> myfourthNode=new Node<>(40);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		mythirdNode.setNext(myfourthNode);
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		myLinkedList.add(myfourthNode);
		Assert.assertEquals(myLinkedList.delete(myfourthNode),myfourthNode);
		//myLinkedList.printMyNode();
	}
	@Test
	public void abilityToSort()
	{
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		Node<Integer> myfourthNode=new Node<>(40);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
		mythirdNode.setNext(myfourthNode);
		LinkedList<Integer> myLinkedList=new LinkedList<Integer>();
		myLinkedList.add(myfirstNode);
		myLinkedList.add(mysecondNode);
		myLinkedList.add(mythirdNode);
		myLinkedList.add(myfourthNode);
		myLinkedList.sort(myfourthNode);
		//myLinkedList.printMyNode();
	}
	@Test
	public void given3NumbersWhenAddedToStackShallHaveLastNode()
	{
		MyStack myStack=new MyStack();
		Node<Integer> myfirstNode=new Node<>(70);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(56);
		myStack.push(myfirstNode);
		myStack.push(mysecondNode);
		myStack.push(mythirdNode);
		INode newNode=myStack.peek();
		myStack.printStack();
		Assert.assertEquals(newNode, mythirdNode);
	}
	@Test
	public void given3NumbersWhenPoppedShouldShowLastNumber()
	{
		MyStack myStack=new MyStack();
		Node<Integer> myfirstNode=new Node<>(70);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(56);
		myStack.push(myfirstNode);
		myStack.push(mysecondNode);
		myStack.push(mythirdNode);
		INode newNode=myStack.pop();
		myStack.printStack();
		Assert.assertEquals(newNode, mythirdNode);
	}
	@Test
	public void given3NumbersWhenAddedToQueue()
	{
		MyQueue myQueue=new MyQueue();
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
		MyQueue myQueue=new MyQueue();
		Node<Integer> myfirstNode=new Node<>(56);
		Node<Integer> mysecondNode=new Node<>(30);
		Node<Integer> mythirdNode=new Node<>(70);
		myQueue.enqueue(myfirstNode);
		myQueue.enqueue(mysecondNode);
		myQueue.enqueue(mythirdNode);
		LinkedList temp=myQueue.dequeue();
		temp.printMyNode();
	}
	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnFrequency()
	{
		String sentence ="To be or not to be";
		MyHashMap<String,Integer> myHashMap=new MyHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
		for(String word: words)
		{
			Integer value=myHashMap.get(word);
			if(value==null)
				value=1;
			else
				value+=1;
			myHashMap.add(word,value);
		}
		int freq=myHashMap.get("to");
		Assert.assertEquals(2, freq);
	}
	@Test
	public void givenASentenceWhenWordsAreAddedToListShouldReturnFrequency2()
	{
		String sentence ="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String,Integer> myHashMap=new MyLinkedHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
		for(String word: words)
		{
			Integer value=myHashMap.get(word);
			if(value==null)
				value=1;
			else
				value+=1;
			myHashMap.add(word,value);
		}
		int freq=myHashMap.get("paranoid");
		Assert.assertEquals(3, freq);
	}
	@Test
	public void given3NumbersWhenAddedToBSTShouldReturnSize()
	{
		MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size=myBinaryTree.getSize();
		System.out.println(myBinaryTree.search(myBinaryTree.getRoot(),30));
		Assert.assertEquals(3, size);
	}
}
