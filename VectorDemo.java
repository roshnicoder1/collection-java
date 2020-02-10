package com.ibm.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(45);
		v1.add(67);
		v1.add(75);
		v1.add(81);
		v1.add(345);
		v1.addElement(567);
		System.out.println(v1);
		System.out.println(v1.get(4));
		System.out.println(v1.size());
		System.out.println(v1.remove(5));
		Enumeration<Integer> e = v1.elements();
    
	    while(e.hasMoreElements())
	    {
	    	System.out.println(e.nextElement());
	    }
   	}

	}


