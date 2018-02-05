package practice1.poly;

public class demoClass {
	public static void main(String args[]) {
		String str="Ashutosh";
		String a1="abcdefg";
		String a2="abc";
		String a3="abc";
		
		String str1="abcdefghij";
		String str2="asyxadjkoenfal";
		String str3="abc1233pqras11xuz903";
		String a4=new String("pqr");
		String a6=new String("pqr");
		String a5=new String("abc");
		
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a3==a5);
		System.out.println(a4==a6);
		
		System.out.println(a1.contains(a2));
		System.out.println(a1.contains(a5));
		System.out.println(a2.equals(a5));
		System.out.println(a4.equals(a6));
		System.out.println(a2.equals(a3));
		
		StringBuilder st=new StringBuilder(a1);
			System.out.println(st.reverse());
			
			
			xyz obj=new xyz();
			String r=obj.reverse(str);
			String r1=obj.getMatchingString(str1, str2);
			System.out.println(r);
			System.out.println(r1);
			
	}

}

class xyz{
	
	public  static String reverse(String str) 
	{
		char ch[]=str.toCharArray();
		String last="";
		for(int i=ch.length-1;i>=0;i--)
		{
			last+=ch[i];
		}
		
		return last;
	}	
	
	public  static String getMatchingString(String str1,String str2) 
	{
		String result="";
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					result+=str1.charAt(i);
					break;
				}
				
				
			}
			
		}
		
		return result;
	}	

	/*public  static int[] getStringDigitSum(String str3) 
	{
		char ch[]=str3.toCharArray();
		String arr="";

		for(char i=0;i<ch.length;i++) 
		{
			for(char c='a';c<='z';c++)
			{
				if(ch[i]!=c)
				{
					arr=arr+ch[i];
				}
			}
			
		}
		
	}*/	
	

}
