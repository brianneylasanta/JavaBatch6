package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		String [] [] groceries= {
				{"cucumber", "potato", "carrot"},
				{"mango", "apple", "banana", "kiwi"},
				{"milk", "cheese", "yogurt",}
		};
		System.out.println(groceries [1][2]);
		
		//to get all values from 2d array
		for(int r=0; r<groceries.length; r++) {
			for (int c=0; c<groceries [0].length; c++) {
				System.out.println(groceries [r][c]);
			}
		}
				
		}

	}


