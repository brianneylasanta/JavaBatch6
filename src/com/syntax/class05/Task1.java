package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	int height;
	Scanner scan;
	scan=new Scanner(System.in);
	System.out.println("Please enter your height");
	height=scan.nextInt(); //dont forget to declare scan INT!
	if (height<60 ) {
	System.out.println("You are short");
	} else if (height>=60 && height<=72) {
	System.out.println("You are medium");
}else if (height>=72) {
	System.out.println("You are tall");
}
	


	

	}

}
