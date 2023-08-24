package com.cjc.abstractclass;
import java.util.*;
public class Test 
{
public static void main(String[] args) {
	
	Scanner sc= new Scanner (System.in);
	
	System.out.println("enter choice");
	int ch =sc.nextInt();
	if (ch==1){
	CAR c=new Automatic();
	c.start();
	c.stop();
	}else {
	CAR c1=new Manual();
	c1.start();
	c1.stop();
	
}
}}
