package com.hackerrank.javaendoffile;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line;
		int i = 1;
		while (scanner.hasNext()) {
			line = scanner.nextLine();
			System.out.println(i + " " + line);
			i++;
		}
	}

}
