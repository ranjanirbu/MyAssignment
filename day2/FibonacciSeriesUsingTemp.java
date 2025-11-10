package week1.day2;

import java.util.Scanner;

public class FibonacciSeriesUsingTemp {

	public static void main(String[] args) {

		System.out.println("Program to find fibonacci series for a given range");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range to find fibonacci series upto that range: ");
		int range = sc.nextInt();
		int a = 0;
		int b = 1;

		if(range == 1)
		{
			System.out.print(a);
		}
		else if (range == 2)
		{
			System.out.print(a +" ");
			System.out.print(b +" ");
		}
		else 
		{
			System.out.print(a +" ");
			System.out.print(b +" ");

			for(int i=2;i<range;i++)
			{
				int temp = a+b;
				System.out.print(temp +" ");
				a=b;
				b=temp;

			}
		}
	}

}
