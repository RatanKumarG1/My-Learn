package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		  al.add("Ravi");
		  al.add("Vijay");
		  al.add("Ravi");
		  al.add("Ajay");

		  Iterator<String> itr=al.iterator();
		 
		  while(itr.hasNext()){
			  al.add("new");
		   System.out.println(itr.next());
		   
		  }		
		
	}

}
