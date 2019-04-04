package com.nt.test;

public class Demo {

	public static void main(String[] args) {
		String s="testing is a process in which all the defect are identify and"
				+ " isolated and subjected for rectification and "
				+ "ensure that the app is defect free";
		int count=0;
		String[] s1=s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equalsIgnoreCase("defect")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
