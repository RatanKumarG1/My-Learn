package lrn;

public class RepeatElements {
	
	    void printRepeating(int arr[], int size)
	    {
	        int i;  
	       
	        int temparr[] = new int [size];
	        int repeatarr[] = new int [size];
	        int tempIndex = 0;
	        int repeatIndex = 0;
	        for (i = 0; i < size; i++){
	        	if(contains(temparr, arr[i]) == false){
	        		temparr[tempIndex] = arr[i];
	        		tempIndex++;
	        	} else {
	        		if(contains(repeatarr, arr[i]) == false){
	        			repeatarr[repeatIndex] = arr[i];
	        			repeatIndex++;
	        		}
	        	}
	        }
	        
	        System.out.println("Removing duplicate elements  : ");
	        for (i = 0; i < tempIndex; i++){
	        	System.out.println(temparr[i]);
	        }
	        
	        System.out.println("The repeating elements are : ");
	        for (i = 0; i < repeatIndex; i++){
	        	System.out.println(repeatarr[i]);
	        }
	        
	    } 
	 
	    // Driver program 
	    public static void main(String[] args) 
	    {
	    	RepeatElements duplicate = new RepeatElements();
	        int arr[] = {1, 2, 3, 1, 3, 6, 6, 1, 2, 1, 9};
	        int arr_size = arr.length;
	        duplicate.printRepeating(arr, arr_size);
	    }
	    
	    public boolean contains(int [] array, int element){
	    	 for (int i = 0; i < array.length; i++){
	    		 if(array[i] == element){
	    			 return true;
	    		 }
	    	 }
			return false;
	    	
	    }
}
