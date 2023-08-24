package OVERLOADING;
import java.util.*;
public class Hospital {
String name;
String location;
Double mob;
public void m1(String n,String l,double m) {
	this.name=name;
	this.location=location;
	this.mob=mob;
System.out.println("name"+n);
System.out.println("location"+l);
System.out.println("mob"+m);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Hospital h=new Hospital();
	System.out.println("Enter name");
	String n=sc.next();
	System.out.println("Enter location");
	String l=sc.next();
	System.out.println("Enter mob");
	double m=sc.nextDouble();
	h.m1(n, l ,m );
}
	
}

