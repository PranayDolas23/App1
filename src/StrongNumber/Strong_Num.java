package StrongNumber;

import java.util.Scanner;

public class Strong_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		
	//	int num=145;
		int temp=num;
		int sum=0;
		
		while(num>0)
		{
			int fact=1;
			int rem=num%10;
			
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			
			sum=sum+fact;
			num=num/10;
		}
		
		if(sum==temp)
		{
			System.out.println(temp +" is Strong number ");
		}
		
		else
		{
			System.out.println(temp+" is Not Strong number ");
		}

	}

}
