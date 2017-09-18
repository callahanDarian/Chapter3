package Excersizes;

public class Percentages {

	public static void main(String[] args) 
	{
		double first = 15;
		double second = 50;
		
		computePercent(first, second);
		computePercent(second, first);
	}
	public static void computePercent(double first, double second)
	{
		System.out.println(first + " is " + first / second * 100 + "% of " + second);
	}

}
