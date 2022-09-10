import java.util.Stack;
public class sortedInsertInStack {
	public static void sortedInsert(Stack<Integer> st, int ele) {
		int temp;
// NOTE :- IF THE STACK IS IN ASCENDING ORDER i.e. TOP is smallest then use this condition	:-	
		if(st.isEmpty() || ele > st.peek()) { 
			st.push(ele);
			
// NOTE :- IF THE STACK IS IN DESCENDING ORDER i.e. TOP is largest then use this condition	:-	
//			if(st.isEmpty() || ele < st.peek()) { 
//				st.push(ele);
		
		}else {
			temp=st.pop();
			sortedInsert(st,ele);
			st.push(temp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		 sortedInsert(st,6);
		 System.out.println(st);
		 sortedInsert(st,15);
		 System.out.println(st);

	}

}
