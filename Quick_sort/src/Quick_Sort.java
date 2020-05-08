import java.util.Random;
import java.util.Scanner;
public class Quick_Sort {
	static int comparisons = 0;
	static int [] arr;
	static void quicksort(int low,int high)
	{
		if(low<high)
		{	
			comparisons += 1;
			int j = partition(low,high);
			quicksort(low, j-1 );
			quicksort(j+1,high);
		}
		
	}
	static int partition(int low,int high)
	{
		int pivot = arr[low];
		int i = low,j=high;
		while( i<j)
		{
			comparisons += 1; 
			while(i<high && arr[i]<pivot)
			{
				comparisons += 2;
				i +=1;
			}
			while(j>low && arr[j]>=pivot)
			{
				comparisons+=2;
				j-=1;
				
			}
			if(i<j)
			{
				comparisons += 1;
				interchange(i,j);
				
			}
			
		}
		arr[low] = arr[j];
		arr[j] = pivot;
		return j;
		
	}
	static void interchange( int i,int j)
	{
		int temp = arr[i];
		arr[i] =  arr[j];
		arr[j] =temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter value of n");
		n = scanner.nextInt();
		arr = new int[n];
		System.out.println("Quick sort");
		System.out.println("1. Best case/Average case");
		System.out.println("2. Worst case");
		
		int ch = scanner.nextInt();
		switch(ch)
		{
		case 1: Random random = new Random();
		  for(int i=0; i<n; i++)
		  {
			  arr[i]= random.nextInt();
			  System.out.println(arr[i]);
		  }
		  break;
		case 2: 
		
			for(int i=0;i<n;i++)
			{
				arr[i]=i+1;
				 System.out.println(arr[i]);
			}
		
		break;
		}
		long start = System.nanoTime();
		quicksort(0, n-1);
		long end = System.nanoTime();
		System.out.println("Sorted array");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		
		
		}
		System.out.println("Time taken:"+ (end-start));
		System.out.println("Comparisions:" + comparisons);
		
	}

}
