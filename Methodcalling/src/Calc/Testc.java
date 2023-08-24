package Calc;
import java.util.*;
public class Testc {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	Calc p=new Calc();
	System.out.println("Press 1 for Addition"
			+ "\npress 2 for Substraction"
			+ "\nPress 3 for Multiplication"
			+ "\nPress 4 for Division" );
	
	
	
	while(true)
	{
		System.out.println("enter fisrt number");
		int a=sc.nextInt();
		p.a=a;
		System.out.println("enter second number");
		int b=sc.nextInt();
		p.b=b;
	System.out.println("enter choice");	
	int ch=sc.nextInt();
	if(ch==1)
	{
		p.add();
	}
	 else if(ch==2)
	{
		p.sub();
	}
	 else if(ch==3)
	{
		p.multi();
	}
	else if(ch==4)
	{
		p.division();
	}
	else if (ch==5)
	{
		break;
	}
	
	else 
	{
	System.out.println("wrong choice");
	}
}
}
}