package thread_methods;


class Single extends Thread
{
	//we are overriding run method from Thread class
	public void run()
	{
	   System.out.println("implementing Threads");
	}
}
public class test {

	public static void main(String[] args) {
        // create an instance for derived class
         Single th = new Single(); 		
       Single th1= new Single(); 
  //it will give id of the current thread
 System.out.println("ID of this thread will be=" + th.getId());
   //it will give current thread name
   System.out.println("Name of the first Thread:" +th.getName());     System.out.println("Name of the second Thread:" +th1.getName());
        //we can set current thread name
		th.setName("Student"); 	
//to check modified thread name we are using it 
  System.out.println("Thread name after changing:"+th.getName());
    //to check priority of the current thread
 	System.out.println("Priority of thread:"+th.getPriority());
// to set priority of the thread
		th.setPriority(4);
     System.out.println("thread priority after    changing:"+th.getPriority());
		th.start(); 
}
}
