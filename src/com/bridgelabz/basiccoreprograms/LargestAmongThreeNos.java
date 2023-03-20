package com.bridgelabz.basiccoreprograms;

public class LargestAmongThreeNos {
	public static void main(String[] args) {
		

	    int a = 10, b = 455, c = 100;

	    //checking if num1 is greatest
	    if (a >= b && a >= c)
	        System.out.println (a + " is the greatest number. ");

	    //checking if num2 is greatest
	    else if (b >= a && b >= c)
	        System.out.println (b + " is the greatest number. ");

	    //checking if num2 is greatest
	    else if (c >= a && c >= b)
	        System.out.println (c + " is the greatest number. ");
	}

}
