import java.util.Scanner;

import linked_list.list;
import linked_list.node;
class node
{
	public int info;
	public node next;//next is a reference of type node
	//next is not an object of type node
	public node first;
}

public class dll {
	
	public class dll{
		private node root;
		private static Scanner sc;
		//function to accept the element to be inserted
		public static void i_s()
		{ 
			//this method we are initializing scanner
			
			sc = new Scanner(System.in);
			
		}
		public dll()
		{
			first=null;
		}
		public void i_f()
		{
			node t = new node();//it will allocate memory on heap
			
			t.info = sc.nextInt();
			//sc is a static member of list class we are accessing sc from member function
			//i_f() is a member function f class list
			//hence we are accessing sc inside member function no class name is required
			t.next = null;
			t.first =null;
			if(this.first==null)
			{
				first = t;
				
			}
			else
			{
				t.next=first;
				first=t;
			}
			
		}
		public void disp()//static keyword is not there so it is a member function
		{
			if(first==null)
			{
				return;
			}
			System.out.println("element inserted is");
			for(node t = root; t!=null;t=t.next)
			{
				//there is no arrow operator so we are using . operator
				System.out.println(t.info);
			}
			
		}
		
	}

	 class test
	{
		public static void main( String [] args)
		{
			list.i_s();//i_s() is a static member function we need to call those using class name
			//we can also call static member function using objects
			list l =new list();
			l.i_f();
			l.i_f();
			l.i_f();
			l.disp();
					
		}
	}

