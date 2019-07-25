package org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteroper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iteroper io = new Iteroper();
		io.testIter();
		
		/*Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
		p.check();
		c.check();
		c.display();
		pc.check();*/
	}
	
	
	/*public void testIndex(){
		for(int i = 0; ; i=i*i){
			System.out.println(i);
		}
	}*/
	
	public void testIter(){
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator<String> itr = list.iterator();
				while(itr.hasNext()){
					String a = itr.next();
					if(a.equals("c")){
						itr.remove();
					}					
					System.out.println(a);
				}
				System.out.println(itr);
				System.out.println(list);
	}
}
	class Child extends Parent{
		public void display(){
			System.out.println("Chd D");
		}
	}
	
	class Parent{
		public void check(){
			System.out.println("Prt C");
		}

	}

