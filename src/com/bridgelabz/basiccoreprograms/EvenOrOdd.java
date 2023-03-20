package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		int number;
	      Scanner input = new Scanner(System.in);

	      System.out.print("Enter an integer: ");
	      number = input.nextInt();

	      if (number % 2 == 0) {
	         System.out.println("Entered number is Even: " +number);
	      } else {
	         System.out.println("Entered numberis Odd: " +number);
	      }
	}

}
