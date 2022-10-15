package PerfectNumber;

import java.util.Scanner;

public class Perfect_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int num=sc.nextInt();
	//	int num=6;
		int sum=0;                                         //  1	3	6
		
		System.out.println("Factor of "+num+" are : ");
		
		for(int i=1;i<num;i++)  // i=1<6	2<6		3<6 	4<6 	5<6 	6<6(False terminate loop)
		{
			if(num%i==0)   // 6%1==0(T) 	6%2==0(T) 	6%3==0(T) 	6%4==0(F) 	6%6==0(F)
			{
				System.out.println(i);      // Factorial no      1 	2 	3
				sum=sum+i;                  // 0+1=1 	1+2=3 	 3+3=6
			}
			
		}
		
		if(num==sum)    // 6 == 6
		{
			System.out.println("Given no is Perfect number ");
		}
		
		else
		{
			System.out.println("Given no is Not Perfect number");
		}

	}

}
