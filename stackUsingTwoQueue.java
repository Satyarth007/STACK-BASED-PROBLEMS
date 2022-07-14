import java.util.*;
public class stackUsingTwoQueue {
	static Queue<Integer> q1=new LinkedList<>();
	static Queue<Integer> q2=new LinkedList<>();
	
	static void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		q1.add(data);
		
		while(!q2.isEmpty()) {
			q1.add(q2.remove());
			
		}
	}
	static int pop() {
		return q1.remove();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackUsingTwoQueue q=new stackUsingTwoQueue();
		q.push(5);
		q.push(6);
		q.push(7);
		q.push(8);
		q.push(9);
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		

	}

}
