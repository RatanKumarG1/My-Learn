package ds;

@FunctionalInterface
public interface TestInterface {
	void testMethod();
	
	static void testMethod2(){
		System.out.println("TEST");
	}
	
	default void testMethod3(){
		System.out.println("TEST");
	}
}
