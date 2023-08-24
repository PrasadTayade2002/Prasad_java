package com.cjc;
import java.util.Scanner;
public class Detail implements PersonalDeatils{
Scanner sc =new Scanner(System.in);
	public void name() {
	System.out.println("Enter name of student");
	String s=sc.next();
	
	
}
	@Override
	public void rollno() {
		System.out.println("enetr roll no");
		int x=sc.nextInt();
		
	}
	public static void main(String[] args) {
		PersonalDeatils r=new Detail();
		
		r.rollno();
		r.name();
	}
}
