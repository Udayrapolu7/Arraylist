package com.itcrats;

import java.util.ArrayList;

public class IncreaseCapcityOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList(3);
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		System.out.println(numbers);
		System.out.println("increse the size of arraylist to store upto 500");
		numbers.ensureCapacity(200);
		numbers.add(250);
		System.out.println(numbers);
		
		
		

	}

}
