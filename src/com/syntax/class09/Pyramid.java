package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= r; c++) { //columns always going to have a dependency of rows r=row c=column 
				System.out.print("*");
			}
			System.out.println();
		}
			for(int rTwo= 1; rTwo<=5; rTwo ++) {
				for (int c =1; c<=5; c++) {
				System.out.print(c+ "");
				
				}
				System.out.println();
				
				}
			System.out.println("----------------");
			for (int row=5; row>=1; row--) {
				for (int col=1; col<=row; col++) {
					System.out.print(row);
				}
			System.out.println();
			}
		}

	}


