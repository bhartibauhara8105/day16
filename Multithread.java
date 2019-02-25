package com.day16;

public class Multithread {

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++)
		{
			MultithreadingDemo object=new MultithreadingDemo();
			object.start();
		}
		System.out.println("this is main thread");

	}

}
