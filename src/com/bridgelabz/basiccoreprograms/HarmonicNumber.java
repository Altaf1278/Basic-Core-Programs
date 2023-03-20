package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {
public static void main(String[] args) {
	
	
	/* This are harmonic numbers.
	 * The n-th harmonic number Hn is defined by
	 * Hn = 1 + 1/2 + 1/3 + ... + 1/n,
	 *  H1 =     1,
     *H2 =    3/2,
     *H3 =   11/6,
     *H4 =   25/12,
     *H5 =  137/60,
     *H6 =   49/20,
     *H7 =  363/140,
     *H8 =  761/280,
     *H9 = 7129/2520,
	 */
	
	
	
	Scanner input = new Scanner(System.in);
    System.out.print("Enter the harmonic number: ");
    int number = input.nextInt();
    double sum = 0;
    for(int i=1; i<=number; i++) {
        sum += 1.0 /i;
    }
    System.out.println("The " + number + "th harmonic number is: " + sum);
}
}

