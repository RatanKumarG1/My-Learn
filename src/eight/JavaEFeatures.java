package eight;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class JavaEFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IntStream.range(0, 5).forEach(System.out::println);
		IntStream.rangeClosed(0, 5).forEach(System.out::println);*/
		int r = 0;
		int a [] = {1,2};
		LongStream ls = Arrays.stream(a).asLongStream();
//		ls.forEach(i -> {r = (int) i;});
		
	}

}
