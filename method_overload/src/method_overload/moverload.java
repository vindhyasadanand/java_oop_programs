package method_overload;
class A
{
	void add()
	{
		int a =10, b=10;
		int c = a+b;
		System.out.println("sum =" + c);
		
	}
	void add(int x,int y)
	{
		 int z = x+y;
		System.out.println(" Sum = " +z);
	}
}
public class moverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.add();
		obj.add(40,50);

	}

}
