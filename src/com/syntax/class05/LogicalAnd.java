package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// if declared number is 
		// between 1 & 10 ---> the number is small
		// between 11 & 100 -- the is a big number
		//between 101-1000 --- this is a large number
		
		int num=178;
		
		if (num>=1 && num<=10) {
		
		System.out.println("This number is small");
		
	} else if (num>10 && num<=100) {
		
		System.out.println("This is a big number");
	} else if (num >100 && num<=1000) {
		System.out.println("This is a larger number");
	} else {
		System.out.println("This is super large");
	}
	

	}

}
