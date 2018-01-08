package checkPalindrome;

import java.util.Scanner;

public class PalindromeChecker {
	private static String string = "";
	static boolean again = true;
	private static int i = 0;
	public static void main(String[] args) {
		System.out.println("Enter a word/phrase/number/sequence to check and see if it is a palindrome: ");
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		if (Check(string)==true) {
			System.out.println(string + " is a palidrome!");
		} else {
			System.out.println(string + " is not a palidrome.\nA palindrome is a word, phrase, number or other sequence of units that can be read the same way in either direction.");
		}
		
		while(again) {
			if(i==0) {
				System.out.println("Please enter the word:\nyes\nto try another word.");
				System.out.println("Else enter:\nno\nto exit to Palindrome checker.");
			}
			
			String string2 = scanner.nextLine();
			if(string2.equals("yes")) {
				System.out.println("Enter a word/phrase/numer/sequence to check and see if it is a palindrome: ");
				string = scanner.nextLine();
				if (Check(string)==true) {
					System.out.println(string + " is a palidrome!");
				} else {
					System.out.println(string + " is not a palidrome.\nA palindrome is a word, phrase, number or other sequence of units that can be read the same way in either direction.");
				}
				i = 0;
			} else if(string2.equals("no")) { 
				again = false;
			} else {
				System.out.println("You did not enter a valid opion. Please type yes or no without caps.");
				i=1;
			}
		}
	}
	private static boolean Check(String palidromeString) {
		char[] array = palidromeString.toCharArray();
		int i = 0;
	    int j = array.length - 1;
	    while (j > i) {
	        if (array[i] != array[j]) {
	            return false;
	        }
	        ++i;
	        --j;
	    }
	    return true;
	}
}
