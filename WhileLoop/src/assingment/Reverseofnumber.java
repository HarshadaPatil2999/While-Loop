package assingment;

import java.util.Scanner;

public class Reverseofnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no");
		int n = sc.nextInt();
		int rev = 0;
		while (n > 0) 
		{
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		
		}System.out.println("reverse no:" + rev);
	}
}
