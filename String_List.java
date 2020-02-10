package com.ibm.collections;

import java.util.ArrayList;
import java.util.List;

public class String_List {

	public static void main(String[] args) {
		
		String str = "Learning collection is very easy";
		String[] st = str.split(" ");
		List <String> arrlst = new ArrayList<String>();
		for (int i=0; i<st.length;i++)
		{
			arrlst.add(st[i]);
		}
		System.out.println(arrlst);
		}
}
