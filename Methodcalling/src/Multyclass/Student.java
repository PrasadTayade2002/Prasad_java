package Multyclass;
import java.util.*;
public class Student {
public void Data()
{ 
 Scanner sc = new Scanner(System.in);
  
 

 
 System.out.println("Name of the student ");
 String n = sc.next();
 
 System.out.println("Roll no of the student ");
int a= sc.nextInt(); 
 
 System.out.println("enter the total marks obtain");
  double  o =sc.nextInt();
  System.out.println("enter the total marks ");
  double t =sc.nextInt();
 
  

  double p = o / t * 100.0;
  
  System.out.println("percentage"+p);
 if(p >= 60)
	 System.out.println("pass");
 else
	 System.out.println("fail");
  }
  

public static void main(String[] args) {
	Student s = new Student();
	s.Data();
}
}
