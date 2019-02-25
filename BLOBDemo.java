package com.day16;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BLOBDemo {

     Connection con;
     PreparedStatement pstmt;
     ResultSet rs;
	
	  void createConnection()
	  {
		  try
		  {
			  Class.forName("com.mysql.jdbc.Driver");
			  con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","root");
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	  }
	  public void writeBlob(int candidateId,String filename)
	  {
		  String updateSQL="UPDATE candidates SET resume=? WHERE id=?";
		  try
		  {
			  pstmt=con.prepareStatement(updateSQL);
			  File file=new File(filename);
			  FileInputStream input=new FileInputStream(file);
			  pstmt.setBinaryStream(1,input);
			  pstmt.setInt(2, candidateId);
			  System.out.println("Reading file "+file.getAbsolutePath());
			  System.out.println("Store file in the database");
			  pstmt.executeUpdate();
			  con.close();
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println("Exception is "+e);
		  }
	  }
	  public static void main(String [] args)
	  {
		  BLOBDemo bd1=new BLOBDemo();
		  bd1.createConnection();
		  bd1.writeBlob(133,"johndoe_resume.pdf");
		  
	  }

	

}
