package Excersizes;

public class NumbersDemo {
	
	public static void main(String[] args) 
	{
		int first = 10;
		int second = 25;
		
		displayTwiceNumber(first, second);
		displayNumberPlusFive(first, second);
		displayNumberSquared(first, second);
	}
	public static void displayTwiceNumber(int first, int second)
	{
		System.out.println(first);
		System.out.println(second);
		System.out.println(first);
		System.out.println(second);
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
