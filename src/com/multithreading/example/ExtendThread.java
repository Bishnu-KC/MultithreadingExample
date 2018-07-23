package com.multithreading.example;

//Creating a thread using Thread class
class NewThread1 extends Thread{
	
	NewThread1()
	{
		// create a new, second thread
		super("Demo Thread");
		System.out.println("Child threads: "+this);
		start();
		// Start the thread
	}
	
	// This is a entry point for the second thread.
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}

public class ExtendThread {
	
	public static void main(String args[])
	{
		// create a new thread
		new NewThread1();
		try
		{
			for(int i=5; i>0;i--)
			{
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main Thread Exiting." );
		
		
	}

}
