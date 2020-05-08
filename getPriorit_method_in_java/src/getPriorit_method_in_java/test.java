package getPriorit_method_in_java;

class Single extends Thread
{
	//we are overriding run method from Thread class
	public void run()
	{
		
		 
		System.out.println("We are implementing Threads using inheritance concept");
		
		
		
		
	}
}

public class test {

	public static void main(String[] args) {
		Single th = new Single(); //we are creating an instance for derived class
		
		System.out.println("Priority of thread is:"+ th.getPriority());//we are checking priority of the current thread
		th.setPriority(4);

		System.out.println("Priority of thread after changing is:"+ th.getPriority());//we are checking priority of the current thread
		
		th.start(); 
		
		
		
}

}
