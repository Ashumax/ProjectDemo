package cloning;


public class Employee implements Cloneable{
double salary;
String name;
Company c;
public Employee(Employee e)
{
	this.salary=e.salary;
	this.name=e.name;
	this.c=e.c;
	
}
public Employee(double salary, String name, Company c) {
	super();
	this.salary = salary;
	this.name = name;
	this.c = c;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Company getC() {
	return c;
}
public void setC(Company c) {
	this.c = c;
}


	
@Override
protected Object clone() throws CloneNotSupportedException {
	
		/*Employee cloned = (Employee)super.clone();
		cloned.setC((Company)cloned.getC().clone());
		return cloned;*/
	Employee e=(Employee) super.clone();
	Employee e1=new Employee(e);
	return e1;
}
@Override
public String toString() {
	return "\nEmployee [salary=" + salary + ", name=" + name + ", c=" + c + "]";
}



}

class Company {
	String cname;
	int cid;
	public Company(String cname, int cid) {
		super();
		this.cname = cname;
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Company [cname=" + cname + ", cid=" + cid + "]";
	}
/*	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}*/

	
	
}