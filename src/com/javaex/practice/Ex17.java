package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		
		double r = sc.nextDouble();
		
		System.out.print("구의부피는: " + (double)4/3 * 3.14 * r*r*r);
		
		
		
		
		sc.close();
		

	}

}
