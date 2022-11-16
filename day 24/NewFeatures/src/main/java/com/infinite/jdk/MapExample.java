package com.infinite.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Swathi" , 88362));
		employList.add(new Employ(2, "Venu" , 88365));
		employList.add(new Employ(3, "Arun" , 88398));
		employList.add(new Employ(4, "Sahithi" , 88334));
		employList.add(new Employ(5, "Amala" , 88345));
		employList.add(new Employ(6, "Renuka" , 88308));
		employList.add(new Employ(7, "Madhu" , 88377));
		List<String> mapDemo =
				employList.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println("Employ Names");
		mapDemo.forEach(System.out::println);
}
}
