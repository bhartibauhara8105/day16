package com.day16;

public class MultithreadingDemo extends Thread {
	public void run()
	{
		try
		{
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e)
		{
			System.out.println("exception is caught");
		}
		
	}

}
