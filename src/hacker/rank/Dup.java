package hacker.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dup {

	public static void main(String[] args) {
		int ar [] = {1, 1, 2, 1, 2, 3, 4, 5, 5, 5, 5, 5};
	
//		System.out.println("Result --> " + sockMerchant(7, ar));
//		System.out.println("Result --> " + regexmatch(12, "DDUUDDUDUUUD"));
//		System.out.println("Result --> " + regexmatch(8, "UDDDUDUU"));
		System.out.println("Result --> " + regexmatch(10, "DUDDDUUDUU"));
		
		
		String hello = "aaaa";
		Pattern pattern = Pattern.compile("aa");
		Matcher matcher = pattern.matcher(hello);

		int count = 0;
		int i = 0;
		while (matcher.find(i)) {
		    count++;
		    i = matcher.start() + 1;
		    System.out.println("Found match at: "  + matcher.start() + " to " + matcher.end() + " " + matcher.group());
		}

		System.out.println(count);    // prints 3
	}

	
	 private static int regexmatch(int n, String s) {
		 
		 Pattern pattern = Pattern.compile("DD");
	     Matcher matcher = pattern.matcher(s);

		 while(matcher.find()){
//		     System.out.println("Found match at: "  + matcher.start() + " to " + matcher.end() + " " + matcher.group());
		 }
	     
	     return   s.split("DD").length - 1;

	}


	static int sockMerchant(int n, int[] ar) {
		    int temp [] = new int [ar.length];
		    List<Integer> ll = new ArrayList<>();
		    int count = 0;
//		    ll.addAll(Arrays.asList(ar).stream().);
		    for(int i = 0 ; i < ar.length; i++) {
		    	int index = Arrays.asList(temp).indexOf(ar[i]);
		        if(index != -1){
		            count++;
		            temp[index] = 0;                
		        } else {
		        	temp[i] = ar[i];
		        }
		    	
		    }
		    IntStream is = IntStream.of(ar).distinct();
		   
		    /*Arrays.stream(ar).forEach((i) ->{
		        int index = Arrays.asList(temp).indexOf(i);
		        if(index != -1){
//		            count++;
		            temp[index] = 0;                
		        }
		      
		    });*/
		    
//		    List<> al = Arrays.asList(ar);
		    
//		    Arrays.stream(ar).forEach(System.out::println);
		    
		    List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
		    return list.stream().distinct().mapToInt(i -> Collections.frequency(list, i)/2).sum();
		    
		    

		}
}
