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
				String homeText = homes.get(i).toString(