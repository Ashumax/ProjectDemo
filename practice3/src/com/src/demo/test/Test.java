package com.src.demo.test;

public class Test
{
	int id;
	String name;
	public Test(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Test(Test t)
	{
		id= t.id;
		this.name=t.name;
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
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Test t1 =new Test(1, "Ashutosh");
		Test t2 = new Test(t1);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);
		System.out.println(t1.getClass()==t2.getClass());
		System.out.println(t1.equals(t2));
		t2.setId(100);
		t2.setName("Amol");
		
		System.out.println(t1);
		System.out.println(t2);

	}
}
