package org.practice;

public class SampleParent {
	public SampleParent() {
System.out.println("Default parent");
}
	public SampleParent(int age) {
		System.out.println("age is :"+age);
	}
	
	public SampleParent(String name) {//2
		this(587498647l);
		
System.out.println("Name is"+name);
	}
	
	public SampleParent(long phno) {//1
		System.out.println("Salary is"+phno);
	}

}
