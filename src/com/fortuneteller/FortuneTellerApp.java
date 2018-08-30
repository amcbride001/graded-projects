package com.fortuneteller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("What is your age?");
		int userAge = input.nextInt();

		System.out.println("What is your birth month? Use numbers.");
		int userBirth = input.nextInt();

		System.out.println("What is your favorite ROYGBIV color? If unsure what ROYBIV is  type Help.");
		String royGbiv = input.nextLine();
		

		String typeHelp = input.nextLine();
		System.out.println("red, orange, yellow, green, blue, indigo, violet.");
		System.out.println();
		input.nextLine();

		System.out.println("How many siblings do you have?");
		int userSiblings = input.nextInt();

		System.out.println("Retirement " + "Years ");
		System.out.println();
		System.out.println("Your number of years until retirement " + "will be based on your age.");
		System.out.println();

		if (userAge >= 35) {
			System.out.println("You've done well and only have 7 more years of work ahead of you before retirement!");
			System.out.println();
		}
		if (userAge <= 34) {
			System.out.println("Oh no. You've got 20 more years until retirement.");
			System.out.println();
		}
		System.out.println("Based on your age your vacation home will be located in...");
		System.out.println();

		if (userSiblings == 0) {
			System.out.println("Your vacation home is on Cybertron.");
			{

			}
			if (userSiblings == 1)
				;
			System.out.println("Your vacation home is in Gotham City.");
		}
		if (userSiblings == 2) {
			System.out.println("Your vacation home is in Quahog, Rhode Island.");
		}
		if (userSiblings == 8) {
			System.out.println("Your vacation home is in Wakanda");
		}
		if (userSiblings > 3) {
			System.out.println("Your vacation home is in Atlantis");
		}
		if (userSiblings < 6) {
			System.out.println("Your vacation home is located in Zumunda");
		}
		if (userSiblings < 0) {
			System.out.println("Your vacation home is located on the bank of the River Styx");
			System.out.println();
			System.out.println("Next will be your mode of transportation... ");
			System.out.println();
		}
		if (royGbiv == ("red") ) {
			System.out.println("Based off your choice of color your mode of transportation will be a hover board.");
		}
		if (royGbiv == ("orange") ) {
			System.out.println("Based off your choice of color your mode of transportation will be an ox.");
	}
		if (royGbiv == ("yellow") ) {
			System.out.println("Based off your choice of color your mode of transportation will be a Lamborghini.");
}
		if (royGbiv == ("green") ) {
			System.out.println("Based off your choice of color your mode of transportation will be a sleigh.");
		}			
		if (royGbiv == ("blue") ) {
			System.out.println("Based off your choice of color your mode of transportation will be a Ducati.");
		}
		if (royGbiv == ("indigo") ) {
			System.out.println("Based off your choice of color your mode of transportation will be an area 51 seized space cruiser.");
		}
		if (royGbiv == ("violet") ) {
		
System.out.println("Based off your choice of color your mode of transportation will be a magic fingers bed." + "Don't forget your quarters.");
}
		if (userBirth == 0) {
		System.out.println("Your bank account at the time of your retirement will be $3,000,000.");
		}
		if (userBirth <=4) {
			System.out.println("Your bank account at the time of your retirement will be $500,000.");
		}
		if (userBirth <=9) {
			System.out.println("Your bank account at the time of your retirement will be $100,000,000.");
		}
		if (userBirth == 10) {
			System.out.println("Your bank account at the time of your retirement will be $10,000.");
		}
		if (userBirth >10) {
			System.out.println("Your bank account at the time of your retirement will be $23,000.");
//*[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank, 
//a vacation home in *[location]*, and travel by *[mode of transporation]*.
		}
		}
	
	}		
