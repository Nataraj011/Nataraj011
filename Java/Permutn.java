package demopack;

public class Permutn {

	
	static void permut(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans+" ");
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String q=s.substring(0,i)+s.substring(i+1);
			permut(q,ch+ans);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		permut(a," ");
		

	}

}
