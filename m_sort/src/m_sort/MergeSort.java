package m_sort;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	 static int comporisions = 0;
	 static int [] arr;
	 
	 static void mergeSort(int low, int high) {
		 if(low<high)
		 {
			 comporisions += 1;
			 int mid = (low + high)/2;
			 mergeSort( low,mid);
			 mergeSort(mid+1,high);
			 
		 }
 }
	 static void merge(int low,int mid,int high) {
		 int n = high-low+1;
	 }

	
		 
		 
		 
 
        
	
	
}