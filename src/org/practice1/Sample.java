package org.practice1;

import org.practice.SampleParent;

public class Sample extends SampleParent {
	public Sample() {//5
		this(42.5f);
		System.out.println("Default class");
	}
	public Sample(int age) {//3
		super(35);
		System.out.println("age is:"+age);
	}
	public Sample(float weight) {//4
		this(45);
		System.out.println("weight is:"+weight);
	}
public static void main(String[] args) {
	Sample s = new Sample();
}
	
	

}
