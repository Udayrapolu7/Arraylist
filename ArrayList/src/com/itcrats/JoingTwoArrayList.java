package com.itcrats;

import java.util.ArrayList;

public class JoingTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("uday");
		list.add("krishna");
		list.add("rapolu");
		list.add("raviteja");
		list.add("it crats");
		System.out.println(list);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("banana");
		list2.add("apple");
		list2.add("mango");
		list2.add("guva");
		System.out.println(list2);
		
		list.addAll(list2);
		System.out.println(list);

		

		

	}

}
