package impl;

import java.util.NoSuchElementException;

public class StackImpl {
	private int size;
	private int top = 0;
	private int [] array;
	private float loadFactor = 0.75f;
	
	public StackImpl() {		
		array = new int [10];
	}
	
	public StackImpl(int size) {
		this.size = size;
		array = new int [size];
	}
	
	public void push(int element) throws InstantiationException{
		if(array.length > 0){
			array[top] = element;
			top++;
		} else {
			throw new InstantiationException();
		}
	}
	
	public int pop(){
		if(top <= 0){
			throw new NoSuchElementException();
		}
		return array[--top];
		
	}
	
	public int peek(){
		return array[top];		
	}
	
	
	public static void main(String[] args) throws InstantiationException {
		StackImpl impl = new StackImpl();
		impl.push(1);
		impl.push(2);
		impl.push(3);
		
		System.out.println(impl.pop());
		System.out.println(impl.pop());
		System.out.println(impl.peek());
		
		System.out.println(impl.pop());
	}
}
