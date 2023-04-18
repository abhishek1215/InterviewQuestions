package com.ty;

import java.util.ArrayList;
import java.util.List;

public class Program5 {
	
	public static void convert(int []a)
	{
		int size=a.length;
		int quo=size/3;
		int rem=size%3;
		for(int i=1;i<=rem+quo;i++)
		{
			a=print(a);
		}
	}
	public static int[] print(int[]a)
	{
		List<Integer>l1=new ArrayList<>();
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(count==3)
			{
				break;
			}
			if(a[i]!=-1)
			{
				l1.add(a[i]);
				a[i]=-1;
				count++;
			}
		}
		if(l1.size()!=0)
		{
		System.out.println(l1);
		}
	
		return a;
	}
	
	
	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		convert(a);
		
	}
	

}
