package lab_program1;
import java.util.*;
import java.io.*;

public class student {

		private String usn,name,pgm;
		private int ph;
		private static Scanner sc;
		public static void initialie_scanner()
		{
			
			sc = new Scanner(System.in);
			
		}
		public void accept()
		{
			System.out.println("Enter usn");
			usn = sc.next();
			System.out.println("Enter name");
			name = sc.next();
			System.out.println("Enter program");
			pgm = sc.next();
			System.out.println("Enter phonenumber");
			ph = sc.nextInt();
		}
		public void display() {
			System.out.println("USN:"+ usn);
			System.out.println("Name:"+name);
			System.out.println("Programme:"+pgm);
			System.out.println("Phone number:"+ph);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		student.initialie_scanner();
		System.out.println("Enter the number of students");
		n = sc.nextInt();
		student a [] = new student[n];
		for(i=0;i<n;i++)
		{
			a[i]=new student();
			a[i].accept();
		}
		for(i=0;i<n;i++)
		{
			a[i]=new student();
			a[i].accept();
		}
		for(i=0;i<n;i++)
		{
		
			a[i].display();
		}
	}

}
