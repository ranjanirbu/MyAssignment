package week1.day2;

import java.util.Scanner;

public class checkIsPalindrome {

	public static void main(String[] args) {
		
		System.out.println("Program to check whether given input number is palindrome or not");
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output = 0,rem = 0;
		
		for(int i=input; i>0;i=i/10)
		{
			rem = i%10;
			output = output * 10 + rem;
		}
		
		if(input == output)
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}
}
