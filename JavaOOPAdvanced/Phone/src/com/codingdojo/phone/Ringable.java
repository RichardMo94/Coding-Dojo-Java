package com.codingdojo.phone;

public interface Ringable {
	
	public default String ring() {
		return "ring ring!";
	}
	public default String unlock() {
		return "Unlocked!";
	}
}
