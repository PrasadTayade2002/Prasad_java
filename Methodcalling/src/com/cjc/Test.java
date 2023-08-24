package com.cjc;

public class Test {
public static void main(String[] args) {
	Connection i=new Oracle();
	i.commit();
	i.rollback();
	Connection i1=new Mysql();
	i1.commit();
	i1.rollback();
}
}
