package practice1.poly;

import java.util.Scanner;

public abstract class testClass {
	int x;
	int y;
	
	static
	{
		System.out.println("parent class static block called");
	}
	
	{
		System.out.println("parent class initializer block called");
	}
	testClass(int j)
	{
		System.out.println("parent class constructor called");
		this.x=j;
	}
	public abstract void m1();
	
	public static void m2() 
	{
		System.out.println("parent method m2=");
	}
	
	public static void main(String args[])
	{
	
		/*testClass3 t=new testClass3(10);
		t.m4();*/
		generalClass g=new generalClass(500);
		testClass t=new testClass3(300);
		t.m2();
		
	}
}

  class testClass2 extends testClass
  {
	
	  	static
		{
			System.out.println("child1 class static block called");
		}
		
		{
			System.out.println("child1 class initializer block called");
		}
		  
		public testClass2(int k)
		{
		    super(k);
		    System.out.println("child2 constructor called");
		}
		public  void m1()
		{
			System.out.println(" overrided m1()---2 ");
		}
		public static void m2()
		{
			System.out.println(" overrided m1()---2 ");
		}
		
  }
  
  class testClass3 extends testClass2
  {
	  	static
		{
			System.out.println("child2 class static block called");
			
		}
		
		{
			System.out.println("child2 class initializer block called");
			//m4();
		}

		public void m1()
		{
			System.out.println(" overrided m1()----3 ");
		}		
	
	public static void m2()
	{
		
		System.out.println("............");
	}
		
	
		public testClass3(int l)
		{
			
			super(l);
			System.out.println("child constuctor called");
			
			
		}  
		  
		
		
		/*public  void m4()
		{
			super.y=15;
			//this.m5();
			super.m1();
			super.m2();
		}*/
		
  }
  
  class generalClass extends testClass3
  {
	  public generalClass(int l) {
		super(l);
		// TODO Auto-generated constructor stub
	}

	
	 
	  
	  
  }