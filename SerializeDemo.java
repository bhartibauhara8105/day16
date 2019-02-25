package com.day16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		Employee100 e=new Employee100();
		e.name="Anamika Das";
		e.address="Netaji Nagar,Agra";
		e.SSN=11122333;
		e.number=101;
		try
		{
			FileOutputStream fileout=new FileOutputStream("D:/temp/employee100.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileout);
			out.writeObject(e);
			out.close();
			fileout.close();
			System.out.printf("serialized data is saved in employee100.ser");
			
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}

	}

}
