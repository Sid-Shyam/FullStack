package com.NPT.java8FeaturesLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class DemoCollectionforLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al= new ArrayList<>();
		al.add(21);
		al.add(44);
		al.add(28);
		al.add(3);
		al.add(121);
		al.add(11);
		// we will display the list before sorting it 
		System.out.println("The list"+al);
		//Now let us sort it with using lambda expressions
		//lets take a collections interface
		Collections.sort(al,(obj1,obj2)-> (obj1 > obj2) ? -1 : 
			(obj1 < obj2) ? 1 : 0);

		System.out.println("Sorted List after using Lambda :"+al);
		
		//using treeMap
		TreeMap<Integer,String> tree= new TreeMap<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
		tree.put(3, "Shyam");
		tree.put(9, "Sowjanya");
		tree.put(5, "Sid");
		tree.put(1, "Shree");
		System.out.println("After Sorting"+tree);
		
		//TreeSet
		TreeSet<String> ts =new TreeSet<>((as,bs)->as.compareTo(bs));
		ts.add("S");
		ts.add("H");
		ts.add("Y");
		ts.add("A");
		ts.add("M");
		System.out.println("Sorted Tree set :"+ts);
	}

}
