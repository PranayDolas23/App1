package PalindromeNumber;

//  121  

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=121;
		int temp=num;
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
			if(sum==temp)
			{
				System.out.println("Palindrome number");
			}
			else
			{
				System.out.println("Not Palindrome number");
			}
	}

}
