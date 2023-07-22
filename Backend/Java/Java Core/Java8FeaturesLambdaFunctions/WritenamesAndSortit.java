package com.NPT.java8FeaturesLambdaExpressions;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//java program that demonstrates to write and read the names and sort it according to alphabetical order
public class WritenamesAndSortit {

	
	public static void main(String [] args) throws IOException, ParseException {
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat simpledate= new SimpleDateFormat("dd/MM/yyyy");
		String file="E:\\FullStack\\file.txt";
		FileOutputStream filePath= new FileOutputStream(file,true);
		BufferedOutputStream output = new BufferedOutputStream(filePath);
		while(true) {
			System.out.println("Enter your name or (to exit the program enter 'quit' ):");
			String name= reader.readLine();
			if(name.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Enter your Birthday dd/MM/yyyy");
			String BirthDay= reader.readLine();
			
			Date birthday=simpledate.parse(BirthDay);
			
			output.write(name.getBytes());
			//output.write(System.lineSeparator().getBytes());
			//convert the date into String data type in order to write in a file
			String formatBirthday= simpledate.format(birthday);
			output.write(formatBirthday.getBytes());
			output.write(System.lineSeparator().getBytes());
			
		}
	// closing the output and buffered reader after completion of program
		output.close();
		 reader.close();
	}
	
}
