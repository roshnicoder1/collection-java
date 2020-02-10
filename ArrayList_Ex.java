package com.ibm.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(67);
		lst.add(78);
		lst.add(45);
		lst.add(32);
		lst.add(45);
		lst.add(76);
		System.out.println(lst);
		System.out.println(lst.get(3));
		System.out.println(lst.indexOf(76));
		System.out.println(lst.lastIndexOf(45));
		lst.remove(2);
		System.out.println(lst);
		lst.remove(4);
		System.out.println(lst);

	}

}
