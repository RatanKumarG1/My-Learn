package ds;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sort sort = new Sort();
		int arr[] = {7, 5, 2, 4, 3, 9};
		int sortedArr[] = sort.bubbleSort(arr);
		sort.printArray(sortedArr);
		
	}
	
	public int [] bubbleSort(int [] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {				
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
				
			}
		}
		return arr;		
	}
	
	 void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 

}
