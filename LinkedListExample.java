package com.ibm.collections;

import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Raghu");
		lst.add("Harshita");
		lst.add("Shyam");
		lst.add("Harshita");
		System.out.println(lst);
		lst.addFirst("Sowmya");
		System.out.println(lst);
		lst.addLast("Kushboo");
		System.out.println(lst);
        lst.add(3, "Shankar");
        System.out.println(lst);
        TreeSet<String> ts = new TreeSet<String>();
        ts.addAll(lst);
        System.out.println(ts);
//        System.out.println(lst);
//        lst.removeFirst();
//        System.out.println(lst);
//        System.out.println(lst.size());
//        System.out.println(lst.indexOf("Sowmya"));
//        System.out.println(lst.getFirst());
//        System.out.println(lst.getLast());
	}

}
