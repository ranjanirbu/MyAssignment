package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber{

	public static void main(String[] args) {
		System.out.println("Program to check whether the number is prime or not");
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;

		if(num <= 0)
		{
			System.out.println("Invalid number");
		}
		else if(num == 1 || num == 2)
		{
			flag = false;
		}
		else
		{
			for(int i=2; i<num;i++)
			{
				if(num%i==0)
				{
					flag = true;
					break;
				}
			}
		}

		if(!flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
}