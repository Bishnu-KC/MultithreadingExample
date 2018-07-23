package com.multithreading.example;

// Using join() to wait for threads to finish

class NewThread3 implements Runnable {
	String name; // name of thread
	Thread t;
	NewThread3(String threadname)
	{
		name=threadname;
		t=new Thread(this, name);
		System.out.println("New thread: "+t);
		t.start(); // Start the thread
	}
	
	// this is the entry point for thread.
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name +":"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(name +"interrupted.");
		}
		System.out.println(name +"exiting.");
	}
}

public class IsAliveJoin {
	public static void main(String args[])
	{
		NewThread3 a=new NewThread3("One");
		NewThread3 b=new NewThread3("Two");
		NewThread3 c=new NewThread3("Three");
		System.out.println("Thread one is alive: "+a.t.isAlive());
		System.out.println("Thread two is alive: "+b.t.isAlive());
		System.out.println("Thread three is alive: "+c.t.isAlive());
		
		// wait for threads to finish
		
		try
		{
			System.out.println("Waiting for threads to fininsh.");
			a.t.join();
			b.t.join();
			c.t.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Thread one is alive: "+a.t.isAlive());
		System.out.println("Thread two is alive: "+b.t.isAlive());
		System.out.println("Thread three is alive: "+c.t.isAlive());
		System.out.println("Main thread Exiting.");
		
	}

}
