package com.cjc;

public class Mysql implements Connection{
public void commit() {
	System.out.println("coomit.sql");
}
public void rollback() {
	System.out.println("rollback.sql");
}
}
