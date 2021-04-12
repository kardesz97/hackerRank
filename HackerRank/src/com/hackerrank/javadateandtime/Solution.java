package com.hackerrank.javadateandtime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

class Result {
	public static String findDay(int month, int day, int year) {
		int d = Integer.valueOf(day);
		int m = Integer.valueOf(month);
		int y = Integer.valueOf(year);
		LocalDate date = LocalDate.of(y, m, d);
		return date.getDayOfWeek()
				.toString();
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine()
				.replaceAll("\\s+$", "")
				.split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);
		int day = Integer.parseInt(firstMultipleInput[1]);
		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(month, day, year);

		bufferedWriter.write(res);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}