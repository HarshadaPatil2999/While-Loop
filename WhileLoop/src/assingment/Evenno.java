package assingment;

import java.util.Scanner;

public class Evenno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 121;
		int n = 229;

		 for(i=121;i<=n;i++)
		 {
			if (i % 2 == 0)
				System.out.println(i);
		}


		sc.close();
	}

}
