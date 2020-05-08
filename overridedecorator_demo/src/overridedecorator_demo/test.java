package overridedecorator_demo;
class base
{
	protected int i;
}
class derived extends base
{
	@Override
	public String toString()
	{
		System.out.println("in derived class");
		return null;
		
	}
	
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new derived();
		obj.toString();
		//object is the supreme base class for all other cassess

	}

}
