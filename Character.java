package character;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String first;
		String last;
		String street;
		String city;
		String zip;
		
		System.out.println("You are creating a character. Enter your character's first name.");
		first = scnr.nextLine();
		System.out.println("Enter your character's last name.");
		last = scnr.nextLine();
		System.out.println("Enter your character's street name not including the city, state or zip code.");
		street = scnr.nextLine();
		System.out.println("Enter the city where your character lives.");
		city = scnr.nextLine();
		System.out.println("Enter the zip code where your character lives.");
		zip = scnr.nextLine();
		
		System.out.println("Your character has the following characteristics:");
		System.out.println(first);
		System.out.println(last);
		System.out.println(street);
		System.out.println(city);
		System.out.println(zip);
		
		

	}

}
