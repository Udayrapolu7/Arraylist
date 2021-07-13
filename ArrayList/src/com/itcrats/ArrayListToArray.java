package com.itcrats;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("uday");
		str.add("ravi");
		str.add("sai");
		str.add("ram");
		str.add("lava");
		Object[] objects = str.toArray();
		for(Object name:objects)
		{
			System.out.print(name+" ");
		}
		System.out.println("\n******************************");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		Integer[] inte =  new Integer[numbers.size()];
		inte = numbers.toArray(inte);
		for(Integer x : inte)
		{
		System.out.print(x +" ");
		
	}

}
}
