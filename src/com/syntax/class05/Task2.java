package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
	System.out.println("Enter a number"); 
	int day=d.nextInt();
	if (day>=1 && day<=5) {
		System.out.println("It is a weekday");
		
		
	}else if (day>=6 && day<=7) {
		System.out.println("It is the weekend");
		
	}
	else {
		System.out.println("it is invalid day");
	}

	}

}
