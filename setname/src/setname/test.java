package setname;

//creation of single thread using inheritance 
class Single extends Thread
{
	//we are overriding run method from Thread class
	public void run()
	{
		
		 
		System.out.println("We are implementing Threads using inheritance concept");
		for(int i=0; i<=5;i++)
		{
			
			System.out.println(i);
		}
		
	}
}

public class test {

	public static void main(String[] args) {
		Single th = new Single(); //we are creating an instance for derived class
		System.out.println("Name of the first Thread is:" + th.getName()); //it will give current thread name
		th.setName("vindhya"); //it will set the current thread name
		System.out.println("Name of the first Thread afer changing is:" + th.getName()); //to check modified thread name we are using it 
	    th.start(); 
		
		
		
}

}
