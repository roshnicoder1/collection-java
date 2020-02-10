package com.ibm.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Shiva");
		m.put(2, "Priya");
		m.put(3,  "Tom");
		m.put(4, "Tufail");
		
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			int x = (Integer)itr.next();
			System.out.println(m.get(x));
			
		}
		
		
		
	}

}
