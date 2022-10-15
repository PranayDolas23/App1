package com.SwapNo.UsingThreeVariable;

import java.util.Scanner;

public class SwapTwoVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int b=sc.nextInt();
		
		System.out.println("Before Swapping a : " + a); // 10
		System.out.println("Before Swapping b : " + b); // 20
		
		a=a+b;  // 10+20=30
		b=a-b; //  30=20=10
		a=a-b; //  30-10=20
		
		System.out.println("After Swapping a : " + a); // 20
		System.out.println("After Swapping b : " + b); // 10

	}

}
