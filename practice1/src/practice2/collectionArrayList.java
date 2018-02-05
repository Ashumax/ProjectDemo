package practice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



//import practice2.product.productChild;

public class collectionArrayList {

	public static void main(String[] args) {
		List<Object> list= new ArrayList<Object>();
		product p1=new product(12,"amol");
		product p2=new product(14,"ashu");
	
		productChild p3=new productChild(22,"aaakk");
		productChild p4=new productChild(26,"bbbkk");
		student st1=new student(88,"yogesh");
		student st2=new student(90,"yog");
		list.add(new product(11,"swapnil"));
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		p3.showDetails(50, "Nike");
		p3.showDetails(555, "adidas");
		list.add(st1);
		list.add(st2);
		list.add(3,new student(99,"asasas"));
		Iterator<Object> itr= list.iterator();
	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----");
		list.remove(st1);
		System.out.println("after remove :"+list);
			
		System.out.println(" size: "+list.size());
		System.out.println("  ---get()"+list.get(0));
		System.out.println("  ---contains()"+list.contains(p2));
		
		
	}

	

}


class product{
	
	 int id;
	 String pdName;
	
	public product(int id, String pdName) {
		super();
		this.id = id;
		this.pdName = pdName;
	}

	@Override
	public String toString() {
		return "\nproduct [id=" + id + ", pdName=" + pdName + "]";
	}
	
	
	
	
}
	 
class productChild extends product
	{
		int customId;
		String brand;
		
		public productChild(int id, String pdName) {
			super(id, pdName);
			// TODO Auto-generated constructor stub
		}
		public void showDetails(int i,String nm) {
			
			System.out.println("customer id:"+i);
			System.out.println("brand :"+nm);
		}
		
		
	}
	 
	
class student{
	
	int stid;
	String stdnm;
	public student(int stid, String stdnm) {
		super();
		this.stid = stid;
		this.stdnm = stdnm;
	}
	@Override
	public String toString() {
		return "\nstudent [stid=" + stid + ", stdnm=" + stdnm + "]";
	}
	
}	
	
