package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {

		for (int h = 0; h < 24; h++) {
			for (int min = 0; min < 60; min++) {
				if (min < 10) {
					System.out.println(h + ":0" + min);
				} else {
					System.out.println(h + ":" + min);
				}
			}

		}

	}
}
