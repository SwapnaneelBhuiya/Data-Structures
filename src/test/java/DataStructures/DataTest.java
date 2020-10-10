package DataStructures;

import org.junit.Test;

public class DataTest {
	@Test
	public void given3numbersWhenLinkedShouldPassedLinedListTest() {
		Node<Integer> mythirdNode = new Node<>(56);
		Node<Integer> mysecondNode = new Node<>(30);
		Node<Integer> myfirstNode = new Node<>(70);
		myfirstNode.setNext(mysecondNode);
		mysecondNode.setNext(mythirdNode);
	}
}
