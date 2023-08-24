package Gettersetter;

import java.util.*;
public class Testt {
public static void main(String args []) {
	Student s= new Student();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter roll no");
	s.setRno(sc.nextInt());
	System.out.println("enter name");
	s.setName(sc.next());
	System.out.println("enter add");
	s.setAddress(sc.next());
	
	System.out.println(s.getRno());
	System.out.println(s.getName());
	System.out.println(s.getAddress());
}
}
