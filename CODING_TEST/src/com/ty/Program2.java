package com.ty;

import java.util.HashMap;
import java.util.Set;

public class Program2 {
	HashMap< Integer, Integer>h1=new HashMap<Integer, Integer>();
	int key=0;
	public void add(int a)
	{
		h1.put(key, a);
		key++;
	}
	public void display()
	{
		Set<Integer>key=h1.keySet();
		for(Integer a:key)
		{
			System.out.print(h1.get(a)+" ");
		}
		System.out.println();
	}
	public void remove(int key)
	{
		h1.remove(key);
	}
	
	public static void main(String[] args) {
		Program2 p=new Program2();
		p.add(10);
		p.add(20);
		p.add(30);
		p.add(40);
		
		p.display();
		p.add(50);
		p.display();
		p.remove(0);
		p.display();
		
	}

}
