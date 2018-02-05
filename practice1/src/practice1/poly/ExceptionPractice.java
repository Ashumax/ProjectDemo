package practice1.poly;


public class ExceptionPractice {
	
	
	public static void main(String args[])
	{
			ExceptionPractice e= new ExceptionPractice();
			 int x;
			x=e.m2(0);
			System.out.println("value of return  :-  "+x);
			
		  // e.m2();
		  
	
		    
			
	}
	
		public int m2(int i)
		{
				System.out.println("lets see exception");
			try {
					System.out.println("---1---");
					 i=10/0;
					//return 10;
				}
			 catch(Exception e)
				{
				 	System.out.println("--2---");
				 	//return 20;
				}
			finally 
				{
				
					System.out.println("---3---");
					//return 30;
				}
			
			//System.out.println("---4---");
			 
			return 40;
		}
	
}