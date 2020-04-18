package com.syntax.class07;

import java.util.Scanner;

public class Task03 {
	//we are playing a lottery and a luck number is 17
    //ask user any number 1-20 until he guess our number---->

	public static void main(String[] args) {
		Scanner scan;
		int number;
		int luckyNum = 17;
		scan = new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 20");
		number=scan.nextInt();
		} while (number!= luckyNum);
			
System.out.println("Congrats, you guessed the right number!!");
			
		}
		
		

	}


