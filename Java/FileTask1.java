package demopack;
import java.util.*;
import java.io.*;
public class FileTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		File f=new File("D:\\"+a);
		File f1=new File("D:\\"+a+"\\"+b);
		if(f1.isFile()) {
			System.out.println(f1);
			
		}
		else if(f.isDirectory()) {
			File[] ff=f.listFiles();
			for(File fi:ff) {
				System.out.println(fi);
			}
		}
	
		else {
			System.out.println("File not found");
		}
		
	}

}
