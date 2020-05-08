// wrapper classes 
//for every primitive values we have classes in java 
//Integer,float,Double,Character these are the classes that we are having for primitive values in java
public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		Integer ii = new Integer(i);//concept of putting a primitive value inside an object is called as boxing
		Integer jj = 1; //auto boxing
		int j = jj.intValue(); //getting an integer value from an object is termed as unboxing
		int k = jj;
	}

}
// in our program sometimes we can come accross working with numbers using objects.
//all 8 primitive data types in java along with classess associated with them called wrapper classes. these are called wrapper classes because they wrap primitive data types and give us an object of it.
//converting a primitive data type to an object is called as boxing it is automatically done by compiler called as boxing
//when we convert an object to primitive datatype it is called as unboxing