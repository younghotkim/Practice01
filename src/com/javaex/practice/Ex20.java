package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		
		int xl = sc.nextInt();
		
		System.out.print("100원 개수: ");
		
		int l = sc.nextInt();
		
		System.out.print("50원 개수: ");
		
		int m = sc.nextInt();
		
		System.out.print("10원 개수: ");
		
		int s = sc.nextInt();
		
		System.out.println("동전의 총합은 " + (500*xl+100*l+50*m+10*s) + " 원 입니다.");
		
		
		
		sc.close();

	}

}
