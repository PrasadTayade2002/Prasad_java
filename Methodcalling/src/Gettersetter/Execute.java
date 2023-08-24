package Gettersetter;
import java.util.*;
public class Execute {
public static void main(String[] args) {
	Company c=new Company();
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter id");
	c.setId(sc.nextInt());
	System.out.println("enter name");
	c.setName(sc.next());
	System.out.println("Enter add");
	c.setAdd(sc.next());
	System.out.println(c.getId());
	System.out.println(c.getName());
	System.out.println(c.getAdd());
	

	
	
	
	
	
	
	
	
}
}
