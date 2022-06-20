package assingment;

import java.util.Scanner;

public class Factorialofanyno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no");
		int n = sc.nextInt();
	int i;
		int fact=1;
	for( i=1;i<=n;i++)
		{
			fact=fact*i;
		
		}
		System.out.println("factorial:"+fact);
		
}
}