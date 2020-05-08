package join_method;


class Single extends Thread
{
	//we are overriding run method from Thread class
	public void run()
	{
		
	 Thread t = currentThread();
      //to display thread status
	System.out.println("current thread status:"+t.isAlive());
		for(int i=0; i<=5;i++)
		{
			
			try
			{
				t.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(i);
		}
		
	}
}

public class test {

	public static void main(String[] args) {
		Single th = new Single(); //we are creating an instance for derived class
		th.start(); 
	}

}
