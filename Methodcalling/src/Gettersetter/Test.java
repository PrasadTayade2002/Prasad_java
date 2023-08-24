package Gettersetter;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("enter the id");
		e.setId(sc.nextInt());
		System.out.println("enter the name");
		e.setName(sc.next ());
		System.out.println("enter the salaryy");
		e.setSalary(sc.nextFloat());
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
	
	

}
