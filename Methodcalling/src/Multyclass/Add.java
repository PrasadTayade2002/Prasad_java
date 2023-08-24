package Multyclass;

import java.util.Scanner;

public class Add {
	public void sum()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("first no.");
		float a= sc.nextFloat();
	
		System.out.println("second no.");
		float d= sc.nextFloat();
		float c= a+d;
		System.out.print("addition is "+c);
		
		
	}
	public static void main(String[] args) {
		Add a= new Add();
		a.sum();
	}
	

}
