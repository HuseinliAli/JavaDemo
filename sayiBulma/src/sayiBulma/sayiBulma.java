package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {3,5,7,1,123,67};
		int aranacakSayi=13;
		boolean sayiBulunduMu=false;
		for(int i=0;i<sayilar.length;i++)
		{
			if(aranacakSayi==sayilar[i])
			{
				System.out.println("Sayi bulundu");
				sayiBulunduMu=true;
				break;
			}
		}
		if(sayiBulunduMu==false)
		{
			System.out.println("Sayi bulunamadi");
		}
	}
}
