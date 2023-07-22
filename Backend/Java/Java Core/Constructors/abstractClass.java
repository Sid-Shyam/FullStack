package Constructors;

public class abstractClass extends classA {

	abstractClass() {
		super();
		System.out.println("abstractclass constructor called");
	}
	public static void main(String []a) {
		
		classA obj=new abstractClass();
		classA ob=(classA)obj;//upcasting
		obj.display(ob);
		classA.method1();
	}
	@Override
	 void display(classA ob) {
		// TODO Auto-generated method stub
		System.out.println(ob.dream);
	}
	
	
}

abstract class classA{
	//Fields
	protected String name;
	protected final String job="Software";
	private byte favNum;
	protected String dream;

	//Constructors
	public classA() {
		this("shyam");
		System.out.println("Default constructor");
		
	}
	void display() {
		// TODO Auto-generated method stub
		
	}
	protected classA(String name) {
		this("shyam","Software",(byte)3,"Bussiness");
		this.name=name;
		System.out.println("My Name : "+name);
	}
	private classA(String name,String job,byte favNum,String dream) {
		this.name=name;
		this.dream=dream;
		this.setFavNum(favNum);
		System.out.println("All abot myself");
		
	}
	//Methods
	public static void method1() {
		System.out.println("Static method");
	}
	public byte getFavNum() {
		return favNum;
	}
	public void setFavNum(byte favNum) {
		this.favNum = favNum;
	}
	abstract void display(classA obj);
}