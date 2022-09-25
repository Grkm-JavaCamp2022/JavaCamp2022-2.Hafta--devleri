package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		/*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla(); */
		
		KrediUl krediUl = new KrediUl();
		               
		                     
		krediUl.KrediHesapla(new AskerKrediManager());
		
		//Ekran : Kredi Hesaplandı.
	}

}
