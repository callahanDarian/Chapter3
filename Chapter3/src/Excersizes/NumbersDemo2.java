package Excersizes;

import java.util.Scanner;

public class NumbersDemo2 {
	
	public static void main(String[] args) 
	{
		int first, second;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input a number");
		first = keyboard.nextInt();
		System.out.println("Please input a second number.");
		second = keyboard.nextInt();
		
		displayTwiceNumber(first, second);
		displayNumberPlusFive(first, second);
		displayNumberSquared(first, second);
	}
	public static void displayTwiceNumber(int first, int second)
	{
		System.out.println(first*2);
		System.out.println(second*2);
	}
	public static void displayNumberPlusFive(int first, int second)
	{
		System.out.println(first + 5);
		System.out.println(second + 5);
	}
	public static void displayNumberSquared(int first, int second)
	{
		System.out.println(Math.pow(first, 2));
		System.out.println(Math.pow(second, 2));
	}
}
