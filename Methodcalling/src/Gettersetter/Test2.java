package Gettersetter;
import java.util.*;
public class Test2 {
public static void main(String[] args) {
	Engine e=new Engine();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Weight");
	e.setWeight(sc.nextFloat());
	System.out.println("Enter type");
	e.setType(sc.next());
	System.out.println("Enter capacity");
	e.setCap(sc.nextInt());
	System.out.println(e.getWeight());
	System.out.println(e.getType());
	System.out.println(e.getCap());
}
}
