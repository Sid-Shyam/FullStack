package Constructors;

public class experiment1 {
	

	 experiment1() {
	       System.out.println("Calling default constructor");	 
	 }
	 experiment1(experiment1 test) {
	      System.out.println("Calling parameterized constructor");	  
	 }
	public static void main(String[] args) 
	{
		experiment1 t = new experiment1(new experiment1());
	 }
	
}
