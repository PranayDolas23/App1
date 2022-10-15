package com.SwapNo.UsingThreeVariable;

import java.util.Scanner;

public class SwapThreeVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int b=sc.nextInt();
		
		int c;
		
		System.out.println("Before Swapping a : " + a); // 10
		System.out.println("Before Swapping b : " + b); // 20
		
		c=a;  // c=10
		a=b; //  a=20
		b=c; //  b=10
		
		System.out.println("After Swapping a : " + a); // 20
		System.out.println("After Swapping b : " + b); // 10

	}

}
