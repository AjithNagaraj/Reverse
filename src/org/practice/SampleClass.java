package org.practice;


public class SampleClass{
	
	
			
			public static void main(String[] args) {
				String s ="Java is a Language";
					
				String [] chars=s.split(" ");
				
				String revword="";
				for(String ch:chars) {
					StringBuilder sb=new StringBuilder(ch);
					sb.reverse();
					revword=revword+sb.toString()+" ";
					
				}
			
				System.out.println(revword);
	
		
	}
}
