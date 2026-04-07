import java.util.Scanner;

public class gradeStatistics {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		float temp;
		float total = 0;
		float minimum = 0;
		float maximum = 0;
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("You have " + (i - 1) + " out of 10 grades submitted. Please enter a grade value.");
			
			while(true) {
			
				if(!scnr.hasNextFloat()) {
					System.out.println("Invalid grade input. Please enter a numeric grade.");
					scnr.next();
					continue;
				}
				
				temp = scnr.nextFloat();
				
				if(temp < 0) {
					System.out.println("Invalid grade input. Please enter a grade.");
					temp = scnr.nextFloat();
					continue;
				}
				break;
			}
			total = total + temp;
			if (i == 1) {
				minimum = temp;
				maximum = temp;
			}
			else if (minimum >= temp) {
				minimum = temp;
			}
			else if (maximum <= temp) {
				maximum = temp;
			}
			
		}
		System.out.println("All grades have been submitted. The following data has been "
				+ "calculated based on grades entered:");
		System.out.println("Average: " + (total/10));
		System.out.println("Maximum: " + maximum);
		System.out.println("Minimum: " + minimum);

	}

}
