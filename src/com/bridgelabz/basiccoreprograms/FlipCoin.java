package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		
		int heads=0; int tails=0;
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Flipping coin: ");
		num= input.nextInt();
		
		// using random function to get value btn 0 & 1.
		//If <0.5 then tails or heads
		for (int i = 0; i < num; i++) {
			double random = Math.random();
			if (random < 0.5)
				tails++;
			else
				heads++;
		}
		double headx; double taily;
		headx = heads / (double) num * 100;
		taily = tails / (double) num * 100;
		System.out.println("Percentage of heads: " +headx + "%");
		System.out.println("Percentage of tails: " +taily + "%");

	}

}
