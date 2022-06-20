package demo;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no");
		int n = sc.nextInt();
	int mid = n / 2;
		int i = 2;

		while (i <= mid) {
			if (n % i == 0)
				break;
			i++;
		}
		
		if (i > mid)
			System.out.println("it is prime no");
		else
			System.out.println("it is not prime no");

		
	}

}
