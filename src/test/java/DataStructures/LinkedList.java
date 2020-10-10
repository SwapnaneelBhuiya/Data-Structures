package DataStructures;

public class LinkedList {
	private Object head;
	private Object tail;

	public LinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	public void add(Object newNode)
	{
		if(this.tail==null)
			this.tail=newNode;
		if(this.head==null)
			this.head=newNode;
		else {
			INode tempNote=(INode) this.head;
			this.head=newNode;
		}
	}
	public void printMyNode() {
		StringBuffer myNodes=new StringBuffer("My Nodes:");
		INode tempNode=(INode) head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			
		}
	}
	public void append(INode newNode){
        if(head == null){
            head = newNode;
            return;
        }
        this.tail=newNode;
    }
	public void insert(INode mynode, INode newnode)
	{
		INode tempnode=mynode.getNext();
		mynode.setNext(newnode);
		newnode.setNext(tempnode);
	}
	public INode pop()
	{
		INode temp=(INode) this.head;
		this.head=((INode) head).getNext();
		return temp;
	}

}
