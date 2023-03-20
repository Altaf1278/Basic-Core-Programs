package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class VowelsOrConsonant {
	public static void main(String[] args) {
		char x;
        Scanner input= new Scanner(System.in);
 
        System.out.println("Enter an Alphabet : ");
        x = input.next().charAt(0);
 // The words starting with alphabets (a,e,i,o,u) are said to be Vowels.
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'
        || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') 
        {
            System.out.println("Word is a `Vowel` ");
        } else {
            System.out.println(" Word is an `Consonant` ");
        }
	}

}
