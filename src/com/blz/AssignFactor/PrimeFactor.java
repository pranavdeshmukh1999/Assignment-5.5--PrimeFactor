package com.blz.AssignFactor;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {

		System.out.println("Compute Prime Factorization Program");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();

		for (int i = 3; i <= number; i++) {
			while (number % i == 0) {
				System.out.println(i);
				number = number / i;
			}
		}

	}
}
