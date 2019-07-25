package lrn;

public class MethodOverloadNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MethodOverloadNull().display(null);
	}

	public  void display(Object o){
		System.out.println("Object");
	}
	
	public  void display(String s){
		System.out.println("String");
	}
	
	public  void display(char c){
		System.out.println("Char");
	}
	
	public  void display(int c){
		System.out.println("int");
	}
	
}
