package demo;

import java.util.Scanner;

public class Highestdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre any number");
		int n = sc.nextInt();
		int large = 0;

		while (n != 0) {
			int r = n % 10;
			if (large < r) 
			{
				large = r;

			}
			n = n / 10;
		}

		System.out.println("hightest digit:" + large);

	}

}
