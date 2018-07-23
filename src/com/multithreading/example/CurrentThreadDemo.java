package com.multithreading.example;

// controlling the main thread

public class CurrentThreadDemo {
	
	public static void main (String args[])
	{
		Thread t= Thread.currentThread();
		System.out.println("Current thread: "+t);
		// This displays, name of the thread, its priority, and name of its group
		// Its priority is 5, which is default value.
		//change the name of the thread
		
		t.setName("My Thread");
		System.out.println("After name change: "+t);
		// This displays, name of the thread, its priority, and name of its group
		// Its priority is 5, which is default value.

		
		try
		{
			for(int n=5; n>0; n--)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			System.out.println("Main thread interrupted.");
		}
		
		
		
	}

}
