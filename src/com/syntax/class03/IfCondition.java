package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		// Declare a number and compare if number is larger than 100
		//if number is larger than 100 ---> my number is large
		
		System.out.println("Starting coding");
		
		int num=78;
		if(num>100) {
			System.out.println("My number is large");
		}
			 System.out.println("End of the program");
			
			 System.out.println("---------");
			 
			 int expectedHours=15;
			 int actualHours=15;
			 //if actual is more than expected --> you will love java
			 
			 if(actualHours>=expectedHours) {
				 System.out.println("You will love Java");
				 
			 }else {//otherwise (if false) ---> go inside else block
				 System.out.println("You will not like Java");
				 
				 
			 }
			 
			 System.out.println("-------");
			 
			 double budget=100000;
			 double carPrice=12000;
			 
			 if(budget>carPrice) {
				 System.out.println("I will buy this car today");
			 }else { 
				 System.out.println("I will not buy this car today,"
				 + "I will go learn Java");
			
			 }
			 System.out.println("I am code after if condition");
			}
	}
			



