package practice1.poly;

import java.util.*;

public class mappingExamples {

	public static void main(String[] args) {
		
		Emp e1= new Emp(12,"yogesh");
		Emp e2=new Emp(15,"Ashish");
		Emp e3=new Emp(18,"sangram");
		Emp e4=new Emp(22,"yogesh");
		
		Map<Emp, String> h=new HashMap<Emp, String>();
		
		h.put(e1,"pqr");
		h.put(e2,"PQR");
		h.put(e3,"wxy");
		h.put(e4,"WXY");
		
		System.out.println("Direct..................");
		System.out.println(h);
		for (Map.Entry<Emp, String> string : h.entrySet()) {
			System.out.println(string);
		}
		System.out.println("With Iterator.....................");
		Iterator<Map.Entry<Emp, String>> itr=h.entrySet().iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
	}
	
	
}