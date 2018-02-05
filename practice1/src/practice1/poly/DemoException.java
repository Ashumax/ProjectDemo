package practice1.poly;

public class DemoException {

	public static void main(String[] args) {
		dimReturn(0);
		
	}

	
	@SuppressWarnings("finally")
	private static void dimReturn(int i) 
	{
		System.out.println("hi");
		try
		{
			System.out.println("Try");
		int j=i/0;
			//return;
		}
		catch(Exception e)
		{
			System.out.println("Catch");
			//return;
		}
		finally
		{
			System.out.println("Finally");
			return;
		}
		
		//System.out.println("Bye");
	//return 40;
		/*in case of int dimReturn() return stmt in try and catch are guranteed but if u again write return stmt after finally then will give error bcoz ithis will also be guranteed return and we cant write two guranteed return stmt in ome method.   */
		/* should write return in both try and catch block*/
		
		/*in case of void m() ; return stmt  should be in either try or catch block not in both as well as not in finally then line no 32 will not give error but will not print .
		 * But if u write return in finally then line no32 show unreachable code error*/
	}

}
