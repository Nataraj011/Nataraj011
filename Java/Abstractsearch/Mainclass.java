package demopack;
import java.util.*;

public class Mainclass {

	public static void main(String[] args) {
		Object obj[]=new Object[5];
		
		
		Empclass obj1=new Empclass(1,"sai");
		Empclass obj2=new Empclass(2,"Praveen");
		Empclass obj3=new Empclass(3,"saif");
		Empclass obj4=new Empclass(4,"sudharchanan");
		Empclass obj5=new Empclass(5,"sudharchan");
		
		obj[0]=obj1;
		obj[1]=obj2;
		obj[2]=obj3;
		obj[3]=obj4;
		
		Integersearch in=new Integersearch();
		System.out.println(in.search(obj,obj3));
		
		
		
		
		
		
	}

}
