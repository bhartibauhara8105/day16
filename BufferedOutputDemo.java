package com.day16;
import java.io.*;
public class BufferedOutputDemo {

	public static void main(String[] args) throws Exception {
		
      FileOutputStream fout=new FileOutputStream("D:/bharti/f1.txt");
      BufferedOutputStream bout =new BufferedOutputStream(fout);
      String s="Mahi is my favourite player ";
      byte b[]=s.getBytes();
        bout.write(b);
      bout.flush();
      bout.close();
      fout.close();
      System.out.println("success");
	}

}
