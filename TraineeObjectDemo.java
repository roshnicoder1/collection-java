package com.ibm.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraineeObjectDemo {

	public static void main(String[] args) {
		List<Trainee> tl = new ArrayList<Trainee>();
		tl.add(new Trainee(12,"Sakshi", 98));
		tl.add(new Trainee(14,"Lakshmi", 87));
		tl.add(new Trainee(15,"Sowmya", 92));
		tl.add(new Trainee(16,"Tejas", 83));
		tl.add(new Trainee(17,"Anil", 76));
		tl.add(new Trainee(18,"Umesh", 67));
		
		Iterator itr = tl.iterator();
		while (itr.hasNext()) {
			Trainee ta1 = (Trainee)itr.next();
			System.out.println("Trainee ID : "+ ta1.getId());
			System.out.println("Trainee Name :"+ ta1.getName());
			System.out.println("Score : "+ta1.getScore());
			
		}

	}

}
