package com.multithreading.example;

// Create multiple threads.

class NewThread2 implements Runnable{
	String name; // name of thread
	Thread t;
	NewThread2(String threadname)
	{
		name=threadname;
		t=new Thread(this, name);
		System.out.println("New thread: "+t);
		t.start(); // start the thread
	}
	
	// This is the entry point for thread
	public void run()
	{
		try
		{
			for(int i=5; i>0;i--)
			{
				System.out.println(name+": "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(name+ "Interrupted");
		}
		System.out.println(name+ "Exiting.");
		
	}
	
}

public class MutlipleThread {
	public static void main (String args[])
	{
		new NewThread2("One"); // start thread
		 new NewThread2("Two");
		 new NewThread2("Three");
		 try
		 {
			 // wait for other threads to end
			 Thread.sleep(10000);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Main Thread Interrupted");
		 }
		 System.out.println("Main Thread exiting.");
		
		
	}

}
