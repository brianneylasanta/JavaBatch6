package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Ask user to enter their country and capture it. Once values are captured print which language user speaks.

		Scanner scan;
		String country;
		String nativeLanguage;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country= scan.nextLine();
		
		switch (country) {
		case "United States":
		nativeLanguage="English"; 
		break;
		case "Italy":
			nativeLanguage="Italian";
			break;
		case "France":
			nativeLanguage="French";
			break;
		case "Spain":
			nativeLanguage="Spanish";
			break;
			default:
				nativeLanguage="Unknown";
		}
				System.out.println("Your native language is "+nativeLanguage);
				
		
		}
		
	}


