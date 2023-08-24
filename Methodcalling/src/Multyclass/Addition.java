package Multyclass;
import java.util.*;
public class Addition {

public void add()
{
	Scanner sc = new Scanner (System.in);
	System.out.println("first value");
	int a = sc.nextInt();
	System.out.println("second value");
	int b = sc.nextInt();
	
	int c = a+b;
	System.out.println(c);
	 }
public static void main(String[] args) {
	Addition a = new Addition ();
	a.add();
	
}

}
