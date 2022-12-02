package com.bridgelabzregexuc3;
/* UC 3
E.g. abc.xyz@bl.co.in -
 Email has 3 mandatory parts (abc, bl & co) 
and 2 optional (xyz & in) with
precise @ and . positions*/

import java.util.Scanner;

public class UserRegistarctionMain {
	
	public static void main(String[] args) {
		UserRegistraction user =new  UserRegistraction();
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter 1 to Validate First Name: \nEnter 2 to Validate Last Name "
				+ "\nEnter 3 to Validate Email Address :");
		int choice = scan.nextInt();
		switch(choice) {
		
		case 1:
			user.validFirstName();
			break;
			
		case 2:
			user.validLastName();
			break;
			
		case 3:
			user.validEmailAddress();
			break;
			default:
				System.out.println("Invalid Enter");
		}
		scan.close();
	}

}
