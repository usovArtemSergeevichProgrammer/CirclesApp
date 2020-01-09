package com.test;

import java.util.Scanner;

public class GuessNumberAPP {

	public static void main(String[] args) {
		System.out.println("Random value was generrated!...");
		// System.out.println("from 1 to 5");
		Scanner sc = new Scanner(System.in);
		int from, to;
		System.out.println("Input FROM bound:");
		from = sc.nextInt();
		System.out.println("Input FROM bound:");
		to = sc.nextInt();

		int attempts = 3;
		boolean isWin = false;

		if (from < to) {

			int x = from + (int) (Math.random() * (to - from + 1));// random val

			// 1 st
			System.out.println("Try to guess 1 :");

			int answer = sc.nextInt();
			if (x == answer) {
				System.out.println("YOU WIN!");
				isWin = true;
			} else {
				// System.out.println("YOU LOSE! =( ");
				attempts--;
			}
			// 2nd
			if (!isWin && attempts != 0) {
				System.out.println("Try to guess 2 :");
			}

		} else {
			System.out.println("BAD!!!");
		}

		sc.close();

	}

}
