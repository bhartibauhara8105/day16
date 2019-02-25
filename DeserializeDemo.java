package com.day16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws Exception {
		Employee100 e=null;
		try
		{
			FileInputStream fileIn=new FileInputStream("D:/temp/employee100.ser");
			ObjectInputStream in=new ObjectInputStream(fileIn);
			e=(Employee100) in.readObject();
			in.close();
			fileIn.close();
			
		}
		catch(IOException i)
		{
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("employee class nort found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee100");
		System.out.println("Nmae : "+e.name);
		System.out.println("Address : "+e.address);
		System.out.println("SSN : "+e.SSN);
		System.out.println("Number: "+e.number);

	}

}
