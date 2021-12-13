package com.bridgelabz.logicalprogramming;

import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = 0;
		 
		 System.out.print("Enter Any Numebr To Start: ");
		 sc.nextInt();
		 long start = System.nanoTime();
		 long end = 0;
		 while( n != 1 ){
			 System.out.print("Enter 1 To Stop: ");
			 n = sc.nextInt();
			 switch(n) {
			 case 1:
				 end=System.nanoTime();
			 }
		 }
		 float ElapseTime = (float)((end - start)*Math.pow(10 , -9));
		 System.out.print("ElapseTime is: "+ElapseTime);
	}
}
