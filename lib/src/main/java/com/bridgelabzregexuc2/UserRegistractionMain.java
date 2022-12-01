package com.bridgelabzregexuc2;

/* UC 2
Name - Last name starts with Cap and has minimum 3 characters*/

import java.util.Scanner;

public class UserRegistractionMain {

	public static void main(String[] args) {
		UserRegistraction user =new  UserRegistraction();
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter 1 to Validate First Name: \nEnter 2 to Validate Last Name :");
		switch(scan.nextInt()) {
		
		case 1:
			user.validFirstName();
			break;
			
		case 2:
			user.validLastName();
			break;
		}
		scan.close();
	}
}
