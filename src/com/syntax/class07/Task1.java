package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		// how to print odd numbers from 1 to 20
	// 1 ways incrementing by 2
		int num = 1;
		while(num <20) {
			System.out.println(num);
			num+=2;
			}
		// 2 way using mod and if condition
		System.out.println("-------");
		int num4=1;
		while(num4<=20){
			if (num4 % 2 !=0) {
				System.out.println(num4); }
			num4++;
			}
		}
	
		
	}


