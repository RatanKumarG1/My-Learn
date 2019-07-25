package queue;

import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	public void queue(int val){
		stack1.push(val);
	}
	
	public int dequeue(){
		if(stack2.isEmpty()){
			while(!stack1.empty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
	/*public int peek(){
		if(!stack1.empty()){
			return stack1.peek();
		}
		return stack2.peek();
	}*/
	
	public static void main(String[] args) {
		QueueUsingStack qs = new QueueUsingStack();
	}
}


