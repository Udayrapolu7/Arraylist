package com.itcrats;

import java.util.ArrayList;

public class InsertingElementInParticular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> numbers = new ArrayList<Integer>();
	      numbers.add(10);
	      numbers.add(20);
	      numbers.add(30);
	      numbers.add(40);
	      
	      numbers .add(1,15);
	      numbers .add(3,25);
	      for(Integer x : numbers)
	      {
	    	  System.out.println("numbers :"+x);  
	      }
	     


	}

}
