package com.ibm.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
	//	HashSet<Integer> hs = new HashSet<Integer>();
		TreeSet<Integer> hs = new TreeSet<Integer>();
		hs.add(67);
		hs.add(35);
		hs.add(89);
		hs.add(56);
		System.out.println(hs);

	}

}
