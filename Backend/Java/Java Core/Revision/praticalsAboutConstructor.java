package Revision;
/*
 * n Java, constructors cannot be overridden in the same way that methods can be overridden.

When you define a class in Java, it may have one or more constructors that are used to create objects of that class. Constructors are special methods that have the same name as the class and are called when an object is instantiated.

Subclasses in Java inherit the constructors of their superclass, but they cannot override them. However, subclasses can call the constructors of their superclass using the super() keyword to initialize the inherited members of the superclass.

It's important to note that if a subclass doesn't define any constructors, it will automatically inherit the default constructor of the superclass (if the superclass has one). But if the superclass only defines parameterized constructors (constructors with arguments), the subclass must explicitly define at least one constructor and use the super() keyword to call one of the superclass constructors.

In summary, while constructors in Java cannot be overridden, they are inherited by subclasses and can be called using the super() keyword to initialize the inherited state.

 *
 *It is a special type of method which is used to initialize the object.

Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.
 *
 *
 *There are two types of constructors in Java: no-arg constructor, and parameterized constructor.

Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.

Rules for creating Java constructor
There are two rules defined for the constructor.

Constructor name must be the same as its class name
A Constructor must have no explicit return type
A Java constructor cannot be abstract, static, final, and synchronized
Note: We can use access modifiers while declaring a constructor. It controls the object creation. In other words, we can have private, protected, public or default constructor in Java.
 *
 *
 *
 *
 *Q) What is the purpose of a default constructor?
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
 *
 *
 *Q) Does constructor return any value?
Yes, it is the current class instance (You cannot use return type yet it returns a value).

Can constructor perform other tasks instead of initialization?
Yes, like object creation, starting a thread, calling a method, etc. You can perform any operation in the constructor as you perform in the method.

Is there Constructor class in Java?
Yes.

What is the purpose of Constructor class?
Java provides a Constructor class which can be used to get the internal information of a constructor in the class. It is found in the java.lang.reflect package.


 */
public class praticalsAboutConstructor {
	
	public static void main(String args[]) {
		/*test1 obj= new test1();
		obj.display();*/
		/*test2 obj1=new test2("Mehar");
		test2 obj2=new test2("Shyam",(byte) 23);
		test2 obj3 =new test2("Srinu",(byte)25,(float)50000.00);
		obj1.display();
		obj2.display();
		obj3.display();*/
		//By constructor
		//test3 obj4= new test3(28,3);
		//test3 obj5=new test3(obj4);
		//obj5.display();
		//Copying values without constructor
		//test4 obj6= new test4(65,25);
		//test4 obj7=new test4();
		//obj7.num=obj6.num;
		//obj7.result=obj6.result;
		//obj7.display();
	      /*byte a = 10;   
	        long b = 15;  
	        Test6 test1 = new Test6(a,b);*/
	        //Test7 test = new Test7();   
	       // System.out.println(test.test_a+" "+test.test_b); 
	}

}

class test1{
	private String name;
	private byte age;
	private Object address;
	public void display() {
		System.out.println("Name :"+name + "  "+ "age :"+ age+ "   "+" Address :"+address);
	}
}

//Constructor Overloading
class test2{
	private String name;
	private float salary;
	private byte age;
	
	test2(String names){
		name=names;
	}
	test2(String names,byte ages){
		name=names;
		age=ages;
	}
	test2(String name, byte age, float salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	void display() {
		System.out.println("Name  :"+name+"   age   :"+age+"   salary  : "+salary);
	}
}
//Java Copy Constructors 
/*
 * There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in Java. They are:

By constructor
By assigning the values of one object into another
By clone() method of Object class
 */
//By constructor
class test3{
	private int num;
	private int result;
	//constructor
	test3(int n,int r){
		num=n;
		result=r;
	}
	//constructor
	test3(test3 t){
		num=t.num;
		result=t.result;
	}
	void display() {
		System.out.println("num :"+num+"  result :"+result);
	}
}
//Copying values without constructor
class test4{
	public int num;
	public int result;
	//constructor
	test4(int n,int r){
		num=n;
		result=r;
	}
	//constructor
	test4(){
		
	}
	void display() {
		System.out.println("num :"+num+"  result :"+result);
	}
}
//doubts
class Test6  
{  
    Test6(int a, int b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    Test6(int a, float b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
      
}  

class Test7   
{  
    int test_a, test_b;  
    Test7(int a, int b)   
    {  
    test_a = a;   
    test_b = b;   
    }  
    
        
   
}  
 
