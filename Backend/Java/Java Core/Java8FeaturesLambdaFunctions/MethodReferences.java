package com.NPT.java8FeaturesLambdaExpressions;

import java.util.Arrays;

/*
 * Method References
 * there are four types of method references
 * 1.Reference to a static method
 * 2.Reference to an Instance method of an particular object
 * 3.Reference to an Instance method of an Arbitrary object of a particular type.
 * 4.Reference to a Constructor
 */

interface FunctionalInterface{
	public void show();
}
interface FunctionalInterface1{
	App showMessage(String str);
}
public class MethodReferences {

	public static void main(String[] args) {
		//1. Reference to a static method
		FunctionalInterface funInterface=MethodReferences::display;
		funInterface.show();
		//2.Reference to an Instance method of an particular object
		//MethodReferences obj= new MethodReferences(); //instead of creating object 
		FunctionalInterface funInterface1=new MethodReferences()::instance;// we can do this
		funInterface1.show();
		//3.Reference to an Instance method of an Arbitrary object of a particular type.
		String[] array= {"Shyam","Srinivas","Mehar","Yuva Kiran"};
		System.out.println("Before sorting"+Arrays.toString(array));
		Arrays.sort(array,String::compareToIgnoreCase);
		System.out.println("After sorting"+Arrays.toString(array));
		//4.Reference to a Constructor
		FunctionalInterface1 fun=App::new;
		fun.showMessage("Hi from Method Reference Class");
	}
	public static void display() {
		System.out.println("Message : from Static Method");
	}
	public void instance() {
		System.out.println("Message : from instance method called by particular object");
	}
}
