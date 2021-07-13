package com.itcrats;

import java.util.ArrayList;

public class RemoveParticularElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("uday");
		str.add("ravi");
		str.add("sai");
		str.add("king");
		str.add("queen");
		str.add("ram");
		str.add("uday");
		System.out.println(str);
		str.remove(2);
		str.removeIf(name -> name.equals("uday"));
		str.remove("king");
		System.out.println(str);
	}

}
