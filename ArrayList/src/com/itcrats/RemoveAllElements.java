package com.itcrats;

import java.util.ArrayList;

public class RemoveAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("uday");
		list.add("krishna");
		list.add("rapolu");
		list.add("raviteja");
		list.add("it crats");
		System.out.println(list);
		System.out.println("Size of Arraylist :"+list.size());
		System.out.println("**clearing the arrays**");
		 /*list.clear();
		System.out.println(list); */
		list.removeAll(list);
		System.out.println(list);
		

	}

}
