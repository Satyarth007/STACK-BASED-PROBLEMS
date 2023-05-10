import java.util.Stack;
public class nextGreaterElementToTheRight {

	public static void main(String[] args) {
		 
		int arr[]= {4,8,2,3,10,4,6,2,3,7};
		int n=arr.length;
		Stack<Integer> st=new Stack<>();
		int ans[]=new int[n];
		ans[n-1]=-1;
		st.push(arr[n-1]);
		for(int i=n-2;i>=0;i--) {
			while(st.size()>0 && st.peek()<=arr[i]) st.pop();
			if(st.size()==0) ans[i]=-1;
			else ans[i]=st.peek();
			st.push(arr[i]);
		}
		for(int e:ans) System.out.print(e+" ");
	}

}
