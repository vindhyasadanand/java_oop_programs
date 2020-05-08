package single_thread_using_inheritence;

class Single extends Thread
{
	//we are overriding run method from Thread class
	public void run()
	{
  System.out.println("implementing Threads using inheritance");
     }
}

public class test
 {

	public static void main(String[] args)
     {
		Single th = new Single(); 
          //we created an instance for derived class
		th.start(); 
	}
}
