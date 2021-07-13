package com.itcrats;

import java.util.ArrayList;

public class ArrayListIsEmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		boolean boo = numbers.isEmpty();
		if (boo == true)
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is Not empty");
		}
		numbers.add(25);
		boo = numbers.isEmpty();
		if (boo == true)
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is Not empty");
		}
		
		
		

	}

}
