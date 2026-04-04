package inventoryHome;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class HomeInventoryManager {
	private HomeInventory hi;
	private Scanner s;
	
	
	public static void main(String[] args) throws IOException{
		HomeInventory hi = new HomeInventory();
		Scanner s = new Scanner(System.in);
		HomeInventoryManager him = new HomeInventoryManager(hi,s);

	}
	public HomeInventoryManager(HomeInventory hi, Scanner s)throws IOException{
		this.hi = hi;
		this.s = s;
		
		menuState (hi, s);
	}
	
	public void menuState(HomeInventory hi, Scanner s)throws IOException {
		try {
			int userInput = -1;
			do {
				System.out.println("Select 1 to add a home to the inventory");
				System.out.println("Select 2 to remove a home from the home inventory.");
				System.out.println("Select 3 to change a home's sale status.");
				System.out.println("Select 4 to print the home inventory to the screen.");
				System.out.println("Select 5 to print the home inventory to a file.");
				System.out.println("Select 0 to quit.");
				System.out.print("Make a selection: ");
				userInput = s.nextInt();
				s.nextLine();
				if(userInput == 1) {
					addHome(hi, s);
					System.out.println();
				}
				if(userInput == 2) {
					removeHome(hi, s);
					System.out.println();
				}
				if(userInput == 3) {
					changeSaleStatus(hi, s);
					System.out.println();
				}
				if(userInput == 4) {
					System.out.println("The current home inventory:");
					hi.printHomes();
				}
				if(userInput == 5) {
					printHomes(hi, s);
					System.out.println();
				}
				if((userInput < 0) || (userInput > 5)) {
					System.out.println("That is not a valid menu input! Please try again.\n");
				}
			}while(userInput != 0);
		}catch(Exception e) {
			System.out.println("Something went wrong with the menu. Please try the program again.");
		}

		
	}
	public void addHome(HomeInventory hi, Scanner s) {
		try {
			String saleStatus = null;
			String address = null;
			String city = null;
			String state = null;
			String zipCode = null;
			String modelName = null;
			int squareFoot = 0;
			int status = -1;
			
		
			System.out.println("Enter the home address.");
			address = s.nextLine();
			System.out.println("Enter the home city.");
			city = s.nextLine();
			System.out.println("Enter the home state.");
			state = s.nextLine();
			System.out.println("Enter the homes model name.");
			modelName = s.nextLine();
			System.out.println("Enter the home zip code.");
			zipCode = s.nextLine();
			System.out.println("Enter the homes square footage.");
			squareFoot = s.nextInt();
			System.out.println("To determine the sale status, enter 1 for available, 2 for under contract, and 3 for sold.");
			status = s.nextInt();
			saleStatus = hi.changeStatus(status);
			hi.addHome(squareFoot, address, city, state, zipCode, modelName, saleStatus);
		}
		catch(InputMismatchException e) {
			System.out.println("Something went wrong with adding your home!\n");
			
		}
	}
	public void removeHome(HomeInventory hi, Scanner s) {
		System.out.println(hi.removeHome());
	}
	
	public void printHomes(HomeInventory hi, Scanner s) throws IOException{
		try{
			i