class area
{
	public void findArea( )
	{
		System.out.println("we are in base class method");
	}
	
}
class square extends area
{
	public void findArea(int a)
	{
		System.out.println("The area of Suuare is" + a);
	}
}




public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area ref = new square();
		ref.findArea();

	}

}
/* Dynamic method dispatch is a mechanism in which call to an overridden function is resolved during runtime 
 * Requirements for dynamic method dispatching are 
 *     
 */