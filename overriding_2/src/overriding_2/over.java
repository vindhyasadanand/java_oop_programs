package overriding_2;
class parent
{
	void display()
	{
		System.out.println("parent");
	}
}
class child extends parent
{
	void display()
	{
		super.display();
		System.out.println("child");
	}
}

public class over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c = new child();
		c.display();

	}

}
//if we are not writing any display method in child and we are calling display method using child class reference then parent class display will be printed
//super method is used to access instance variables or methods  of a immediate parent