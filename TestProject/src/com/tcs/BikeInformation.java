 package com.tcs;

import java.util.InputMismatchException;

public class BikeInformation {

		public static void main(String[] args) {
		System.out.println(100);
		System.out.println(100);
		try {
			System.out.println(100/0);
		}catch(InputMismatchException y) {
			System.out.println("nothing");
			
		}catch(ArithmeticException s) {
			System.out.println("yes");
		}catch(Exception e) {
			System.out.println("100");
		}
		
		System.out.println(100);
		System.out.println(100);
		
	}
	

}
