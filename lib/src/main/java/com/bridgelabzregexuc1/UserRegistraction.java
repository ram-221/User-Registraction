package com.bridgelabzregexuc1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistraction {
	 public static final Scanner scanner = new Scanner(System.in);

	 static Scanner scan = new Scanner(System.in);
		public static void validFirstName() {
			System.out.println("Enter The First Namr :");
			String name = scan.next();
			String regex ="^[A-Z]{1}[a-z]{2,}";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(name);
			boolean b = m.matches();
			
			if(b) {
				System.out.println("First Name is Valid");
			}
			else {
				System.out.println("First Name is InValid");
			}
		}
}
