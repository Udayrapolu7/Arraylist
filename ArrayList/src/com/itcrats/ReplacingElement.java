package com.itcrats;

import java.util.ArrayList;

public class ReplacingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("uday");
		list.add("krishna");
		list.add("rapolu");
		list.add("raviteja");
		list.add("it crats");
		System.out.println(list);
		// Replacinng An Element
        list.set(0, "megastar");
        System.out.println(list);
        list.set(3, "pawankalyan");
        System.out.println(list);
        

	}

}
