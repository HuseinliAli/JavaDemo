package sesliHarfler;

public class sesliHarflerAlgoritm {

	public static void main(String[] args) {
		char harf = 'İ';
		
		if(harf=='A'||harf=='I'||harf=='O'||harf=='U')
		{
			System.out.println("Harf Kalin Sesli Harfdir");
		}
		if(harf=='E'||harf=='İ'||harf=='Ö'||harf=='Ü')
		{
			System.out.println("Harf İnce Sesli Harfdir");
		}
	}

}
