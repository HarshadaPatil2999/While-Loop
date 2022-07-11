package dowhiledemo;

import java.util.Scanner;

public class Menudrivendowhileloop {
	
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			char ch='n';
			
			do {
				System.out.println("press 1-Addition 2-Substraction 3-Multiplication 4-Division");
				System.out.println("enter your choice");
				int choice=sc.nextInt();
				System.out.println("enter any 2 numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				
				switch(choice)
				{
				case 1:System.out.println("Addition"+(a+b));
				break;
				case 2:System.out.println("Substraction"+(a-b));
				break;
				case 3:System.out.println("Multiplication"+(a*b));
				break;
				case 4:System.out.println("Division"+(a/b));
				break;
				default:
					System.out.println("invalid input");
				}
				System.out.println("do you want continue:y/n");
		ch=sc.next().charAt(0);
			}while(ch=='y'||ch=='Y');
					System.out.println("done");
			
			
		

	}
	}
