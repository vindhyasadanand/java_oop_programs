package threads_using_interface;
class Single implements Runnable
{
	public void run()
	{
		System.out.println("we are implementing single thread using interface");
	}
	 
}

public class test {

	public static void main(String[] args) {
		Single th  = new Single(); //we created object which implements runnable interface
		Thread t = new Thread(th); // we need to pass object of runnable interface to the thread class
		t.start();
		
		
	}

}
