package com.bridgelabz.basiccoreprograms;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a = 250;
		int b =150;
		// Value of `a` is 250 and `b` is 150
		
		int result = a;
		a=b;
		b = result;
		
		// After Swapping Value of `a` will be 150 and `b` will be 250
		System.out.println("Value a after swapping : " +a );
		System.out.println("Value of b after swapping: " +b);
	}

}
