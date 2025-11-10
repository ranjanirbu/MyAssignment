package week1.day2;

import java.util.Scanner;

class FiboSeriesUsingArray {

	public static void main(String args[])
	{
		System.out.println("Program to find fibonacci series for a given range");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to find fibonacci series upto that range : ");
		int range = sc.nextInt();
		int[] fib = new int[range];

		if(range == 1)
		{
			fib[0] = 0;
			System.out.print(fib[0]);
		}
		else if (range == 2)
		{
			fib[0] = 0;
			fib[1] = 1;
			System.out.print(fib[0] +" ");
			System.out.print(fib[1] +" ");
		}
		else 
		{
			fib[0] = 0;
			fib[1] = 1;
			System.out.print(fib[0] +" ");
			System.out.print(fib[1] +" ");

			for(int i=2;i<range;i++)
			{
				fib[i] = fib[i-1] + fib[i-2];
				System.out.print(fib[i] +" ");

			}
		}
	}
}