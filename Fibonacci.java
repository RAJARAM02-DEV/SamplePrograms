package com.practice;

import java.util.*;

public class Fibonacci {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a = -1, b = 1, sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count for Fibonacci Sequence: ");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
	}
}
