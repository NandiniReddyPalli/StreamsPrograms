package com.cnts.streams;

public class SquarePattern {
	public static void main(String[] args) {
		int num = 5;
		for (int value = 1; value <= 5; value++) {
			for (int value2 = 1; value2 <= 5; value2++) {

				if (value == 1 || value2 == 1 || value == num || value2 == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
