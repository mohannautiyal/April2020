package com.home;

import java.util.Arrays;

public class BubbleSort {

	// Buble sort Algorithm for array
	
	public static void main(String[] args) {

		int a[] = { 12, 4, 3, 5, 7, 82, 12, 11, 6, 7 };
		int temp = 0;
		boolean flag = true;
		
		System.out.println("Original Array " + Arrays.toString(a));

		
		for (int i = 0; i < a.length; i++) {

			if (flag == false)
				break;

			for (int j = 0; j < a.length-1; j++) {

				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true;
				} 
			}

		}

				
		System.out.println("Sorted Array " + Arrays.toString(a));

	}

}
