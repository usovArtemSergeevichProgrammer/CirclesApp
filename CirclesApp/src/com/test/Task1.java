package com.test;

public class Task1 {

	public static void main(String[] args) {
		// for(int i=1;i<=10;i++){
		//
		// if(i != 10){
		// System.out.print(i + ", ");
		// }else{
		// System.out.print(i + ".");
		// }
		//
		// }

		for (int i = 1; i < 50; i++) {
			System.out.print(i * i + ", ");
		}

		System.out.println("");

		for (int i = 1; i < 150; i++) {
			System.out.print(i * 5 + ", ");
		}

		System.out.println("");

		// 3////
		for (int i = 1; i < 26; i++) {
			if (i == 25) {
				System.out.print((-1) * i + ".");
			} else {
				if (i % 2 == 0) {
					System.out.print(i + ", ");
				} else {
					System.out.print((-1) * i + ", ");
				}
			}
		}

		System.out.println("");

		// 4////
		// for (int i = 500; i > 0; i--) {
		// if (i % 2 != 0) {
		// System.out.print(i + ", ");
		// } else {
		// System.out.print("-" + i + ", ");
		// }
		// }
		for (int i = 0, val = 500; i < 500; i++) {
			System.out.print(val + " ");
			val = val - 1;
		}

		System.out.println("");

		boolean flag = true;
		for (int i = 1; i <= 25; i++) {
			if (flag) {
				System.out.print((-1) * i + " ");
			} else {
				System.out.print(i + " ");
			}
			flag = !flag;
		}

		System.out.println();

		for (int i = 0; i < 20; i++) {
			System.out.print((int) (Math.random() * 101) + " ");
		}

		System.out.println();

	}

}
