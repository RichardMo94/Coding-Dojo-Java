package com.codingdojo.phone;

public class PhoneTester {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 50, "AT&T", "Ring Ring Ring!");
		Iphone proMax = new Iphone("12 Pro Max", 100, "AT&T", "Zing!");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		proMax.displayInfo();
		System.out.println(proMax.ring());
		System.out.println(proMax.unlock());
		
	}
}
