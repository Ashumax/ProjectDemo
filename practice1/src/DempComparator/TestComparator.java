package DempComparator;

import java.util.*;


public class TestComparator
{
	public static void main(String[] args)
	{
		Emp e1= new Emp(1, "Z");
		Emp e2= new Emp(2, "B");
		Emp e3= new Emp(10, "D");
		Emp e4= new Emp(5, "C");
		Emp e5= new Emp(5, "W");
		Emp e6= new Emp(5, "P");
		Comparator <Emp> agefactor=new Comparator<Emp>()
				{

					@Override
					public int compare(Emp e1, Emp e2) {
						// TODO Auto-generated method stub
						return e2.age-e1.age;
					}
			
				};
		Set <Emp> s= new TreeSet<Emp>(agefactor);
		//Set<Emp> s= new HashSet<Emp>();
		//s1.add(e1);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		s.add(e6);
		
		
		//System.out.println(s1);
		//Collections.sort(s1, new AgeFactor()); .....................only used in list or arrays but not for set...............
		//...... comparator and comparable used in list,treeset not in hashset and linkedhashset...............
		//............we can use as no of multiple sorting using comparator like Set <Emp> s1= new TreeSet<Emp>(new abc()); or Set <Emp> s1= new TreeSet<Emp>(new Employee()); which implements comparatorinterface......
		//we normally override equals and hashcode() method for hashset() and linkedhashset
		
		System.out.println("....hashset elements...."+s);
		
	}
	
}
