import java.util.*;

//import linked_list.node;


 class node
{ 
	 public int info;
	public  node first;
	public node next;
	 
	
}

public class dll {
	private node root;
	private static Scanner sc;
	public static void i_s()
	{
		sc = new Scanner(System.in);
	}
	public dll()
	{
		root =null;
	}
	public void i_f()
	{
		node t = new node();
		t.info = sc.nextInt();
		t.next = null;
		t.first =null;
		if(root==null)
		{
			root =t ;
		}
		else
		{
			t.next = root;
			root =t;
		}
	}
	void disp()
	{
		for(node t = root; t!=null;t=t.next)
		{
			System.out.println(t.info);
		}
	}
}	
	


class test
{
	public static void main( String [] args)
	{
		dll.i_s();//i_s() is a static member function we need to call those using class name
		//we can also call static member function using objects
		dll l =new dll();
		l.i_f();
		l.i_f();
		l.i_f();
		l.disp();
				
	}
}