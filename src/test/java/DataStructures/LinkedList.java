package DataStructures;

public class LinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public LinkedList()
	{
		this.head=null;
		this.tail=null;
	}
	public void add(INode<K> newNode)
	{
		if(this.head==null)
			this.head=newNode;
		if(this.tail==null)
			this.tail=newNode;
		else {
			sort(newNode);
			INode<K> tempNote=this.head;
			this.head=newNode;
			(this.head).setNext(tempNote);
		}
		//sort();
	}
	public void printMyNode() {
		StringBuffer myNodes=new StringBuffer("My Nodes:");
		INode<K> tempNode=head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			
			if(!tempNode.getNext().equals(null)) myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	public void append(INode<K> newNode){
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
	public void insert(INode<K> mynode, INode<K> newnode)
	{
		INode<K> tempnode=this.head;
		while(!tempnode.getKey().equals(mynode.getKey()))
			tempnode=tempnode.getNext();
		newnode.setNext(tempnode.getNext());
		mynode.setNext(newnode);
	}
	public INode<K> pop()
	{
		INode<K> temp= this.head;
		this.head=head.getNext();
		return temp;
	}
	public INode<K> popLast()
	{
		if(this.head==null)
		return null;
		else {
            INode<K> tempNode = head;
            while (!tempNode.getNext().equals(tail)) {
                tempNode = tempNode.getNext();
            }
            INode<K> tempNode1 = tempNode.getNext();
            tempNode.setNext(null);
            return tempNode1;
        }
	}
	public INode<K> search(INode<K> element)
	{
		if (this.head.equals(element))
            return this.head;

        INode<K> tempNode = head;
        while (tempNode != null) {
            tempNode = tempNode.getNext();
            if (tempNode.equals(element))
                return tempNode;
        }
        return null;		
	}
	public int length() {
	       int length = 0;
	       INode<K> temp = this.head;  // Starts counting from head - first node
	       while(temp != null){
	           length ++;
	           temp = temp.getNext();
	       }
	       return length;
	    }
	public INode<K> search(K key) {
      if (this.head.getKey().equals(key))
          return this.head;

      INode<K> tempNode = head;
      while (tempNode != null) {
          tempNode = tempNode.getNext();
          if (tempNode.getKey().equals(key))
              return tempNode;
      }
      return null;
  }
	public INode<K> delete(INode<?> element)
	{
		if (head.equals(element)) {
            INode<K> del = head;
            head = head.getNext();
            return del;
        }
        INode<K> deletedElement = head;
        while (!deletedElement.getNext().equals(element)) {
            deletedElement = deletedElement.getNext();
        }
        INode<K> tempNode = deletedElement.getNext();
        deletedElement.setNext(deletedElement.getNext().getNext());
        return tempNode;
	}
	public void sort(INode<K> newNode)
	{
		INode<K> currentNode = this.head;
        INode<K> prevNode = null;
        while (currentNode != null && (int) newNode.getKey() > (int) currentNode.getKey()) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();

        }
        if (prevNode == null) {
            this.head = newNode;
        } else {
            prevNode.setNext(newNode);
        }
        newNode.setNext(currentNode);

	}
}
