package com.home;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int a[] = { 2, 4, 10, 20, 23, 46, 82 ,90,95}; // array 1
		int b[] = { 20, 21, 22, 45, 78, 60 ,81,91,96}; // array 2
      		
		int c[] = new int[a.length + b.length]; // merged array
		int pointer_a = 0;
		int pointer_b = 0;
		int pointer_c = 0;
		while (pointer_a < a.length & pointer_b < b.length) {
			if (a[pointer_a] < b[pointer_b]) {
				c[pointer_c] = a[pointer_a];
				pointer_a++;

			} else {
				c[pointer_c] = b[pointer_b];
				pointer_b++;
			}
			pointer_c++;

		}
		

       while(pointer_a <a.length) {
    	   c[pointer_c] = a[pointer_a];
			pointer_a++;
			pointer_c++;
       }
		
		
       while(pointer_b <b.length) {
    	   c[pointer_c] = b[pointer_b];
			pointer_b++;
			pointer_c++;
       }
       
       
       System.out.println("First Array "+Arrays.toString(a));
       System.out.println("Second Array "+Arrays.toString(b));

       
		System.out.println("Merged Array "+ Arrays.toString(c));
	}
	
	

}
