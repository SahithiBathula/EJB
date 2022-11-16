package com.infinite.jdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmploySortEx1 {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Swathi" , 88362));
		employList.add(new Employ(2, "Venu" , 88365));
		employList.add(new Employ(3, "Arun" , 88398));
		employList.add(new Employ(4, "Sahithi" , 88334));
		employList.add(new Employ(5, "Amala" , 88345));
		employList.add(new Employ(6, "Renuka" , 88308));
		employList.add(new Employ(7, "Madhu" , 88377));
		
		Collections.sort(employList, (e1 , e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		System.out.println("Sort By Name ");
		employList.forEach(System.out::println);
		System.out.println("Sort By Basic-Wise ");
		Collections.sort(employList,(e1 , e2) -> {
			return (int) (e1.getBasic() - e2.getBasic());
		});
	   employList.forEach(System.out::println);
}
}
