package Constructors;

public class copyConstrucutor {
/*
 * The basic algorithm for implementing a copy constructor in Java is as follows:

(1) Define a class that represents an object you want to copy.

(2) Within the class, declare instance variables that represent the data you want to copy.

(3) Declare a copy constructor for the same class that takes a reference to an object of the same class as its argument. This constructor will create an exact copy of an existing object.

(4) Within the copy constructor, initialize the instance variables with the values from the argument object using this keyword.

(5) Now you check for null values. If the specified argument object is null, return a new object of the class with default values for the instance variables.

(6) If the instance variables are objects, construct new instances of those objects inside the constructor and initialize them with values from the argument object. It is called deep copying or cloning. This cloning ensures that changes to the copied object do not affect the original object.
 */
	int a=3;
	int b=5;
	public copyConstrucutor() {
		}
	public copyConstrucutor(copyConstrucutor ob) {
		a=ob.a;
		b=ob.b;
	}
	public static void main(String[] a) {
		copyConstrucutor obj= new copyConstrucutor();
		System.out.println("obj values :"+" a value : "+obj.a+ "    b value :"+ obj.b);
		obj.a=8;
		obj.b=21;
		System.out.println("Updating the values of a and b in existing object");
		System.out.println("obj values :"+" a value : "+obj.a+ "    b value :"+ obj.b);
		System.out.println("But when we create new object the values are not updated :");
		copyConstrucutor obj1= new copyConstrucutor();
		System.out.println("obj values :"+" a value : "+obj1.a+ "    b value :"+ obj1.b);
		System.out.println("To get the updated values of a and b, create another new object and pass the reference variable n of an existing object."); 
		copyConstrucutor obj2= new copyConstrucutor(obj);
		System.out.println("Getting the updated values from existing object obj after applying copy constructor");
		System.out.println("obj values :"+" a value : "+obj2.a+ "    b value :"+ obj2.b);
		
	}
	
}
