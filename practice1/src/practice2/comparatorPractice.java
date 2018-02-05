package practice2;
import java.util.*;

import DempComparator.Emp;

import java.lang.*;
class employee{
	
	int empid;
	String name;
	String dept;
	public employee(int empid, String name, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return " \nemployee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}

class recruiter implements Comparator
{

	@Override
	public int compare(Object ob1, Object ob2) {
		
		employee e1=(employee) ob1;
		employee e2=(employee) ob2;
		if(e1.empid==e2.empid)
		{
			return 0;
		}
		else if(e1.empid<e1.empid)
			return -1;
		else
		
		return 1;
	}
	
}



/*class CompleteShortListed implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		
		
		employee e1=(employee)o1;
		employee e2=(employee)o2;
		
		 
		 
	
		
	}
	
}*/


public class comparatorPractice {

	public static void main(String[] args) {
		
		Set<employee> st= new HashSet<>();
		employee e1=new employee(25,"Ashu","BPO");
		employee e2=new employee(29,"amol","KPO");
		employee e3=new employee(40,"swapnil","ITES");
		st.add(e1);
		st.add(e2);
		st.add(e3);
		for (employee employee : st) {
			System.out.println(employee);
		}
		//Collections.sort( st,new recruiter());
		
		

	}

}
