package demo;

import java.util.Scanner;

public class Digitaddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre any number");
		int n = sc.nextInt();
		int sum = 0;

		while (n != 0) {
			int r = n % 10;//45%10=5
			sum = sum + r;//0+5=5
			n = n / 10;//45/10=4

		}
		System.out.println("sum:" + sum);
	}

}
