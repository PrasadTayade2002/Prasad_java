package FileMaking;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
public class W {
public static void main(String[] args)throws Exception {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\n enter folder name");
	String p=sc.next();
	File f =new File("C:\\Users\\Prasad\\Desktop\\prasad java\\cjc\\"+p);
	
	
	
	
	boolean b=f.mkdir();
	if (b==true) {
		System.out.println("created");
	}
	else {
		System.out.println("not");
	}{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("\n enter file name");
		String file=sc.next();
		File f1 =new File("C:\\Users\\Prasad\\Desktop\\prasad java\\cjc\\"+p+"\\"+file);
		boolean b1=f1.createNewFile();
		if (b1==true) {
			System.out.println("created");
		}
		else {
			System.out.println("not");
		}
	
	Scanner sc2=new Scanner(System.in);
	FileWriter f3=new FileWriter(file,true);
	System.out.println("enter name");
	String info=sc.next();
	
	f3.write(info);
	f3.flush();
	
	}	
}
}
