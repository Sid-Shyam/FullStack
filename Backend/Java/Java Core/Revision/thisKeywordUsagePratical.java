package Revision;
/*
 * this keyword in Java
There can be a lot of usage of Java this keyword. In Java, this is a reference variable that refers to the current object.
*
*Usage of Java this keyword
Here is given the 6 usage of java this keyword.

1.this can be used to refer current class instance variable.
2.this can be used to invoke current class method (implicitly)
3.this() can be used to invoke current class constructor.
4.this can be passed as an argument in the method call.
5.this can be passed as argument in the constructor call.
6.this can be used to return the current class instance from the method.

 */
public class thisKeywordUsagePratical {
	public static void main(String [] args) {
		testForVariables obj= new testForVariables('S',(byte)5);
		obj.display();
	
		testForCurrentClassMethod obj1= new testForCurrentClassMethod();
		obj1.n();
		
		testForCurrentClassConstructor obj2= new testForCurrentClassConstructor();
		
	}
}

/*
 * 1) this: to refer current class instance variable
The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.

 */
class testForVariables{
	private char value;
	private byte value1;
	testForVariables(char value,byte value1){
		this.value=value;
		this.value1=value1;
	}
	void display() {
		System.out.println("Values :"+value+  "   "+value1);
	}
}

/*
 * 2) this: to invoke current class method
You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method. Let's see the example

 */
class testForCurrentClassMethod{
	  
		void m(){System.out.println("hello m");}  
		void n(){  
		System.out.println("hello n");  
		//m();//same as this.m()  
		this.m();  
		}  
		 
}
/*
 *  this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.

Calling default constructor from parameterized constructor:
 */

class testForCurrentClassConstructor{
	private int age;
	testForCurrentClassConstructor(){
		this(28);
		System.out.println("Default constructor called and accesed age value :"+this.age);
	}
	testForCurrentClassConstructor(int age){
		//this();
		System.out.println(age);
	}
}
/*
 * Real usage of this() constructor call
The this() constructor call should be used to reuse the constructor from the constructor. It maintains the chain between the constructors i.e. it is used for constructor chaining. Let's see the example given below that displays the actual use of this keyword.

class Student{  
int rollno;  
String name,course;  
float fee;  
Student(int rollno,String name,String course){  
this.rollno=rollno;  
this.name=name;  
this.course=course;  
}  
Student(int rollno,String name,String course,float fee){  
this(rollno,name,course);//reusing constructor  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class TestThis7{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit","java");  
Student s2=new Student(112,"sumit","java",6000f);  
s1.display();  
s2.display();  
}}  
 */
class Address{
	String street,District,State;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
}
class RealApplicationOfClassConstructor{
	int num;
	String name,email;
	Address obj;
	
}
