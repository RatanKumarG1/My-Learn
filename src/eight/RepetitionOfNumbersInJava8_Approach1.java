package eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RepetitionOfNumbersInJava8_Approach1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases you want to run: ");

		IntStream.range(0, sc.nextInt()).forEach(input -> {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter an Input");

			String question = sc1.nextLine();

			question = question.replaceAll(" FOR ", "_FOR_");
			List<String> list = new ArrayList<>();
			Arrays.stream(question.split(" ")).forEach(string -> {
				if (!string.contains("FOR")) {
					list.add(string);
				} else {
					String[] arr = string.split("_FOR_");
					IntStream.range(0, Integer.valueOf(arr[1])).forEach(str -> list.add(arr[0]));
				}
			});
			System.out.println(list);
		});
	}
}

/*
 Enter the number of test cases you want to run: 
4
Enter an Input
2 FOR 12 5 FOR 2 10
[2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 10]
Enter an Input
2 FOR 2 0 FOR 5 1 
[2, 2, 0, 0, 0, 0, 0, 1]
Enter an Input
1 2 3 4 5 6 FOR 10
[1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
Enter an Input
1 FOR 5 0 FOR 0 0
[1, 1, 1, 1, 1, 0]
 */
