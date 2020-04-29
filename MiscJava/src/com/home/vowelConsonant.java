package com.home;

public class vowelConsonant {

	public static void main(String[] args) {

		String vowels = "AEIOUaeiou";
		char c = 'V';

		if (vowels.indexOf(c) > 0)
			System.out.println(c + " is a vowel");
		else
			System.out.println(c + " is a consonant");

	}

}
