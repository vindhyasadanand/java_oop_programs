package staticmember_and_memberfunction_2;

public class StaticDemo {
	int a=10;
	void display()
	{
		System.out.println("this is demo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//now in order to access these variable and function we need to create an instance of that class
		StaticDemo obj = new StaticDemo();
		//if variables and methods are not static we need to create an instance and using that instance we are accessing it
		System.out.println(obj.a);
		obj.display();

	}

}
