package OVERLOADING;

public class Method {
public static void main(String[] args) {
	

	
		
	main("abc");
	
	   Method a = new Method();
		a.main(9,10.22f);
		System.out.println(a.main(1));
}
		
	
	public static void main(String s) {
		System.out.println("String main");
	}
	public void main(int x,float y)
	{
		System.out.println("int float main");
		}

	public double main(int c) {
		return 10 ;
	}
	
	
}
