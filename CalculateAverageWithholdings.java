package withholdings;
import java.util.*;

public class CalculateAverageWithholdings {
	public static void main(String[] args) {
		int weeklyIncome;
		double withholding;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your average weekly income in dollars?");
		weeklyIncome = scanner.nextInt();
		
		if (weeklyIncome >= 0) {
			if (weeklyIncome < 500) {
				withholding = weeklyIncome * 0.10;
				System.out.println("Your weekly income is $" + weeklyIncome + " and falls within the range of $0 to $499. "
						+ "Your suggested withholdings is 10% of your weekly earnings");
			}
			else if ((weeklyIncome >= 500) && (weeklyIncome < 1500)) {
				withholding = weeklyIncome * 0.15;
				System.out.println("Your weekly income is $" + weeklyIncome + " and falls within the range of $500 to $1499. "
						+ "Your suggested withholdings is 15% of your weekly earnings");
			}
			else if ((weeklyIncome >= 1500) && (weeklyIncome < 2500)) {
				withholding = weeklyIncome * 0.20;
				System.out.println("Your weekly income is $" + weeklyIncome + " and falls within the range of $1500 to $2499. "
						+ "Your suggested withholdings is 20% of your weekly earnings");
			}
			else {
				withholding = weeklyIncome * 0.30;
				System.out.println("Your weekly income is $"+ weeklyIncome + " and falls within the range of $2500 and above." +
				" Your suggested withholding is 30% of your weekly earnings.");
			}
			
			System.out.print("Your calculated weekly withholding is ");
			System.out.printf("$%.2f.%n", withholding);
		}
		else {
			System.out.println("This is not a valid weekly income.");
		}

	}

}
