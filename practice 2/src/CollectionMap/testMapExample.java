package CollectionMap;

import java.util.Map.Entry;
import java.util.*;

public class testMapExample {

	public static void main(String[] args) {
		Address ad1=new Address("mumbai",12345);
		Address ad2=new Address("pune",12346);
		Address ad3=new Address("latur",12347);
		Address ad4=new Address("nashik", 44444);
		Address ad5=new Address("akola", 55555);
		
		employee e1=new employee(16,"Swapnil",ad1);
		employee e2=new employee(17,"ashu",ad2);
		employee e3=new employee(19,"abhijeet",ad3);
		employee e4=new employee(154,"amol",ad2);
		employee e5=new employee(12,"balaji",ad1);
		
		Map<employee,String> hm=new HashMap<employee,String>();
		hm.put(e1,"ABC");
		hm.put(e2,"abc");
		hm.put(e3,"pqr");
		hm.put(e4,"Xyz");
		hm.put(e5,"Pqr");
		hm.put((new employee(100,"yogesh sir ",ad5)),"rrrrr");
		System.out.println("direct hashmap print......"+hm);

		Map<employee,String> lhm=new LinkedHashMap<employee,String>(hm);
		
		lhm.put(e5,"e5");
		lhm.put(e2,"e2");
		lhm.put(e3,"e3");
		lhm.put(e4,"e4");
		lhm.put(e1,"e1");
		lhm.put((new employee(100,"yogesh",ad4)),"hhhh");
		
		System.out.println("direct linkedhashmap print......"+lhm);
		
		
		Map<employee,String> ht=new Hashtable<employee,String>();
		ht.put(e1, "hashtable 1");
		ht.put(e4, "hashtable 2");
		ht.put(e3, "hashtable 3");
		
		useOfLooping(hm);
		useOfLooping(ht);
	}
	
		static void useOfLooping(Map<employee,String> obm)
		{
			System.out.println("\n.....using iterator.......");
			//Set s=obm.entrySet();
		/*	Iterator<Map.Entry<employee,String>> itr= obm.entrySet().iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next());
			}
			System.out.println("\n");
		*/	   Set<employee>set= obm.keySet();
			   Iterator<employee> i=set.iterator();
			  for (employee employee : set) {
				
		
				  
				  System.out.println("<<<<<keys>>>>"+employee);
				  System.out.println("//////"+obm.get(employee));
			  }
			
			System.out.println("\n");
		//	System.out.println("....using for loop.......");
			Set <employee> st=obm.keySet();
			List <employee> ls=new ArrayList<>(st);
			
			
		
			

			System.out.println("....using forEach loop.......");

			for (employee emp : st) {
				System.out.println("keys...."+emp);
				System.out.println("values..."+obm.get(emp));
			}
			
			if(obm instanceof Hashtable)
			{
			System.out.println("using enumerator...");
			
			Hashtable<employee,String> ht=(Hashtable<employee,String>)obm;
					
					Enumeration<String> er=ht.elements();
					Enumeration<employee>er1= ht.keys();
					while (er.hasMoreElements()) {
						String string = (String) er.nextElement();
						System.out.println("values of hashtable ==="+string);
						
						
					}
					
					while (er1.hasMoreElements()) {
						employee employee = (employee) er1.nextElement();
						System.out.println("keys of hashtable====="+employee);
					}
			
			}
		}

}
