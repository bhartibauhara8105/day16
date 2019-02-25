package com.day16;

public class Employee100 implements java.io.Serializable {
  public String name;
  public String address;
  public transient int SSN;//social security number
  public int number;
  public void mailCheck()
  {
	  System.out.println("maining a check to"+name+" "+address);
  }
}
