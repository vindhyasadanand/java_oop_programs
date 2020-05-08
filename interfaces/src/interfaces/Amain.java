package interfaces;
interface A
{
	public static final int salary = 5;
	 void Adisplay();//abstract method we are writing its definition in other class which implements this interface
	 
}
interface B
{
	 void Bdisplay();//interfaces should always contain abstract methods
}
class AB implements A,B
{
	public void Adisplay()
	{
		System.out.println("we are inside class AB");
	}
	public void Bdisplay()
	{
		System.out.println("we are inside class AB to implement interface B");
	}
}

public class Amain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB obj = new AB();
		obj.Adisplay();
		obj.Bdisplay();

	}

}
