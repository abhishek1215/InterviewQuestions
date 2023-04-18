package com.ty;

public class Program4 {

	public static String test(String s)
	{
		String s2="";
		s=s.toLowerCase();
		
		char[]c=s.toCharArray();
		

		for(int i=0;i<c.length;i++)
		{

			if(c[i]!=' ')
			{
				for(int j=i+1;j<c.length;j++)
				{
					if(c[i]==c[j])
					{
						c[i]='1';
					}
				}
			}
			else if(i<=c.length-2 &&c[i+1]==' ')
			{
				c[i+1]='1';
				

			}


		}
		for(int i=c.length-1;i>=0;i--)
		{
			if(c[i]!='1')
			{
				System.out.print(c[i]);
			}
		}
		return s2;
	}

	public static void main(String[] args) {

		test("Welcom  to  India ");
	}

}
