package SpyNumber;

//Write the program to check 1124 is Spy number.  
//(all digit addition=all digit multiplication) (Ex. 1+1+2+4=1*1*2*4)

public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1124;
		int temp=num;
		int sum=0;
		int mul=1;
		
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
		}

	}

}
