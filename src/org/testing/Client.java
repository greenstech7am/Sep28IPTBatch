package org.testing;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {

		// 38. Right pyramid

		int num = 5;

		// 1
		// 12
		// 123
		// 1<=5 T
		for (int i = 1; i <= num; i++) {

			// Only for space
			// 5 0>=1 F
			for (int j = num; j >= i; j--) {
				System.out.print(" ");
			}

			// 2<=1 F
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();

		}
		System.out.println("Checking");
		System.out.println("Cloned Test");

		System.out.println("Kannan Updated");
		System.out.println("Kavin added new code after takng updated copy from master");
		System.out.println("Hello How are you");
		System.out.println("Kavin 2nd updated");

	}

}
