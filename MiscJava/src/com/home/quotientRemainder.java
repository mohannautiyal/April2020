package com.home;

public class quotientRemainder {

	public static void main(String[] args) {

		int divisor = 3;
		int dividend = 31;
		
		int quotient = dividend/divisor;
		int remainder = dividend - (quotient*divisor );
		int remainder1 = dividend%divisor;
		
		System.out.println("Quotient is " + quotient + " and remainder is "+remainder1);
	
		
		
	}

}
