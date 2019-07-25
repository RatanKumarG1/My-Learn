package com;

public class BlockCheck {
	
	public BlockCheck(){
		System.out.println("4 constructor");
	}
	
	{
		System.out.println("3 Only Block");
	}
	
	static{
		System.out.println("1 Static Block");
	}
	
	public static void main(String[] args) {
		/*String s = "Ratan";
		s = s.replace("a", "x");
		System.out.println(s);
		s = "Ratan";
		s = s.replaceAll("\\d", "x");
		System.out.println(s);*/
		
		
		System.out.println("2 PSVM");
		new BlockCheck();
	}
}

class Bc{

}
