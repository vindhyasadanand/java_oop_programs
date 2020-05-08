package merge_sort;
import java.util.Scanner;
import java.util.Random;

public class merge {
	
	static int [] arr;
	//this merge function is used to divide the array into sub arrays 
	static void mergeSort(int low,int high)
	{ 
		//we are using it to check only one element is present in the array
		if(low<high) 
		{
			
			int mid =(low+high)/2;
			//to get left sub array
			mergeSort(low,mid);
			//to get right sub array
			mergeSort( mid+1,high);
			merge(low,mid,high);
			}
		
     }
	
	//this is used to merge divided array 
	static void merge(int low, int mid,int high)
	{
		int n = high-low +1;
		int [] t_arr = new int[n];
		int i=low,
	    j=mid+1,
	    k=0;
		while((i<=mid) && (j<=high)) 
		{
			
			//here we are comparing elements of left sub array with right sub array
			if(arr[i]<=arr[j])
			{
				
				t_arr[k]=arr[i];
				i++;
			}
			else
			{
				
				t_arr[k] = arr[j];
				j++;
			}
			k++;
		}
	//to copy remaining elements from left sub array to temporary array
	while(i<=mid)
	{
		
		
		t_arr[k] = arr[i];
		i++;
		k++;
		
	}
	//to copy remaining elements from right sub array into the temporary array
	while(j<=high)
	{
		//to copy remaining elements from left sub part to the temporary array
		
		t_arr[k]=arr[j];
		k++;
		j++;
		
	}
	for(k=0;k<n;k++)
	{
		//copy elements from temporary array to original array
		arr[low+k] = t_arr[k];
		
	}
	
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int  n;
	
	Scanner scanner = new Scanner (System.in);
	//Scanner is built in class in java it will have variables and methods inside it to access these we created an object
	//nextInt is the method is available in scanner class
	System.out.println("enter n value");
	n = scanner.nextInt();
	arr =new int[n];
	int ch; // it is used to hold users choice
	System.out.println("Merge sort");
	System.out.println("1. Best case");
	System.out.println("2. Average case");
	System.out.println("3.Worst case");
	ch = scanner.nextInt();
	switch(ch)
	{
		case 1 : for(int i=0;i<n;i++)
		{
			arr[i]=arr[i]+1;
			
		
		}
		break;
		case 2: Random random = new Random();
		for(int i=0;i<n;i++)
		{
			arr[i]= random.nextInt();
			
			
			
		}
		break;
		case 3: for(int i=0;i<n;i++)
		{
			arr[i]=n-i; 
			
		}
		break;
		
	}
	//this loop is to display input what user gives
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
	long start = System.nanoTime();
	mergeSort(0,n-1);
	long end = System.nanoTime();
	//to display the sorted array
	System.out.println("Sorted Array");
	for(int i=0;i<n;i++)
	{
		System.out.println( arr[i]);
	}
	//to print time taken to sort
	System.out.println("Time taken:"+(end-start));
	
	
	
	
	}

}
