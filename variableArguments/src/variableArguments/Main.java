package variableArguments;

public class Main {
	
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	public static void sil() {
		System.out.println("Silindi.");
	}
	public static void guncelle() {
		System.out.println("Güncellendi.");
	}
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	// Variable Arguments.
	public static int topla2 (int...sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	
	public static void main (String [] args) {
		
		String mesaj = "Bugün Hava Çok Güzel.";
		String yenimesaj =  sehirVer();
		System.out.println(yenimesaj);
		System.out.println("-------------------------------------------");
		int sayi = topla(10, 2);
		System.out.println("Toplam : " + sayi);
		System.out.println("-------------------------------------------");
		int toplam = topla2(2,3,5,7,10,60);
		System.out.println("Toplam : " + toplam);
	}
	
}
