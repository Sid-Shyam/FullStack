/**
 * 
 */
package com.NPT.java8FeaturesLambdaExpressions;

/**
 * 
 */

interface Test {
	void display(String name, Integer num);
}
public class TestTheLambdaExpressions {
	//public void show(Test t,String name,Integer num) {t.display(name, num);}
	/**
	 * @param args
	 */
	interface Test2{
		void cal();
	}
	int number=2;
	int value=5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTheLambdaExpressions obj= new TestTheLambdaExpressions();
		//obj.show((name,num)-> System.out.println(name+ " "+num),
		//		"Shyam",3);
		Test2 test=()->{
			System.out.println("Multiplication :"+obj.number*obj.value);
			obj.number++;
			obj.value+=3;
			System.out.println("Addition :"+obj.number+obj.value);
		};
		test.cal();
		System.out.println(obj.number);
		System.out.println(obj.value);
		Test ob=(name,num)->{
			System.out.println(name+" "+num);
		};
		ob.display("Shyam", 5);
	}

}
