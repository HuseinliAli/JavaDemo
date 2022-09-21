
public class miniProjectAsalSayi {

	public static void main(String[] args) {
		int number = 5;
		boolean isPrime=true;
		if(number<1)
		{
			System.out.println("Number is not Validate");
		}
		if(number==1)
		{
			System.out.println("Number is not prime");
		}	
		for(int i=2; i<number;i++)
		{
			if(number%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Number is prime");
		}
		else 
		{
			System.out.println("Number is not prime");
		}
	}
}
