package methods2;

import java.util.Scanner;

public class Main {
	//operasyonlar == fonksiyonlar == metodlar.
	
	
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
	public static String sehirVer() {
		return "Ankara";
	}
	
	
	//Basit Bir Hesap Makinesi.
	
	public static int total (int number1, int number2) {
		return (number1 + number2);
	}
	public static int interest (int number1, int number2) {
		return (number1 - number2);
	}
	public static int multiply (int number1, int number2) {
		return (number1 * number2);
	}
	public static double plenty (int number1, int number2) {
		return (number1 / number2);
	}
	
	
	
	public static void main (String [] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		String yenimesaj =  sehirVer();
		System.out.println(yenimesaj);
		System.out.println("-------------------------------------------");
		int sayi = topla(10, 2);
		System.out.println("Toplam : " + sayi);
		
		//**************************************************************
		
		
		Scanner scanner = new Scanner(System.in);
		String a = "Birinci Sayı : ";
		String b = "İkinci Sayı : " ;
		System.out.println("-------------------------------------------");
		String process = "1.Toplama İşlemi\n"
				        +"2.Çıkartma İşlemi\n"
				        +"3.Çarpma İşlemi\n"
				        +"4.Bölme İşlemi\n"
				        +"Çıkıs için : x ";
		
		System.out.println("-------------------------------------------");
		System.out.println(process);
		System.out.println("-------------------------------------------");
		
		
		
		while (true) {
			System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
			String islem = scanner.nextLine();
			
			if (islem.equals("x")) {
				System.out.println("Çıkış Yapıldı.");
				System.out.println("İyi Günler.");
				break;
			}
			else if (islem.equals("1")) {
				System.out.print(a);
				int sayi1= scanner.nextInt();
				System.out.print(b);
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				System.out.println(total(sayi1, sayi2));
				
			}
			else if (islem.equals("2")) {
				System.out.print(a);
				int sayi1= scanner.nextInt();
				System.out.print(b);
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				System.out.println(interest(sayi1, sayi2));
				
			}
			else if (islem.equals("3")) {
				System.out.print(a);
				int sayi1= scanner.nextInt();
				System.out.print(b);
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				System.out.println(multiply(sayi1, sayi2));
			}
			else if (islem.equals("4")) {
				System.out.print(a);
				int sayi1= scanner.nextInt();
				System.out.print(b);
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				System.out.println(plenty(sayi1, sayi2));
			}
			else {
				System.out.println("Geçersiz Bir İşlem Yapıldı.");
				System.out.println("İyi Günler...");
			}
		}
				
		
		
		

	}
}
