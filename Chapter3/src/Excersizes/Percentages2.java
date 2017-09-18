package Excersizes;

import java.util.Scanner;

public class Percentages2 {

	public static void main(String[] args) 
	{
		double first, second;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a number.");
		first = keyboard.nextInt();
		System.out.println("Please enter a number.");
		second = keyboard.nextInt();
		
		computePercent(first, second);
		computePercent(second, first);
	}
	public static void computePercent(double first, double second)
	{
		System.out.println(first + " is " + first / second * 100 + "% of " + second);
	}

}
