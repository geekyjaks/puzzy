package com.geekyjaks.puzzy;

public class SubSequence {

	public String get(String data){
		if (data == null || data.isEmpty() || data.length() == 1)return null;
		
		return null;
	}
	
	public static void main(String[] args) {
		SubSequence sub = new SubSequence();
		System.out.println(sub.get("101010100"));
	}
}
