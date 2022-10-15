package NeonNumber;

public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=9;
	    int temp=num;
		int sum=0;         //  			 1     		9


		while(num>0)        //    81>0         8>0        0>0(false)
		{
		int rem=num%10;    //    81%10=1      8%10=8
		sum=sum+rem;       //     1           1+8=9

		num=num/10;        //     81/10=8       8/10=0
		}

		if(sum==temp)   //  9==9
		{
		System.out.println("Neon Number");
		}
		else
		{
		System.out.println("Not neon number");
		}


	}

}
