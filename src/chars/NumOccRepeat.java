package chars;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumOccRepeat {

	public NumOccRepeat() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String s = "2 FOR 2 0 FOR 5 1";
		
		
		
		
		numOccPrint(s);
	}
	
	public static  void numOccPrint(String charArray) {
		StringJoiner sj = new StringJoiner(",");
		String.join(",", "fff","vv");
		String [] str = charArray.split(" ");
		Function<Integer, Integer> mapFunction = m -> {
			/*if (m.equalsIgnoreCase("for")) {				
				return "";
			}*/
			return m;
		};
		
		IntFunction<?> iFunction = m -> {
			if (str[m].equalsIgnoreCase("for") && m != 0) {
				String newString = Stream.generate(() -> str[m - 1]).limit(Integer.parseInt(str[m + 1]) - 1).collect(Collectors.joining(","));
//				m.
				return newString;
			} else if (m != 0 && str[m - 1].equalsIgnoreCase("for")) {
				return null;
			} else {
				return  str[m];
			}
			
		};
		
		
		
//		System.out.println(Arrays.stream(str).allMatch(m -> m.equalsIgnoreCase("for")));
		
//		Arrays.stream(str).map(mapFunction).forEach(System.out::println);
		
//		Arrays.stream(str).filter(i -> i.equalsIgnoreCase("for") && i == 0).findFirst();
		
		String result = IntStream.range(0, str.length).mapToObj(iFunction).filter(i -> i != null).map(m -> String.valueOf(m)).collect(Collectors.joining(","));
		System.out.println(result);
	}
	
	


}
