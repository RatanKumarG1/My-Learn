package test;

public class Core {
	{
		System.out.println("Parent block");
	}
	static {
		System.out.println("Parent static block");
	}
	public Core() {
		// TODO Auto-generated constructor stub
		System.out.println("Parent constructor block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		int x = 5;
//		int y = ++x;
		System.out.println(++x);
//		System.out.println(y);
		
		System.out.println("============");
		
		x = 5;
//		int z = x++;
		System.out.println(x++);
		System.out.println(x);*/
		
		Core c= new Child();
		
	}

}

class Child extends Core {
	
	{
		System.out.println("Child block");
	}
	static {
		System.out.println("Child static block");
	}
	
	public Child() {
		
		System.out.println("Child constructor block");
	}
	
}