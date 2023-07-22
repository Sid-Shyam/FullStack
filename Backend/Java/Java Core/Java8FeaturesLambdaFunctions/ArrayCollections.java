package com.NPT.java8FeaturesLambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollections {

	public static void main(String[] args) {
		//using List we do operations on lambdaExpressions
		List<String> list= new ArrayList<>();
		list.add("Shyam");
		list.add("Sowjanya");
		list.add("Mehar");
		list.add("yuva");
		
		list.forEach(n -> System.out.println(n));
		
		list.forEach(n->{
			if(n.startsWith("S"))
				System.out.println("name that Start with S :"+ n);
			else if(n.startsWith("M"))
				System.out.println("name start with M :"+ n);
			else
				System.out.println("name start with other alphabets :"+n);
		});
		
	}
}
