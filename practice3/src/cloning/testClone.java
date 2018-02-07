package cloning;


public class testClone {

	public static void main(String[] args) throws CloneNotSupportedException{
		Company t1=new Company("Amdocs",66732);
		Employee t2=new Employee(56743.64,"Ashutosh",t1);
		
		
		Employee t3=(Employee)t2.clone();
		System.out.println(t2==t3);
		System.out.println(t2.getClass()==t3.getClass());
		System.out.println(t2.equals(t3));
		System.out.println("before making changes");
		System.out.println("value of t2 "+t2.getSalary()+" "+t2.getName()+" "+t2.getC());
		System.out.println("value of t3 "+t3.getSalary()+" "+t3.getName()+" "+t3.getC());
		
		System.out.println("after making changes");
		t3.setName("amol");
		t3.setSalary(70000);
	/*	t1.setCid(999);
		t1.setCname("Synechron");
		t3.setC(t1);*/
		t3.getC().setCname("tata");
		t3.getC().setCid(9990);
		
		
		
		System.out.println("value of t2 "+t2.getSalary()+" "+t2.getName()+" "+t2.getC());
		System.out.println("value of t3 "+t3.getSalary()+" "+t3.getName()+" "+t3.getC());
		
		
		
	}
}
