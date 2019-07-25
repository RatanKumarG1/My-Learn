package com;

public class ExceptionCheck {

	public static void main(String[] args) {

		System.out.println(check());
		
	}
	
	public static int check(){
		try{
			return 0;
			//throw new Exception();
			
		}catch(Exception e){
			return 1;
		}finally {
			//return 2;
			System.out.println("Finally");
		}
	}

}
