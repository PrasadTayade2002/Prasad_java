package OVERLOADING;

public class Typecast {
public void m1(String s) {
	
	System.out.println("m1 string"); 
	
	
}
public void m1 (Typecast p) {
	System.out.println("m1 typecasst");
}

public static void main(String[] args) {
	Typecast t = new Typecast ();
	t.m1((Typecast)null);
}
}
