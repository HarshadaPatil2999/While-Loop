package demo;

import java.util.Scanner;

public class Threetable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, n = 30;

		while (i <= n) {
			if (i%3==0)

				System.out.println(i);

			i++;
			
		}
		sc.close();
		
		
	}
}
