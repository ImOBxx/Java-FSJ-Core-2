import org.w3c.dom.Node;

public class Nodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class SingleyList {
		    private Node START;

		    public SingleyList(){
		        START=null;
		    }
		public void addNode(int element)
		{
		/* statements */
		Node newNode=new Node(element);

		if(START==null) {
		 System.out.println("Node is Empty");

		 START=newNode;
		 System.out.println("Start Node Created");
		}
		 else{
		    Node temp=START;
		    while(temp.next!=null){
		        temp=temp.next;
		    }
		    temp.next=newNode;
		    System.out.println("Node Successfull added at the end of  list");
		 }
		}

		public boolean search(int element,Node previous,Node current)
		{
		/* statements */
		return false;
		}
		public boolean delNode(int element)
		{
		/* statements */
		return false;
		}

		public void traverse()
		{
		/* statements */
		Node temp=START;
		while(temp.next!=null){
		    System.out.println(temp.info);
		    temp=temp.next;
		}
		System.out.println(temp.info);
		}

		}

	}

}
