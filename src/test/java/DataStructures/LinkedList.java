package DataStructures;

public class LinkedList {
	public INode head;
	public INode tail;

	public LinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	public void add(INode newNode)
	{
		if(this.tail==null)
			this.tail=newNode;
		if(this.head==null)
			this.head=newNode;
		else {
			INode tempNote=this.head;
			this.head=newNode;
			(this.head).setNext(tempNote);
		}
	}
	public void printMyNode() {
		StringBuffer myNodes=new StringBuffer("My Nodes:");
		INode tempNode=(INode) head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	public void append(INode newNode){
        if(this.head==null)
        	head=newNode;
        if(this.tail==null)
        	tail=newNode;
        else
        {
        	this.tail.setNext(newNode);
        	this.tail=newNode;
        }
    }
	public void insert(INode mynode, INode newnode)
	{
		INode tempnode=mynode.getNext();
		mynode.setNext(newnode);
		newnode.setNext(tempnode);
	}
	public INode pop()
	{
		INode temp= this.head;
		this.head=head.getNext();
		return temp;
	}
	public INode popLast()
	{
		INode temp=this.head;
		while(!(temp.getNext().equals(tail)))
			temp=temp.getNext();
		this.tail=temp;
		temp=temp.getNext();
		return temp;
	}
}
