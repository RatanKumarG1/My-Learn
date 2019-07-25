package com;

import java.util.ArrayList;
import java.util.List;

public class ListOpr {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);//
		list.add(6);
		System.out.println("Before = " + list);
		list.remove(Integer.valueOf("100", 2));
		System.out.println("After = " + list);
	}
}
