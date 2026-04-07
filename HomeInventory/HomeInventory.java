package inventoryHome;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedOutputStream;



public class HomeInventory {
	ArrayList<Home> homes = new ArrayList();

	
	
	public void addHome(int squareFeet, String address, String city, String state, String zipCode, String modelName, String saleStatus) {
		try {
			Home homeAdd = new Home(squareFeet, address, city, state, zipCode, modelName, saleStatus);
			
			homes.add(homeAdd);
			System.out.println(homes.get(homes.size()-1));
			System.out.println("Number of homes: " + homes.size());
		}catch(Exception e) {
			System.out.println("Something went wrong! The home was not added to the inventory\n");
		}
	
	
	}
	
	
	public String removeHome() {
		try {
			Home removedHome = null;
			if(homes.size()>0) {
				removedHome = selectHome();
				homes.remove(removedHome);
			}
			else {
				return "You do not have any homes in the home inventory";
			}
			
			if (removedHome == null) {
				return "A home with those inputs was not found";
			}
			else {
				return "The following home has been removed from the inventory:\n" +removedHome;
			}
		}catch(Exception e) {
			return "Something went wrong! The home was not removed from the inventory.\n";
		}
	}
	
	
	public void printHomes() {
		try {
			for(int i = 0; i < homes.size(); ++i) {
				
				System.out.println((i + 1) + ") " + homes.get(i));
			}
		}catch(Exception e) {
			System.out.println("Something went wrong!");
		}
		System.out.println();
	}
	
	
	public void printHomesFile()throws IOException {
		try {	
			File myFile = new File(System.getProperty("user.home") + File.separator + "Homes.txt");
			FileOutputStream myStream = new FileOutputStream(myFile);
			BufferedOutputStream bout = new BufferedOutputStream(myStream, 1024);
			
			for (int i = 0; i < homes.size(); i++) {
				String homeText = homes.get(i).toString() + System.lineSeparator();
				bout.write(homeText.getBytes());
			}
			bout.flush();
			bout.close();
			System.out.println("File location: " + myFile.getAbsolutePath() + "\n");
			
		}catch(IOException e){
			System.out.println("Failed to save the file.\n");
		}
	
	}
	
	
	public String changeStatus(int status) {
		try {
			Scanner s = new Scanner(System.in);
			
			while ((status > 3) || (status < 1)) {
				System.out.println("That is not a correct input, please enter 1 for available, 2 for under contract, and 3 for sold.");
	
				status = s.nextInt();
			}
			
			String saleStatus = null;
			if (status == 1) {
				return saleStatus = "Available";			
			}
			else if (status == 2) {
				return saleStatus = "Under Contract";
			}
			else if (status == 3) {
				return saleStatus = "Sold";
			}
			else {
				return null;
			}

		}catch(Exception e) {
			return "Something went wrong! The sale status was not changed\n";
		}
	}
	
	public Home selectHome() {
		try {
			if (homes.size() > 0) {
			
				int i = -1;
				Scanner s = new Scanner (System.in);
				printHomes();
				System.out.println("Select the home number from the list of homes.");
				i = s.nextInt()-1;
				
				
				while ((i < 0 ) || (i >= homes.size())){
					System.out.println("That is not a valid input. Please select the home from the list of homes");
					printHomes();
					i = s.nextInt()-1;
					
				}
				return homes.get(i);
			}
			else {
				System.out.println("There are no homes in the home inventory.");
				return null;
			}
		}catch(Exception e) {
			System.out.println("Something went wrong! We were not able to select a home.");
			return null;
		}
	}
}
