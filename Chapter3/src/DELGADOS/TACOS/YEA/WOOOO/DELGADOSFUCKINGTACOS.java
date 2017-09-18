package DELGADOS.TACOS.YEA.WOOOO;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class DELGADOSFUCKINGTACOS {
	
	static DecimalFormat df = new DecimalFormat("0.00");
	
	static int intAmountTacos, intSizeTacos, intAmountBurritos, intSizeBurritos, intAmountEnchilada, intSizeEnchilada, intAmountTorta, intSizeTorta, 
	intAmountQuesadilla, intSizeQuesadilla, intAmountTostada, intSizeTostada, intAmountTamale, intSizeTamale, intAmountFajita, intSizeFajita,
	intSalad, intBeverage, intSizeBeverage;
	
	static double price = 0;
	static double priceTax;
	
	static String strOrder;
	
	/*
	 * Start this shit! v
	 */
	
	public static void main(String[] args) 
	{
		tacoTruck();
	}
	
	public static void tacoTruck()
	{
		String[] options = new String [2];
		options[0] = new String ("FUCK YEAH!");
		options[1] = new String ("No thank you; I'm boring.");
		int n = JOptionPane.showOptionDialog(null, "Would you like to make a purchase with Delgados Tacos?","TACOS BRO",
				JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if (n == JOptionPane.YES_OPTION)
		{
			Menu();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Leave.");
		}
	}
	
	/*
	 *  The Menu v
	 */
	
	public static void Menu()
	{		
		//Tacos!
		strOrder = JOptionPane.showInputDialog(null, "How many tacos would you like to purchase?\nPlease input the number.\nTacos cost $1.00 + $2.00 per taco."
				+ "\n1. One Taco                2. Two Tacos"
				+ "\n3. Three Tacos          4. Four Taco"
				+ "\n5. Five Taco                6. Six Taco");
		intAmountTacos = Integer.parseInt(strOrder);
		
		strOrder = JOptionPane.showInputDialog(null, "How large would you like your tacos?\nPlease input the number."
				+ "\n1. Single                 2. Double"
				+ "\n3. Triple                  4. Quadra");
		intSizeTacos = Integer.parseInt(strOrder);
		
		//Burritos!
		strOrder = JOptionPane.showInputDialog(null, "How many burritos would you like?\nPlease input the number.\nBurritos cost $1.00 + $3.00 per burrito."
				+ "\n0. Zero Burrito"
				+ "\n1. One Burrito            2. Two Burrito"
				+ "\n3. Three Burrito         4. Four Burrito"
				+ "\n5. Five Burrito             6. Six Burrito");
		intAmountBurritos = Integer.parseInt(strOrder);
		if (intAmountBurritos == 0)
		{ 
			intSizeBurritos = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your burritos?\nPlease input the number."
				+ "\n1. Single                 2. Double"
				+ "\n3. Triple                 4. Quadra");
		intSizeBurritos = Integer.parseInt(strOrder);
		}
		
		//Enchiladas!
		strOrder = JOptionPane.showInputDialog(null, "How many enchiladas would you like?\nPlease input the number.\nEnchiladas cost $1.00 + $1.50 per Enchilada."
				+ "\n0. Zero Enchiladas"
				+ "\n1. One Enchilada             2. Two Enchiladas"
				+ "\n3. Three Enchiladas       4. Four Enchiladas"
				+ "\n5. Five Enchiladas           6. Six Enchiladas");
		intAmountEnchilada = Integer.parseInt(strOrder);
		if (intAmountEnchilada == 0)
		{ 
			intSizeEnchilada = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your enchiladas?\nPlease input the number."
				+ "\n1. Single                 2. Double"
				+ "\n3. Triple                  4. Quadra");
		intSizeEnchilada = Integer.parseInt(strOrder);
		}
		
		//Tortas!
		strOrder = JOptionPane.showInputDialog(null, "How many tortas would you like?\nPlease input the number.\nTortas cost $0.50 + $1.75 per torta."
				+ "\n0. Zero Tortas"
				+ "\n1. One Torta                  2. Two Tortas"
				+ "\n3. Three Tortas             4. Four Tortas"
				+ "\n5. Five Tortas                6. Six Tortas");
		intAmountTorta = Integer.parseInt(strOrder);
		if (intAmountTorta == 0)
		{ 
			intSizeTorta = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your tortas?\nPlease input the number."
				+ "\n1. Single                 2. Double"
				+ "\n3. Triple                 4. Quadra");
		intSizeTorta = Integer.parseInt(strOrder);
		}
		
		//Quesadillas!
		strOrder = JOptionPane.showInputDialog(null, "How many quesadillas would you like?\nPlease input the number.\nQuesadillas cost $0.50 + $1.75 per quesadilla."
				+ "\n0. Zero Quesadillas"
				+ "\n1. One Quesadilla                  2. Two Quesadillas"
				+ "\n3. Three Quesadillas             4. Four Quesadillas"
				+ "\n5. Five Quesadillas                6. Six Quesadillas");
		intAmountQuesadilla = Integer.parseInt(strOrder);
		if (intAmountQuesadilla == 0)
		{ 
			intSizeQuesadilla = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your quesadillas?\nPlease input the number."
				+ "\n1. Single                 2. Double"
				+ "\n3. Triple                 4. Quadra");
		intSizeQuesadilla = Integer.parseInt(strOrder);
		}
		
		//Tostada!
		strOrder = JOptionPane.showInputDialog(null, "How many tostadas would you like?\nPlease input the number.\nTostadas cost $0.50 + 1.75 per Tostada."
				+ "\n0. Zero Tostadas"
				+ "\n1. One Tostada                  2. Two Tostadas"
				+ "\n3. Three Tostadas             4. Four Tostadas"
				+ "\n5. Five Tostadas                6. Six Tostadas");
		intAmountTostada = Integer.parseInt(strOrder);
		if (intAmountTostada == 0)
		{ 
			intSizeTostada = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your tostadas?\nPlease input the number."
				+ "\n1. Single                 2. Double"
				+ "\n3. Triple                 4. Quadra");
		intSizeTostada = Integer.parseInt(strOrder);
		}
		
		//Tamale!
		strOrder = JOptionPane.showInputDialog(null, "How many tamales would you like?\nPlease input the number.\nTamales cost $0.25 + $1.00 per tamale."
				+ "\n0. Zero Tamales"
				+ "\n1. One Tamale                  2. Two Tamales"
				+ "\n3. Three Tamales             4. Four Tamales"
				+ "\n5. Five Tamales                6. Six Tamales");
		intAmountTamale = Integer.parseInt(strOrder);
		if (intAmountTamale == 0)
		{ 
			intSizeTamale = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your tamales?\nPlease input the number."
				+ "\n1. Single                 2. Double"
				+ "\n3. Triple                 4. Quadra");
		intSizeTamale = Integer.parseInt(strOrder);
		}
		
		//Fajitas!
		strOrder = JOptionPane.showInputDialog(null, "How many fajitas would you like?\nPlease input the number.\nFajetas cost $1.00 + $2.00 per fajita."
				+ "\n0. Zero Fajitas"
				+ "\n1. One Fajita                  2. Two Fajitas"
				+ "\n3. Three Fajitas             4. Four Fajitas"
				+ "\n5. Five Fajitas                 6. Six Fajitas");
		intAmountFajita = Integer.parseInt(strOrder);
		if (intAmountFajita == 0)
		{ 
			intSizeFajita = 0;
		}
		else 
		{
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your fajitas?\nPlease input the number."
				+ "\n1. Single                 2. Double"
				+ "\n3. Triple                 4. Quadra");
		intSizeFajita = Integer.parseInt(strOrder);
		}
		//s a l a d s . . .
		strOrder = JOptionPane.showInputDialog(null, "Would you like a salad?\nPlease input the number.\nA salad costs $1.00."
				+ "\n0. No Salad"
				+ "\n1. One Salad");
		intSalad = Integer.parseInt(strOrder);
		
		//Beverage
		strOrder = JOptionPane.showInputDialog(null, "Which beverage would you like?\nPlease input the number.\nA beverage costs $0.50."
				+ "\n0. None"
				+ "\n1. Hee-Haw                    2. Moxie"
				+ "\n3. Hubba Bubba            4. Izze"
				+ "\n5. Sam's Cola                6. Josta");
		intBeverage = Integer.parseInt(strOrder);
		if (intBeverage == 0)
		{ 
			intSizeBeverage = 0;
		}
		else 
		{
		intBeverage = 1;  
		strOrder = JOptionPane.showInputDialog(null, "What size would you like your beverage?\nPlease input the number."
				+ "\n1. Single                 2. Double"
				+ "\n3. Triple                  4. Quadra");
		intSizeBeverage = Integer.parseInt(strOrder);
		}
				
	}
	
	/*
	 * The Price v
	 */
	
	public static void salesTax()
	{
		//Price!
		price = price + (((intAmountTacos * 2 )+ 1) * intSizeTacos ) + (((intAmountBurritos * 3) + 1) * intSizeBurritos) + 
				(((intAmountEnchilada * 1.5) + 1) * intSizeEnchilada) + (((intAmountTorta * 1.75) + 0.5) * intSizeTorta) +
				(((intAmountQuesadilla * 1.75) + 0.5) * intSizeQuesadilla) + (((intAmountTostada * 1.75) + 0.5) * intSizeTostada) +
				(((intAmountTamale * 1) + 0.25) * intSizeTamale) + (((intAmountFajita * 2) + 1) * intSizeFajita) + 
				intSalad + ((intBeverage / 2) * (intSizeBeverage / 2));
		priceTax = price * 1.075;
		
		int n = JOptionPane.showConfirmDialog(null, "You have ordered : \n"
		+ intAmountTacos + " tacos at size " + intSizeTacos + "\n"
		+ intAmountBurritos + " burritos at size " + intSizeBurritos + "\n"
		+ intAmountEnchilada + " enchiladas at size " + intSizeEnchilada + "\n"
		+ intAmountTorta + " tortas at size " + intSizeTorta + "\n"
		+ intAmountQuesadilla + " quesadillas at size " + intSizeQuesadilla + "\n"
		+ intAmountTostada + " tostadas at size " + intSizeTostada + "\n"
		+ intAmountTamale + " tamales at size " + intSizeTamale + "\n"
		+ intAmountFajita + " fajitas at size " + intSizeFajita + "\n"
		+ intSalad + " salad\n"
		+ intBeverage + " beverage at size " + intSizeBeverage
		+ "\nYour total is :\n"
		+ "  \nWithout Tax : $" + df.format(price)
		+ "  \n   With Tax : $" + df.format(priceTax)
		+ "\n\n"
		+ "Is this correct?");
		
		if (n == JOptionPane.NO_OPTION)
		{
			Menu();
			price = 0;
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Thank you for your money, I guess.");
		}
	}

}
