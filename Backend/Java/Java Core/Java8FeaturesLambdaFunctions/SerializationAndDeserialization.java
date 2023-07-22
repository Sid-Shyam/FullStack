package com.NPT.java8FeaturesLambdaExpressions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String brand;
	int num;
   transient String color; // to avoid the color  to be serializable.
	public Car(String brand,int num,String color) {
		this.brand=brand;
		this.num=num;
		this.color=color;
	}
	public String ToString() {
		return this.brand+ " "+ this.num + " "+ this.color;
		
	}
	
}
public class SerializationAndDeserialization {

	public static void main(String[] args) {
		Car car = new Car("SMS",143,"Black");
		//Serialization
		try {
		FileOutputStream fileOutput= new FileOutputStream("Cars.txt");
		ObjectOutputStream objectOutput= new ObjectOutputStream(fileOutput);
		objectOutput.writeObject(car);
		System.out.println("Succesful Serialization process");
		objectOutput.close();
		fileOutput.close();
		}
		catch(IOException i) {
			i.printStackTrace();
		}
		//DeSerialization
		try {
			FileInputStream fileInput= new FileInputStream("Cars.txt");
			ObjectInputStream objectInput= new ObjectInputStream(fileInput);
			Car carobject=(Car)objectInput.readObject();
			System.out.println(carobject);
			System.out.print("Sucessful Deserialization process");
			objectInput.close();
			fileInput.close();
		}
		catch(IOException | ClassNotFoundException i) {
			i.printStackTrace();
		}
		
	}
}
