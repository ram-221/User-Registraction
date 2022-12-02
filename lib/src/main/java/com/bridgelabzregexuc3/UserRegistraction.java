package com.bridgelabzregexuc3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistraction {

	static Scanner scan = new Scanner(System.in);
	
	/* UC 1*/
	public void validFirstName() {
			System.out.println("Enter Valid Email Address :");
		String name = scan.next();
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("First Name is Valid");
		}
		else {
			System.out.println("First NAme is Invalid");
		}
	}
	
	/* UC 2*/
	public void validLastName() {
		System.out.println("Enter the Last Name :");
		String lName = scan.next();
		String lRegex ="^[A-Z][a-z]{3,}";
		Pattern p = Pattern.compile(lRegex);
		Matcher m = p.matcher(lName);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("Last Name is Valid");
		}
		else {
			System.out.println("Last Name is InValid");
		}
	}
	
	/* UC 3*/
	public  void validEmailAddress() {
		System.out.println("Enter the Last Name :");
		String lName = scan.next();
		String lRegex ="abc[a-zA-Z0-9]*[@]bl[.]co[a-zA-Z0-9]*";
		Pattern p = Pattern.compile(lRegex);
		Matcher m = p.matcher(lName);
		boolean b = m.matches();
		
		if(b) {
			System.out.println("Email Address is Valid");
		}
		else {
			System.out.println("Email Address InValid");
		}
	}
}
