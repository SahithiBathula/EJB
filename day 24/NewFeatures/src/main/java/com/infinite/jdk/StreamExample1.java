package com.infinite.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Swathi" , 88362));
		employList.add(new Employ(2, "Venu" , 88365));
		employList.add(new Employ(3, "Arun" , 88398));
		employList.add(new Employ(4, "Sahithi" , 88334));
		employList.add(new Employ(5, "Amala" , 88345));
		employList.add(new Employ(6, "Renuka" , 88308));
		employList.add(new Employ(7, "Madhu" , 88377));
		
		Stream<Employ> employFilter =
				employList.stream().filter(x -> x.getBasic() >=9000);
		//employList.stream().filter(x -> x.getName().startsWith("s"))
		System.out.println("Filtered Data ");
		employFilter.forEach(System.out::println);
	}
}
