package com.itcrats;

import java.util.ArrayList;

public class RetriveAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("uday");
		list.add("krishna");
		list.add("rapolu");
		list.add("raviteja");
		list.add("it crats");
		
		System.out.println(list);
		//Retriveing the elements
		System.out.println("second Element is : "+list.get(1));
		System.out.println("fourth Element is : "+list.get(3));

	}

}
