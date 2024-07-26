package java_basic;

import java.util.Scanner;
public class Addition 
{
	public static void main(String[] args)
	  {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter a trainer name:");
		String name;
		name = sc.nextLine();
		
		c=a+b;
		System.out.print("addition"+ a +"addition"+b+"addition of a+b"+c);
		System.out.println("Trainer name"+name);
	  }

}