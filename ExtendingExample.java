package com.day16;
class Count extends Thread
{
	Count()
	{
	  super("my extending thread");
	  System.out.println("mythread created "+this);
	  start();
	  
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("printing the count "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("my thread intrrupted");
		}
		System.out.println("mythread run is over");
	}
}
public class ExtendingExample {

	public static void main(String[] args) {
		Count cnt=new Count();
		try
		{
			while(cnt.isAlive())
			{
				System.out.println("main thread will be alive till child 5thread is live");
				Thread.sleep(1500);
			}
			
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread is interrupted");
		}

	}

}
