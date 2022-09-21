package arkadasSayilar;

public class arkadasSayilar {

	public static void main(String[] args) {
		int numberFirst = 5675756;
		int numberSecond = 3;
		int divisorFirst=0;
		int divisorSecond=0;
		
		for(int i=1;i<numberFirst;i++)
		{
			if(numberFirst%i==0)
			{
				divisorFirst+=i;
			}
		}
		
		for(int i=1;i<numberSecond;i++)
		{
			if(numberSecond%i==0)
			{
				divisorSecond+=i;
			}
		}
		
		if(divisorSecond == numberFirst && divisorFirst == numberSecond)
		{
			System.out.println("Bu sayilar arkadas sayilardir");
		}
		else
		{
			System.out.println("Bu sayilar arkadas sayilar degil");
		}
	}
}
