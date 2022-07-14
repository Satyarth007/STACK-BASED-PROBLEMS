
public class stackUsingArray {
	static int arr[];
	static int top;
	static int capacity;
	public stackUsingArray(int capacity) {
		this.capacity=capacity;
		top=-1;
		arr=new int[capacity];
	}
	
//=======================================================================================	
	//isFull method
	public static boolean isFull(int []arr) {
		if(top==capacity-1) {
			return true;
		}
		return false;
	}
//=======================================================================================	
		//isEmpty method
		public static boolean isEmpty(int []arr) {
			if(top==-1) {
				return true;
			}
			return false;
		}
//=======================================================================================
	//PUSH OPERATION
	public static void push(int data) {
		if(isFull(arr)) {
			System.out.println("STACK IS FULL BRO !");
			return;
		}
		top++;
		arr[top]=data;
	}
//=======================================================================================
	//POP OPERATION
	public static void pop() {
		if(isEmpty(arr)) {
			System.out.println("STACK IS EMPTY BRO !");
			return;
		}
		int popped=arr[top];
		top--;
		System.out.println("BYE BYE :: "+popped);
	}
//=======================================================================================	
	public static void display() {
		if(isEmpty(arr)) {
			System.out.println("STACK IS EMPTY BRO !");
			return;
		}
		for(int i=top;i>=0;i--) {
			System.out.print(arr[i]+" :: ");
		}
		System.out.println();
	}
//=======================================================================================	
	public static void main(String[] args) {
		// 
		stackUsingArray st=new stackUsingArray(5);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		
		st.display(); //OUTPUT- 90 :: 80 :: 70 :: 60 :: 50 ::
		
		st.pop();   // BYE BYE :: 90
		st.pop();
		
		st.display();
		

	}

}
