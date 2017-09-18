package youDoIt;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class DemoRaise {
	
		static double raiseRate, salary, startingWage;
		static String strRaiseRate, strSalary, strStartingWage;
		static DecimalFormat df = new DecimalFormat("0.00");
		
	public static void main(String[] args) 
	{
		strSalary = JOptionPane.showInputDialog(null, "Please input a salary");
		salary = Double.parseDouble(strSalary);
		
		strStartingWage = JOptionPane.showInputDialog(null, "Please input a starting wage.");
		startingWage = Double.parseDouble(strStartingWage);
		
		strRaiseRate = JOptionPane.showInputDialog(null, "Please input a raise rate.");
		raiseRate = Double.parseDouble(strRaiseRate);
		
		predictRaise(salary);
		predictRaise(startingWage);
	}
	public static void predictRaise(double math)
	{
		double newSalary;
		newSalary = math * raiseRate;
		JOptionPane.showMessageDialog(null, "Current salary: " + math + "\n\nAfter raise : " + df.format(newSalary));		
	}

}
