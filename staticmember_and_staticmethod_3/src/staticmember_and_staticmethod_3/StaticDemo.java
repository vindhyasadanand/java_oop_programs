package staticmember_and_staticmethod_3;

 public class StaticDemo {
	static int a =10;
	static void display()
	{
		System.out.println("this is demo");
	}

}
class Demo{
	public static void main(String [] args) {
		//if  member function and data members are present in different class we need to access using class name
		System.out.println(StaticDemo.a);
		StaticDemo.display();
		
	}
}