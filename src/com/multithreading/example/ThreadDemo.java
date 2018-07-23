package com.multithreading.example;

// Create a second thread

class NewThread implements Runnable
{
	Thread t;
	
	NewThread()
	{
		// create a new, second thread
		t=new Thread(this,"Demo thread");
		System.out.println("Child Thread: "+ t);
		t.start();
	}
	
	//This is the entry point for the second thread
	
	public void run()
	{
		try
		{
			for (int i=5; i>0; i--)
			{
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
	
}


public class ThreadDemo {
	
	public static void main (String args[])
	{
		new NewThread();
		//Create a new thread
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
			System.out.println("Main thread interruptd.");
		}
		System.out.println("Main thread exist.");
	}

}
