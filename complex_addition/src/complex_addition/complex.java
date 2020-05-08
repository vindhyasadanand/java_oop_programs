package complex_addition;
import java.util.Scanner;
class cmp
{
	   private int r,i;
	  //In zero parameterized constructor
	 public cmp() {}
	 //this is two parameterized constructor
	 //constructors used to initialize the variables
	 public cmp(int p, int q) {
		 this.r = p;
		 this.i = q;
	 }
	 //to display contents
	 void display()
	 {
		 System.out.println( r + "+i" + i);
	 }
	 //now to add
	 public cmp add(cmp z) //z is a reference of type cmp
	 {
		cmp t = new cmp(); //this calls zero parameterized constructor
		t.r = this.r + z.r;
		t.i = this.i + z.i;
		return t;
	
	 }
}

public class complex {
	public static void main(String[] args) {
	cmp a = new cmp(1,2);
	cmp b = new cmp(3,4);
	cmp t = a.add(b);
	t.display();
	

	}

  
	
}

