package com.cjc;

public class Oracle implements Connection {
 
public void commit() {
	System.out.println("commit.Oracle");
}
public void rollback() {
	System.out.println("Rollback.Oracle");
}

}
