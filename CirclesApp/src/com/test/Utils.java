package com.test;

public class Utils {

	/**
	 * Print Current System Date in the "standard" output stream(Console)
	 * 
	 * @author Artem
	 * @since</h1>2019/01/30</h1>
	 */
	public static void printDate() {
		System.out.println("Current Date is " + new java.util.Date());
	}

	/**
	 * 
	 * @return random val from 0 to 100
	 */
//	public static int generateRandomValue() {
//		// int x = (int) (Math.random() * 101);
//		// System.out.println("Value was generated....");
//		// return x;
//
//		return generateRandomValue(100);
//
//	}
//
//	public static int generateRandomValue(int bound) {
//		int x = (int) (Math.random() * (bound + 1));
//		// System.out.println("Value was generated....");
//		return x;
//
//	}
//
//	public static double summa(double a, double b) {
//
//		return a + b;
//
//	}
//
//	public static double div(double a, double b) {
//
//		return a / b;
//	}
//
//	public static void print(int i) {//
//		print(i + "");
//	}
//
//	public static void print(String s) {//
//		System.out.println(s);
//	}
//
//	public static void print(double d) {//
//		print(d + "");
//	}
//
//	public static int findMax(int num, int bound) {
//		int max = 0;
//		for (int i = 0; i < num; i++) {
//			int a = ((int) (Math.random() * (bound + 1)));
//			System.out.println("Сгенерировано " + i + " число = " + a);
//			if (a > max) {
//				max = a;
//			}
//			if (a == bound)
//				break;
//		}
//
//		System.out.println("Max is = " + max);
//		return max;
//	}

	public static void fib(int num) {
		int first = 1;
		int second = 1;
		if(num<=0){
			throw new IllegalArgumentException("Wrong input " + num);
		}
		System.out.print(first + " " + second + " ");
		int i = 3;
		while (i <= num) {
			int fibonachi = first + second;
			System.out.print(fibonachi + " ");
			first = second;
			second = fibonachi;
			i++;
			
		}
	}

}
