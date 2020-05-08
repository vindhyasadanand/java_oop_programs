package multilevel_inheritence_demo;
class person
{
	private String name;
	person(String s)
	{
	        setName(s);	
	}
	public void setName(String s)
	{
		name = s;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public String toString()
	{
		System.out.println("Name ="+name);
		return null;
		
	}
}
class Employee extends person
{
	private int empid;
	Employee(String sname, int id)
	{
		super(sname);//it calls the base class constructor
		setEmpid(id);
	}
	public void setEmpid(int id)
	{
		empid = id;
	}
	public int getEmpid()
	{
		return empid;
	}
	@Override
	public String toString()
	{ 
		super.toString(); //if we write only tostring then it will call same method recursively
		System.out.println("Empid ="+ empid);
		return null;
		
	}
	
}
class HourlyEmployee extends Employee
{
	private double hourlyRate;
	private int hoursWorked;
	HourlyEmployee( String name,int id,double hr,int hw)
	{
		super(name,id);
		hourlyRate = hr;
		hoursWorked = hw;
		
	}
	public double GetGrosspay()
	{
		return (hourlyRate*hoursWorked);
	}
	@Override
	public String toString()
	{
		super.toString();
		System.out.println("Hourly rate ="+ hourlyRate);
		System.out.println("Hours worked ="+ hoursWorked);
		System.out.println("Gross pay ="+GetGrosspay());
		return null;
	}
	
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HourlyEmployee emp = new HourlyEmployee("AB",1,15,1800);
		System.out.println(emp);
		/* system.out.println statements are not equipped to print values of class type since class hourly employee is overriding tostring and and
		 * toString is standard method in java to print values of instances it will be called println method
		 * println is overloaded function in class PrintStream
		 * output is a null value at the end because tostring returns null
		 * 
		 */

	}

}
