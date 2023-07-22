package Constructors;

public class class_one {

	public static void main(String args[]) {
		//objectInitialization obj= objectInitialization.create("Software");
		// Creating instances of Overloading using different constructors
/*		Overloading defaultRect = new Overloading();
		Overloading customRect = new Overloading(10, 5);
	*/
		//Circle circle = Circle.shyam(5.0);
		Blocks block= new Blocks();
		}
}
class objectInitialization{
	private String name;
	private String job;
	// private constructor 
	private objectInitialization(String job) {
		this.name="shyam";
		this.job=job;
		System.out.println(name+  " :  "+job);
	}
	public static objectInitialization create(String job) {
		return new objectInitialization(job);
	}
}
/*
 * A Java constructor is a special method that is used to initialize objects of a class. It is called automatically when an object is created, and its purpose is to set the initial state of the object. Constructors have the same name as the class and do not have a return type, not even void. In this response, I'll explain the functionalities, features, and capabilities of Java constructors with examples in detail.

Object Initialization: Constructors are used to initialize objects of a class by setting the initial values of instance variables or performing other necessary setup tasks. They are invoked with the new keyword followed by the class name and parentheses.
Example:

java
Copy code
class Car {
    String make;
    String model;
    int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

// Creating an instance of Car using the constructor
Car myCar = new Car("Toyota", "Camry", 2020);*/
class Overloading{
	 int width;
	    int height;

	    // Constructor with default values
	    public Overloading() {
	        width = 0;
	        height = 0;
	    }

	    // Constructor with specified values
	    public Overloading(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }
	

	
	
}
/*
Overloading: Constructors can be overloaded, meaning a class can have multiple constructors with different parameter lists. This allows objects to be initialized in different ways, providing flexibility and convenience to the users of the class.
Example:

java
Copy code
class Rectangle {
    int width;
    int height;

    // Constructor with default values
    public Rectangle() {
        width = 0;
        height = 0;
    }

    // Constructor with specified values
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

// Creating instances of Rectangle using different constructors
Rectangle defaultRect = new Rectangle();
Rectangle customRect = new Rectangle(10, 5);
Chaining Constructors: Constructors can call other constructors within the same class using the this() keyword. This is known as constructor chaining and allows common initialization code to be reused.
Example:

java
Copy code
class Person {
    String name;
    int age;

    // Constructor with name parameter
    public Person(String name) {
        this.name = name;
        age = 0;  // Default age
    }

    // Constructor with name and age parameters
    public Person(String name, int age) {
        this(name);  // Call the constructor with name parameter
        this.age = age;
    }
}

// Creating instances of Person using different constructors
Person person1 = new Person("John");
Person person2 = new Person("Jane", 25);
Access Modifiers: Constructors can have access modifiers like any other methods. These modifiers control the visibility of the constructor and determine which classes can instantiate objects of the class.
Example:

java
Copy code*/

class Circle {
    private double radius;

    // Private constructor
    private Circle(double radius) {
        this.radius = radius;
        System.out.println("instanced");
    }

    // Public factory method to create instances
    public static Circle shyam(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        return new Circle(radius);
    }
}
/*
// Creating instances of Circle using the factory method
Circle circle = Circle.create(5.0);
Initialization Blocks: In addition to constructors, Java provides initialization blocks, such as static and instance initialization blocks. These blocks are used to initialize static and instance variables, respectively. Initialization blocks are executed before constructors.
Example:

java
Copy code
class MyClass {
    static {
        // Static initialization block
        // Initialize static variables or perform other static setup tasks
    }

    {
        // Instance initialization block
        // Initialize instance variables or perform other instance setup tasks
    }

    // Constructor
    public MyClass() {
        // Constructor body
    }
}
These are some of the main functionalities, features, and capabilities of Java constructors. Constructors play a crucial role in object initialization, allowing you to define how objects are created and set up.
 */
class Blocks{
	static char c;
	private int a;
	static {
		System.out.println("Static start block called"+c);
		// Static initialization block
        // Initialize static variables or perform other static setup tasks
		 c=65;
		 System.out.println("Static end block called"+c); 
	}
	{// Instance initialization block
        // Initialize instance variables or perform other instance setup tasks
		System.out.println("Instance Block");
		 a =28;
	}
	public Blocks() {
		
		 
		
		System.out.println("Constructor of Block");
		
		System.out.println("values at static block :"+Blocks.c);
		System.out.println("values at initialization block :"+a);
		System.out.println("values at initialization block with this keyword :"+this.a);
	}
}