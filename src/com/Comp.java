package com;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comp {
	public static void main(String [] ar) {
		
		
		List<PersonDTO> list = new ArrayList<>();
		
		PersonDTO personDTO = new PersonDTO();
		personDTO.setAge(21);
		personDTO.setName("Abc");		
		list.add(personDTO);
		
		personDTO = new PersonDTO();
		personDTO.setAge(23);
		personDTO.setName("Xyz");		
		list.add(personDTO);
		
//		Collections.reverse(list);
		Collections.sort(list, new PersonDTO());
		for(PersonDTO d: list){
			System.out.println(d.getAge());
		}
		
		
	}
}

class PersonDTO implements Comparator<PersonDTO>{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*@Override
	public int compareTo(PersonDTO p1) {
		if(p1.getAge() == age){
			return 0;
		}else if(age > p1.getAge()){
			return 1;
		} 
		return -1;
	}*/
//	@Override
//	public int compare(PersonDTO p1, PersonDTO p2) {
		
//		return p1.getAge().compareTo(p2.getAge());
		
		/*if(p1.getAge() == p2.getAge()){
			return 0;
		}else if(p1.getAge() > p2.getAge()){
			return 1;
		} 
		return -1;*/
//	}
	
	
	@Override
	public int compare(PersonDTO o1, PersonDTO o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}