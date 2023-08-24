package FileMaking;
import java.io.File;
import java.io.InvalidObjectException;
public class A {
public static void main(String[] args) throws Exception{
	File f=new File("C:\\Users\\Prasad\\Desktop\\File\\abc2.txt");
	

	Boolean b=f.createNewFile();
	if(b==true) {
		System.out.println("file created");
	}else {
		System.out.println("file not created");
	}
	File f1=new File("C:\\Users\\Prasad\\Desktop\\File\\abc3.pdf");
	Boolean b1=f1.createNewFile();
	if(b==true) {
		System.out.println("file created");
	}else {
		System.out.println("file not created");
	}
	File f2=new File("C:\\Users\\Prasad\\Desktop\\File\\abc4.jpg");
	Boolean b2=f2.createNewFile();
	if(b==true) {
		System.out.println("file created");
	}else {
		System.out.println("file not created");
	}
	File f3=new File("C:\\Users\\Prasad\\Desktop\\File\\abc5.doc");
	Boolean b3=f3.createNewFile();
	if(b==true) {
		System.out.println("file created");
	}else {
		System.out.println("file not created");
	}
	File f4=new File("C:\\Users\\Prasad\\Desktop\\File\\abc6.xlsm");
	Boolean b4=f4.createNewFile();
	if(b==true) {
		System.out.println("file created");
	}else {
		System.out.println("file not created");
	}
}
}
