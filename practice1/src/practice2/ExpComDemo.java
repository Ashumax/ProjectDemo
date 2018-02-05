package practice2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExpComDemo {

	public static void main(String[] args) 	
	{
		stud s1=new stud(1,"San");
		stud s2=new stud(2,"Amy");
		stud s3=new stud(3,"harsh");
		List<stud> l1=new LinkedList<>();
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		System.out.println("Before Sorting");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("After Sorting");
		System.out.println(l1);
	}

}
class stud implements Comparable<stud>
{
	int id;
	String name;
	public stud(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "stud [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(stud s) {
		// TODO Auto-generated method stub
		return this.name.compareTo(s.name);
	}
}
