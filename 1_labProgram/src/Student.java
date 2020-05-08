
import java.util.*;
import java.io.*; 
 
class Student {    
	private String usn,name,pgm;  
	private int ph;   
	private static Scanner sc;   
public static void initialize_scanner()    
{   
	sc = new Scanner(System.in);    
}   

public void accept()   
{         System.out.println("Enter usn");        
	usn = sc.next();         
	System.out.println("Enter Name");        
	name = sc.next();         
	System.out.println("Enter programme");     
	pgm = sc.next();         
	System.out.println("Enter phone number");       
	ph = sc.nextInt();   }  

public void display() 
{        
	System.out.println("USN :"+usn);         
	System.out.println("Name :"+name);      
	System.out.println("Programme :"+pgm); 
	System.out.println("Phone number :"+ph);    
} 

}
public static void main(String args[])   
{     
	int n,i;      
	Student.initialize_scanner();      
	System.out.println("Enter value for n");    
	n = sc.nextInt();         
	Student a[] = new Student[n];       
	for(i=0;i<n;i++)      
	{          
		a[i] = new Student();          
		a[i].accept();      
	}        
	for(i=0;i<n;i++) 
	{
		a[i].display();
	} 
}	




