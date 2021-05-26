package com.javaex.practice;

public class Ex07 {
	
	public static void main (String[] args) {
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i); // 10+1 --> 11
		System.out.println(n); // 11/2 나머지 1, --> 1
		
		//ex06은 출력이 우선되고 1이 나중에 더해짐
		
	}

}
