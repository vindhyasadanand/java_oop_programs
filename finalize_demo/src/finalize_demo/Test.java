package finalize_demo;
class temp
{
	protected void finalize()
	{
		System.out.println("in finalize method");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp r  = new temp();
		r =null;
	//	System.gc();

	}

}
