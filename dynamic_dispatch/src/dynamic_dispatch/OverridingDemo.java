package dynamic_dispatch;
class A
{
	public void show()
	{
		System.out.println("in A");
	}
	
}
class B extends A
{
	public void show()
	{
		System.out.println("in B");
	}
	public void config()
	{
		System.out.println("in config");
	}
}
class c extends A
{
	public void show()
	{
		System.out.println("in c");
	}
}
public class OverridingDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1 = new B();//it will link during runtime
		obj1.show();//since we are assigning object during runtime,which show it should call also decided at run time
		//so we are deciding it in runtime this is called as runtime polymorphism
		//method overriding is called as runtime polymorphism
		obj1 = new c();
		obj1.show(); //it is called as dynamic method dispatch
		//to achieve dynamic method dispatch we need to follow dynamic method dispatch
		//here once we change object it is changing call it is known as dynamic method dispatch
		
	}

}
/*Dynamic dispatching / Runtime polymorphism : it is a process in which a call to an overridden method is resolved 
   at runtime rather than in compile time 
   in this an overridden method is called throurh reference variable of a superclass */