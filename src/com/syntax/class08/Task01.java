package com.syntax.class08;

public class Task01 {

	public static void main(String[] args) {
		// write a program to calculate sum of odd and even numbers 1-99
		int evenSum=0; //always declare variable value
		int oddSum=0;
		
		for(int i=1; i<=99; i++) {
			if(i%2==0) {
				evenSum=evenSum+1;
			} else {
				oddSum=oddSum+1;
				
				
			}
		}
	      System.out.println("Sum of evens ="+ evenSum);
	      System.out.println("Sum of odds ="+ oddSum); 

	}

}
