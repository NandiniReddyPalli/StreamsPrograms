package com.cnts.streams;

public class DaimondPattern {
	public static void main(String[] args) {
		int num = 5;
		int spaces = num - 1;
		int start = 1;
		for (int num1 = 1; num <= 5; num1++) {
			for(int num2=1;num2<=spaces;num2++) {
				System.out.print(" ");
			}
			for(int num3=1;num3<=2*num-1;num3++) {
		
				System.out.print("*");
			}
			
		}
		
	}
}
