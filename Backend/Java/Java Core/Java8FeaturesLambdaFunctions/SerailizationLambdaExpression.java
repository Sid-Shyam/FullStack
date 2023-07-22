package com.NPT.java8FeaturesLambdaExpressions;
/*
 * Here we will be discussing serialization in java and the problems related to the lambda function without the serialization alongside discussing some ways due to which we require serialization alongside proper implementation as in clean java programs with complete serialization and deserialization process using the function interface.

Serialization is a process for writing the state of an object into a byte stream so that we can transfer it over the network. 
We can serialize a lambda expression if its target type and its captured arguments have serialized. 
However, like inner classes, the serialization of lambda expressions is strongly discouraged.
 As the lambda function is not serialized by default we simply have to cast our lambda to java.io.Serializable.
  But the submit method requires a Runnable or Callable as the parameter, not a Serializable. 
  So, we have to cast the lambda to two interfaces at the same time Runnable and Serializable.
  Java Serialization is a good generalized, backwardly compatible serialization library. 
  Two of the most common problems that alternatives try to solve are performance and cross-platform serialization.
 
 *
 *Note: There occurs a necessity to serialize a lambda function because Serializing lambdas can be useful in a number of use cases such as persisting configuration,
 * or as a visitor pattern to remote resources.
 */
/*
 * Say We want to access a resource on a remote Map. We can use get/put, but say we just want to return a field from the value of a Map: we can pass a lambda as a visitor to extract the information we want. As you can see, it is easy to add various simple functions, or call a method to perform the action you need. The only problem is that lambdas by default are not serializable.
 */
// Java Program to serialize and deserialize the lambda
//function using a function interface
//importing the input output classes

 import java.io.*;
 //importing the all function utility classes
 import java.util.function.*;
 // interface
 interface MyInterface{
	 void hello(String name);
 }
 //Helper class implementing above interface
 class Myclass implements MyInterface{
	 public void hello(String name) {
		 System.out.println("Hello  "+name);
	 }
 }
 //Main class 
 
public class SerailizationLambdaExpression {

	//Serialization
	private static void serialize(Serializable obj, String outputpath) throws IOException {
		File outputFile= new File(outputpath);
		if(!outputFile.exists())
			outputFile.createNewFile();
		try (ObjectOutputStream object= new ObjectOutputStream(new FileOutputStream(outputFile))){
			object.writeObject(obj);
			
		}
	}
	
	//Deserialization
	private static Object deserialize(String inputpath)throws IOException, ClassNotFoundException{
		File inputFile=new File(inputpath);
		try(ObjectInputStream objectIN= new ObjectInputStream(new FileInputStream(inputFile))){
			return objectIN.readObject();
		}
	}
	//to serialize and deserialize lambda functions
	private static void SerializeAndDeserializeFunction() throws Exception{
		Function<Integer,String> fn = (Function<Integer,String> & Serializable)(n)->"Hello "+n;
		System.out.println("The Original Function :"+fn.apply(28));
		String path="./serialized-fn";
		serialize((Serializable)fn,path);
		System.out.println("Serialized function path : "+path);
		Function<Integer,String>deserializedFn=(Function<Integer,String>)deserialize(path);
		System.out.println("DeSerialized function path : "+path);
		System.out.println("Run Deserialized function : "+deserializedFn.apply(11));
		
	}
	//to serialize and deserialize lambda classes
	private static void SerializeAndDeSerializeClass() throws Exception{
		String path="./serialized.class";
		serialize(Myclass.class, path);
		System.out.println("Serialized class to "+path);
		 // Pretending we don't know the exact class of the
        // serialized bits, create an instance from the
        // class and use it through the interface.
		Class<?> myImplClass=(Class<?>)deserialize(path);
		System.out.println("DeSerialized class to"+path);
		@SuppressWarnings("deprecation")
		MyInterface instance= (MyInterface)myImplClass.newInstance();
		instance.hello("java");
		}
	public static void main(String[] args) throws Exception {
		SerializeAndDeserializeFunction();
		SerializeAndDeSerializeClass();
	}
}
