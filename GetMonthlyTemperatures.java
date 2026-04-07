package monthlyTemperatures;
import java.util.Scanner;


public class GetMonthlyTemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", 
				"September", "October", "November", "December"};
		double[]tempMonth = {56.8, 58.2, 62.7, 70.3, 79.1, 88.6, 94.8, 93.8, 86.0, 74.7, 61.7, 54.3};
		Scanner scnr = new Scanner(System.in);
		boolean validInput = false;
		boolean yearSelected = false;
		String input;
		int userInput = 0;
		String highMonth = month[0];
		String lowMonth = month[0];
		double highTemp = tempMonth[0];
		double lowTemp = tempMonth[0];
		double sumTemp = 0.0;
		

		
		while (!validInput){ 
			System.out.println("Select the month to view the average temperature for 2025.");
			System.out.println("Please enter the number next to the month.");
			System.out.println("For all months and temperatures as well as the yearly average and "
					+ "the highest and lowest monthly average please type “year”.");
			System.out.println("1) January 2) February 3) March "
					+ "4) April 5) May 6) June 7) July 8) August "
					+ "9) September 10) October 11) November 12) December"
					+ " “year”) All Month Data");
			input = scnr.nextLine();
			if(input.equalsIgnoreCase("year")) {
				yearSelected = true;
				validInput = true;
			}
			else if(input.matches("\\d+")) {
				userInput = Integer.parseInt(input);
				
				if (userInput >= 1 && userInput <= 12) {
					validInput = true;
				}
				else {
					System.out.println("Invalid month number. Please enter 1 - 12.");
				
				}
			}
			else {
				System.out.println("Invalid input. Please enter a number or type \"year\".");
				
			}
				
		}	
		if(yearSelected == true) {
			for(int i =0; i < month.length; ++i) {
				if (tempMonth[i] >= highTemp) {
					highTemp = tempMonth[i];
					highMonth = month[i];
				}
				if (tempMonth[i]<= lowTemp) {
					lowTemp = tempMonth[i];
					lowMonth = month[i];
				}
				sumTemp = sumTemp +tempMonth[i];
				System.out.println(month[i]+": "+ tempMonth[i]+ " degrees Fahrenheit");
								
			}
			System.out.println("Highest average temperature for the year was in " + highMonth + 
					" with the average temperature of " + highTemp +" degrees Fahrenheit.");
			System.out.println("Lowest average temperature for the year was in " + lowMonth + 
					" with the average temperature of " + lowTemp + " degrees Fahrenheit.");
			System.out.print("The yearly average temperature was ");
			System.out.printf("%.2f",(sumTemp/12.0));
			System.out.print(" degrees Fahrenheit." );
			
		}
		else {
			userInput = userInput - 1;
			System.out.println(month[userInput] + " has an average temperature of " + 
			tempMonth[userInput] + " degrees Fahrenheit.");
			
		}
	}
	
		

}


