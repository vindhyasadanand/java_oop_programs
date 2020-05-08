package overloding_concepts;

class A
{
	A()
	{
	  System.out.println("Constructor without arguments");	
	}
	A(int a)
	{
		System.out.println("Constructor with arguments");
	}
}
public class coverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
	    A obj1 = new A(1);
	}

}
