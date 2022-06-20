package assingment;

import java.util.Scanner;

public class Oddno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 521;
		int i = 229;
		while (n >= i) {
			if (n % 2 != 0)
				System.out.println(n);
			n--;

		}
		sc.close();
	}

}
