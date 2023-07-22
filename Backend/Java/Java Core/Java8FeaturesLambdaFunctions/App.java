package com.NPT.java8FeaturesLambdaExpressions;
import java.util.Scanner;

public class App {
	String msg;
	public App(String msg) {
		System.out.println("Method refernce called using with constructor"+ msg);
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scan.next();

        System.out.print("Enter your last name: ");
        String lastName = scan.next();

        DemoInterface obj = (fn, ln)-> System.out.println("My full name is " + fn + " " + ln);
        obj.getFullName(firstName, lastName);

        scan.close();
    }
}

interface DemoInterface {
    void getFullName(String firstName, String lastName);
}
