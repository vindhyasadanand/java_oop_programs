package abstract_methods_and_class;
abstract class A
{
	abstract void display(); //this is an abstract method because only declaration is present and implementation is not present
	
}
abstract class B extends A
{
	 //this is concrete class we can create an object for this
	void display()
	{
		System.out.println("class A");
		
	}
	abstract void show();
}
class C extends B
{
	void show()
	{
		System.out.println("class B");
	}
}
public class abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.display();
		obj.show();

	}

}
