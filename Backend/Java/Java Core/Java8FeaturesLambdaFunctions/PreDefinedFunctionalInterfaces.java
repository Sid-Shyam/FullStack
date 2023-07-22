package com.NPT.java8FeaturesLambdaExpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PreDefinedFunctionalInterfaces {
	//java program that demonstrates the usages of predefined functional interfaces.
	public static void main(String args[]) {
	
		/*
		 * PreDefined Consumer<T>  Functional Interface
		 * Consumer interface represnts an operation that accepts a single argument and returns no result..
		 */
		Consumer<String> con=(st)-> System.out.println(st.toUpperCase());
		con.accept("hi shyam how about your progress on npt");
		
		/*
		 * Predefined Predicate<T> Functional Interface
		 * Predicate interface represents a predicate(boolean valued function) of an argument.
		 */
		Predicate<Integer> pr=num->(num%2==0);
		System.out.println(pr.test(21));
		
		/*
		 * Predefined Functional Interface UnaryOperator<T>
		 * It represents an operation of single operand that returns a result of the same type of its operand
		 */
		UnaryOperator<String> str=U->U.toLowerCase();
		System.out.println(str.apply(" HI SHYAM DO YOU HEARD ABOUT EL-DORADO"));
		
		/*
		 * It represents a supplier of results Supplier<T>
		 * the supplier can be used in all contexts where there is no input but an output is expected.
		 */
		Supplier<Integer> out=()->(int)Math.random();
		System.out.println("Supplier random value"+out.get());
		
		/*
		 * Functional Interface Function<T,R>
		 * it represents a function that accepts one argument and returns a result.
		 */
		Function<String,String> fun=s->{
			return message(s);
		};
		System.out.println(fun.apply("Shyam"));
	}
	static String message(String msg) {
		return "Hello"+ msg;
	};

}
