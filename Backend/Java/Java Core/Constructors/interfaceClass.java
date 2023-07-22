package Constructors;
class base implements A{

	@Override
	public Object method2() {
		// TODO Auto-generated method stub
		A obj= new base();
		return obj;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("general abstract method defined");
	}
	
}
public class interfaceClass {
	public static void main(String []a) {
		base bs=new base();
		Object ob=bs.method2();
		System.out.println("base object with interface A :"+ob);
		bs.method4(3,121,28);
		A.method1();
	}

}
interface A{
	//by default all fields are implicity public static final
	String name="Shyam Sundhar";
	 String job="Software Developer";

	//interfaces do not have constructors
	 
	 //by default all methods are public
	static void method1() {
		System.out.println("Static method has body in interface");
		System.out.println("name :"+A.name+ "   job :"+A.job);
	}
	Object method2();
	abstract void method3();
	
	 default void method4(int... favNumbers) {
		 int favNum=0;
		 for(int Num : favNumbers) {
			 favNum+=Num;
		 }
		 System.out.println("my favorite numbers :"+ favNum);
	}
	 
}
