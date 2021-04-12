package com.hackerrank.javavalidusernameregular;

import java.util.Scanner;

public class Solution {
	class UsernameValidator {
		public static final String regularExpression = "[A-Za-z]\\w{7,29}";
	}

	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scanner.nextLine());
		while (n-- != 0) {
			String userName = scanner.nextLine();

			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}
