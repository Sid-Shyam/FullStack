package Constructors;

public class experiment2 {
experiment2(Object obj){
	System.out.println("Object");
}
experiment2(experiment2 exp){
	System.out.println("parameter");
}
public static void main(String[] a) {
	experiment2 obj=new experiment2(new experiment2(""));
	System.out.println(obj.getClass().getName());
	experiment2 obj1= new experiment2(obj);
}
}
