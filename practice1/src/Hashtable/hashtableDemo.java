package Hashtable;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class hashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Class vl1=new Class(34.32,"first");
		Class vl2=new Class(86,"second");
		Class vl3=new Class(86,"third");
		
		
		abc a1=new abc(34,"asddd",vl1);
		abc a2=new abc(44,"bff",vl2);
		abc a3=new abc(44,"ghd",vl3);
		abc a4=new abc(444,"aaaabbbb",vl3);
	
		
		Map<abc,String> ht1=new HashMap<abc,String>();
		ht1.put(a1,"hmap1");
		ht1.put(a2,"hmap2");
		ht1.put(a4,"hmap3");
		System.out.println("hashmap size="+ht1.size());
		System.out.println("elemts of hashmap="+ht1);
		
	
		Map<abc,String> ht2=new WeakHashMap<abc,String>();
		ht2.put(a1,"hmap1");
		ht2.put(a2,"hmap2");
		ht2.put(a4,"hmap3");
		System.out.println("weakhashmap size="+ht2.size());
		System.out.println("elemts of weakhashmap="+ht2);
		a4=null;
		System.gc();
		System.out.println("hashmap size after null and using gc="+ht1.size());
		System.out.println("elemts of hashmap after making null="+ht1);
		System.out.println("weakhashmap size after null and using gc="+ht2.size());
		System.out.println("elemts of weakhashmap after making null="+ht2);
	
		
		Map<abc,Integer> ht=new Hashtable<abc,Integer>();
		ht.put(a1,22);
		ht.put(a2,11);
		ht.put(a3,33);
		//ht.put(a4,22);
			System.out.println("size of hashtable==="+ht.size());
			
		//	LoopOf(ht);
		
	}

		static void LoopOf(Map ob)
		{
			if(ob instanceof Hashtable) 
			{
					Hashtable<abc,Integer> h= 	(Hashtable<abc,Integer>) ob;
				Enumeration<Integer> er1= h.elements();
				Enumeration<abc> er2 = h.keys();
				//Enumeration<Map.Entry<abc,Integer>> er = (Enumeration<Entry<abc, Integer>>) h.entrySet();
				
				while (er2.hasMoreElements()) {
					abc abc = (abc) er2.nextElement();
					System.out.println("keys =="+abc);
					
				}
				
				while (er1.hasMoreElements()) {
					Integer i = (Integer) er1.nextElement();
					System.out.println("values =="+i);
				}
			}
		}
}


class abc{
	
	int x;
	String name;
	Class v;
	public abc(int x, String name, Class v) {
		super();
		this.x = x;
		this.name = name;
		this.v = v;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	//	result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((v == null) ? 0 : v.hashCode());
		//result = prime * result + x;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		abc other = (abc) obj;
		//if (name == null) {
			//if (other.name != null)
				//return false;
		//} else if (!name.equals(other.name))
			//return false;
		if (v == null) {
			if (other.v != null)
				return false;
		} else if (!v.equals(other.v))
			return false;
		if (x != other.x)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nabc [x=" + x + ", name=" + name + ", v=" + v + "]";
	}
		
	
	
	
}

class Class{
	
	double d;
	String value;
	public Class(double d, String value) {
		super();
		this.d = d;
		this.value = value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		//temp = Double.doubleToLongBits(d);
	//	result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class other = (Class) obj;
	//	if (Double.doubleToLongBits(d) != Double.doubleToLongBits(other.d))
		//	return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Class [d=" + d + ", value=" + value + "]";
	}
	
	
	
}