package org;

import java.util.stream.IntStream;

public class LambTest {
	public static void main(String[] args) {
		int rows = 2;
		int cols = 10;
		int[][] memo = new int[rows][cols];
		/*IntStream.range(0, rows * cols).forEach(n -> {
			int i = n / cols;
			int j = n % cols;
			System.out.println(n);
			System.out.println("(" + i + "," + j + ")");
		});*/
		IntStream.range(0, 3).forEach(i -> System.out.println(i));
	}
}
