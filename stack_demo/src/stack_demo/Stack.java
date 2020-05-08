package stack_demo;
import java.util.*;
import java.io.*;
public class Stack
{
	private int top,a[],sz;
	private static Scanner sc;
	Stack()
	{
		top =-1;
		System.out.println("enter the size");
		sz = sc.nextInt();
		a = new int[sz];
	}
	public static void initialize_scanner()
	{
		sc = new Scanner(System.in);
	}
	public void push()
	{
		int info;
		if( top==sz-1)
		{
			System.out.println("stack is full");
			return;
		}
		System.out.println("enter info");
		info = sc.nextInt();
		top++;
		a[top] = info;
		
		
	}
	public void pop ()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Element deleted is"+ a[top] );
		top--;
		
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			return;
		}
		System.out.println("Contents of stack are");
		for(int i=top;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack.initialize_scanner();
		Stack st = new Stack();
		int ch;
		for(;;)
		{
			System.out.println("1.push\n 2.pop\n 3.Display\n 4.exit\n");
			System.out.println("Choice");
			ch = sc.nextInt();
			
			switch(ch)
			{ 
				case 1: st.push();
		        break;
				case 2: st.pop();
		        break;
				case 3:st.display();
		        break;
				case 4:return;  
		 		
		}
		
		  
	}	
		
}

}
