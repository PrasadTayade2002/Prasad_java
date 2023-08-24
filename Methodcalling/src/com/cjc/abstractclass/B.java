package com.cjc.abstractclass;

public class B extends  A{
	public void m1() {
		System.out.println("m1-b");
	}
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
		
	
	}
}
