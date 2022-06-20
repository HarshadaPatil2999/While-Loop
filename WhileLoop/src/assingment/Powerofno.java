package assingment;
import java.util.Scanner;
public class Powerofno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base no");
		int base = sc.nextInt();
		System.out.println("enter power no");
		int index=sc.nextInt();
		int power=1;
		for(int i=1;i<=index;i++)
		{
			power=power*base;
		}
		System.out.println("power:"+power);
		
		
		
	}

}
