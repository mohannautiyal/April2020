package com.home;

import java.util.Arrays;

public class InsertionSort {

	// Insertion Sort
	public static void main(String[] args) {

		int a[] = { 6, 2, 1, 8, 7, 9, 21, 15, 3, 0 };
		int temp;

		System.out.println("Unsorted Array is " + Arrays.toString(a));

		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > temp) {
				a[j + 1] = a[j];
				j--;

			}
			a[j + 1] = temp;

		}

		System.out.println("Sorted Array is   " + Arrays.toString(a));

	}

}
