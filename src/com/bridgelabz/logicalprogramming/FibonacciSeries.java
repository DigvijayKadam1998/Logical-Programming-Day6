package com.bridgelabz.logicalprogramming;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int n = 10;
		System.out.println(a + " " + b);
		for(int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.println( "  " + c);
			a = b;
			b = c;
			
		}
		
	}
}
