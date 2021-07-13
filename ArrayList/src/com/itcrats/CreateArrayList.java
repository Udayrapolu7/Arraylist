package com.itcrats;

import java.util.ArrayList;



public class CreateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("uday");
		list.add("krishna");
		list.add("rapolu");
		list.add("raviteja");
		list.add("it crats");
		
		System.out.println(list);
		
		list.add(2,"amma");
		System.out.println("updated arraylist:"+list);
		
		list.remove("raviteja");
		System.out.println("updated arraylist  after delete:"+list);
		

	}

}
