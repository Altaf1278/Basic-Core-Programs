package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		
		int dividend;
		int divisor;
		int quotient; int remainder;
		
		Scanner inputa= new Scanner(System.in);
		
		 System.out.print("Enter the dividend: ");
	      dividend = inputa.nextInt();

	      System.out.print("Enter the divisor: ");
	      divisor = inputa.nextInt();
		
		 quotient = (dividend / divisor);
		System.out.println("Answer of Quotient is : " +quotient);
		
		 remainder = (dividend % divisor);
		System.out.println("Answer of Remainder is : " +remainder);
		
	}

}
