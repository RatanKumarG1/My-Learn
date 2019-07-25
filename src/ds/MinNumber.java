package ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinNumber {

	public static void main(String[] args) {
		MinNumber mn = new MinNumber();		
		int arr [] = {-10, 2 , 1, 5, 8, -1, -3, 7};
		System.out.println(mn.printSum(arr, 7));
	}
	
	/**
	 * Find the minimum number in a array 
	 * @param arr
	 * @return
	 */
	public int getMin(int [] arr){
		int min = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}		
		return min;
	}
	
	/**
	 * Find the sum of the given number (k) in array
	 * @param arr
	 * @param k
	 */
	public List<String> printSum(int [] arr, int k){
		List<String> matchNumbers = new ArrayList<>();
		List<Integer> temp  = new ArrayList<>();
		Arrays.parallelSort(arr);
		for(int i: arr){
			System.out.println(i);
		}
		
		for(int i = 0; i < arr.length; i++){
			if(temp.contains(arr[i])){
				matchNumbers.add(arr[i] + " and " + (k - arr[i]));
			} else {
				temp.add(k - arr[i]);
			}
		}
		return matchNumbers;
	}

}
