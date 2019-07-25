package com;

public class IncDec {

	public static void main(String[] args) {
		int i = 1;
		int j = i++;
		
		System.out.println("i = " + i + " j = " + j);
		i = 1;
		j = ++i;
		System.out.println("i = " + i + " j = "+ j);
		
		
		fib(10);
	}

	
	public static void fib(int n){
		System.out.println();
		if(n == 0 || 0 <= n){
			System.out.print(0);
			System.out.print(" ");
		}
		if (n == 1 || 1 <= n){
			System.out.print(1);
		}
			int n1 = 0;
			int n2 = 1;
			int sum = 0;
			for(int i = 2; i <=n; i++){
				sum = n1 + n2;
				System.out.print(" ");
				System.out.print(sum);
				n1 = n2;
				n2 = sum;
			
		}
	}

}
