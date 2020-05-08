package overriding_in_java;
class A
{ 
	 int i=10;
	public void show()
	{
		System.out.println("In A");
	}
	
}
class B extends A
{
	 int i = 9;
	@Override // if we use this we will get a compile time error if we made any mistake
	public void show()
	{
		System.out.println(super.i);
		super.show(); //super is a keyword it is used to represent a method in parent class
		System.out.println("in B");
		System.out.println(i);
	}
	
}

public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1 = new B(); //when we create object of sub class it also gives constructor of superclass
		obj1.show();//child class method overriding method of its parent

	}

}
