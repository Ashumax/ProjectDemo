package practice2;

import java.util.Arrays;

public class enumVararg {
	
		
	
	

	public void m(int k,int...i)
	{
		System.out.println("value of k  "+k);
		for (int j : i) {
			System.out.println("----"+j); /* doubt*/
		}
	}
	public static void main(String[] args) {
		
		enumVararg e=new enumVararg();
		e.m(11,11,345);
		e.m(12,12,543);
//		week.m1("ascd");
	//	week.m1("ascd","ashgajsg");

	
		
	}

}



