package test;

public class TestPojo extends Pojo {

	int age;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPojo testPojo = new TestPojo();
		testPojo.test();
	}
	public final void setAge(int age) {
		this.age = age;
	}
	public void test(){
		final int a ;
		
		final Pojo pojo = new Pojo();
		pojo.setAge(1);
		pojo.setName("Ratan");
		
		pojo.setAge(3);
		pojo.setName("K");
		
		System.out.println(pojo.toString());
	}
}
