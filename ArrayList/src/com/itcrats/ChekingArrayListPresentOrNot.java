package com.itcrats;

import java.util.ArrayList;

public class ChekingArrayListPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("uday");
		str.add("ravi");
		str.add("sai");
		str.add("ram");
		str.add("lava");
		System.out.println(str);
		System.out.println("the name uday is availabel in array list ? :"+str.contains("ravi"));
		System.out.println("the name raviteja is availabel in array list ? :"+str.contains("raviteja"));
		

	}

}
