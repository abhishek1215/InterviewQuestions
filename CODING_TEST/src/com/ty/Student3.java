package com.ty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student3 implements Comparable<Student3> {
	private int sid;
	private String name;
	private int age;
	private long phno;
	
	

	public Student3(int sid, String name, int age, long phno) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.phno = phno;
	}
	



	@Override
	public String toString() {
		return "Student3 [sid=" + sid + ", name=" + name + ", age=" + age + ", phno=" + phno + "]";
	}




	@Override
	public int compareTo(Student3 o) {
		
		return this.sid-o.sid;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Student3>l1=new ArrayList<Student3>();
		Student3 s1=new Student3(105,"Ram",28,987654l);
		Student3 s2=new Student3(100,"Vikas",24,887654l);
		Student3 s3=new Student3(103,"Bindan",20,687654l);
		Student3 s4=new Student3(98,"arun",18,587654l);
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		
		Collections.sort(l1);
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
	}
	
	

}
