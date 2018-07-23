package com.multithreading.example;

//Demonstrate thread priorities.

class Priority implements Runnable{
	int value=0;
	Thread t;
	private volatile boolean running=true;
	public Priority(int p)
	{
		t=new Thread(this);
		t.setPriority(p);
	}
	public void run()
	{
		while(running)
		{
			value++;
		}
	}
	public void stop()
	{
		running=false;
	}
	public void start()
	{
		t.start();
	}
}

public class ThreadPriorities {
	public static void main(String args[])
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Priority p=new Priority(Thread.NORM_PRIORITY +2);
		Priority p1=new Priority(Thread.NORM_PRIORITY -2);
		p.start();
		p1.start();
		try
		{
			p.t.join();
			p1.t.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Low Priority thread: "+p1.value);
		System.out.println("High Priority thread: "+p.value);
	}

}
