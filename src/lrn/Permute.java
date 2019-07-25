package lrn;

import java.util.HashSet;
import java.util.Set;

public class Permute {
	public static void main(String[] args) {
		String str = "abc";
		pmute(str.toCharArray(), 0);
		
		for(String s : perSet){
			System.out.println(s);
		}
	}
	static Set<String> perSet = new HashSet<>();
	public static void pmute(char [] arr, int l){
		for(int i = l; i < arr.length; i++){
			
			String sArr = String.valueOf(arr);
			
//			if(perSet.contains(sArr)){
//				
//				
//			} else {
				perSet.add(sArr);
				if(i < arr.length ){
					char temp = arr[i];
					arr[i] = arr[l];
					arr[l] = temp;
//					System.out.println(" --- " + sArr);
					pmute(arr, l+1);
				}
//			}
		}
	}
}
