package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapTest 
{
	public static void main(String[] args)
	{
		Emp e1= new Emp(12,"yogesh");
		Emp e2=new Emp(15,"Ashish");
		Emp e3=new Emp(18,"sangram");
		Emp e4=new Emp(22,"yogesh");
		Emp e5=new Emp(22,"yogesh");

		
Map<Emp, String> h=new HashMap<Emp, String>();
		
		h.put(e1,"pqr");
		h.put(e2,"PQR");
		h.put(e3,"wxy");
		h.put(e4,"WXY");
		h.put(e5, "Ashu");
		
		
		System.out.println("Direct..................");
		System.out.println(h);
		h.remove(e3);
		System.out.println("After Removing....................");
		System.out.println(h);

		System.out.println();
		System.out.println("With For each loop.........................");
		for (Map.Entry<Emp, String> string : h.entrySet()) {
			System.out.print(string);
		}
		System.out.println();
		System.out.println("With Iterator.....................");
		Iterator<Map.Entry<Emp, String>> itr=h.entrySet().iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next());
			}
		
	}
}
/**
 * @author Sai
 *
 */
class Emp
{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + "]";
	}
	
}