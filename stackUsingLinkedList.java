class Node{
	int data;
	Node next;
	
	public Node(int data, Node next) {
	this.data=data;
	this.next=next;
	}
}
class Stack{
	static Node head;
	static int size;
	public Stack() {
		head=null;
		size=0;
	}
//===========================================================================================	
	public static boolean isEmpty() {
		return size==0;
	}
//===========================================================================================
	//PUSH
	public static void push(int value) {
		Node newNode=new Node(value,null);
		newNode.next=head;
		head=newNode;
		
		size++;
			
		
	}
//===========================================================================================
	//POP
		public static void pop() {
			
			head=head.next;
			
			size--;
				
			
		}
//===========================================================================================
	//PEEK
			public static int peek() {
				
				return head.data;
					
				
			}		
//===========================================================================================	
	//DISPLAY
	public static void display() {
		if(head==null) {
			System.out.println("STACK IS EMPTY !");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" :: ");
			temp=temp.next;
		}
	}
}
public class stackUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(5);
		s.push(6);
		s.push(4);
		
		s. display();
		
		//s.pop();
		//s.display();
		
	System.out.println(	s.peek());

	}

}
