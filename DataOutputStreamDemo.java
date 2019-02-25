package com.day16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args) throws IOException {
	try(DataOutputStream dout=new DataOutputStream(new FileOutputStream("file.dat")))
	{
		dout.writeDouble(1.1);
		dout.writeInt(55);
		dout.writeBoolean(true);
		dout.writeChar('4');
	}
	catch(FileNotFoundException ex)
	{
		System.out.println("cannot open  the output file");
		return;
	}
	try(DataInputStream din=new DataInputStream(new FileInputStream("file.dat")))
	{
		double a=din.readDouble();
		int b=din.readInt();
		boolean c=din.readBoolean();
		char d=din.readChar();
		System.out.println("Values"+a+" "+b+" "+c+" "+d);
	}
	catch(FileNotFoundException e)
	{
		System.out.println("cannot open the input file");
		return;
	}
	}

}
