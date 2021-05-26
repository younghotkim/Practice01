package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 가격: ");
		
		float price = sc.nextFloat();
		
		System.out.print("받은돈: ");
		
		float paid = sc.nextFloat();
		
		System.out.println("=================");
		
		System.out.println("받은돈: " + paid);
		
		System.out.println("상품가격: " + price);
		
		System.out.println("부가세: " + price/(float)10);
		
		System.out.println("잔액: " + (paid-price));
		
		
		
		sc.close();

	}

}
