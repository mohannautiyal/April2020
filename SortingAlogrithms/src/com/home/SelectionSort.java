package com.home;

import java.util.Arrays;

public class SelectionSort {
	
	
	
	// Selection sort
	public static void main(String[] args) {
		
		int a[] = { 6, 2, 1, 8, 7, 9, 21, 15, 3, 0 };
		System.out.println("Unsorted Array is " + Arrays.toString(a));
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			
			 for(int j=i+1;j<a.length;j++) {
				 
				 if(a[i]>a[j])
				 {
					 temp = a[i];
					 a[i] =a[j];
					 a[j]=temp;					 
				 }
			 }
						
		}
		System.out.println("Sorted Array is " + Arrays.toString(a));

		
		
		
	}

}
