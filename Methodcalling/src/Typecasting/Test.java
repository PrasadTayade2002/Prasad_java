package Typecasting;


public class Test {
public Employee setDeveloper() {
	Developer d= new Developer();
	d.eid=10;
	d.name="abc";
	d.prog=55;
	return d;
}

public Employee setTester() {
	Tester t = new Tester();
	t.eid=11;
	t.name="xyz";
	t.t=10;
	return t;
}
public static void main(String[] args) {
	Test t1=new Test();
	Employee e= t1.setDeveloper();
	System.out.println(e.eid);
	System.out.println(e.name);
	
	Tester t2=(Tester)t1.setTester();
	System.out.println(t2.eid);
	System.out.println(t2.name);
	System.out.println(t2.t);
}
}
