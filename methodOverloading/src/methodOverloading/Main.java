package methodOverloading;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		
		System.out.println(dortIslem.topla(10,30));
		System.out.println(dortIslem.topla(4, 5, 1));
		
		
		System.out.println("****************************************************");
		//Method Overloading-Hesap Makinesi.
		
		Scanner scanner = new Scanner(System.in);
		String islemler = "1.Toplama İşlemi\n"
				         +"2.Çıkarma İşlemi\n"
				         +"3.Çaprma İşlemi\n"
				         +"4.Bölme İşlemi\n"
				         +"Çıkış İçin x Basınız.";
		
		System.out.println(islemler);
		System.out.println("****************************************************");
		String a = "a Sayısını Giriniz : ";
		String b = "b Sayısını Giriniz : ";
		String c = "c Sayısını Giriniz : ";
		String d = "d Sayısını Giriniz : ";
		
		while (true) {
			System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
			String islem = scanner.nextLine();
			if (islem.equals("x")) {
				System.out.println("Programdan Çıkış Yapılıyor...İyi Günler.");
				break;
			}
			else if (islem.equals("1")) {
				System.out.print("Kaç Değer Toplayacaksınız : ");
				int kacsayi = scanner.nextInt();
				
				if (kacsayi == 2) {
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Toplamları : " + dortIslem.toplama(syi1, syi2));
				}
				else if (kacsayi == 3) {
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					System.out.print(c);
					int syi3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Toplamları : " + dortIslem.toplama(syi1, syi2, syi3));
				}
				else if (kacsayi == 4){
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					System.out.print(c);
					int syi3 = scanner.nextInt();
					System.out.print(d);
					int syi4 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Toplamları : " + dortIslem.toplama(syi1, syi2, syi3, syi4));
					
				}
			}
			else if (islem.equals("2")) {
				System.out.print("Kaç Değerin Farkını Alacaksınız : ");
				int kacsayi = scanner.nextInt();
				
				if (kacsayi == 2) {
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Farkı : " + dortIslem.cikarma(syi1, syi2));
				}
				else if (kacsayi == 3) {
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					System.out.print(c);
					int syi3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Farkı : " + dortIslem.cikarma(syi1, syi2, syi3));
				}
				else if (kacsayi == 4){
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					System.out.print(c);
					int syi3 = scanner.nextInt();
					System.out.print(d);
					int syi4 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Farkı : " + dortIslem.cikarma(syi1, syi2, syi3, syi4));
					
				}
			}
			else if (islem.equals("3")) {
				System.out.print("Kaç Değer Çarpacaksınız : ");
				int kacsayi = scanner.nextInt();
				
				if (kacsayi == 2) {
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Çarpımı : " + dortIslem.carpma(syi1, syi2));
				}
				else if (kacsayi == 3) {
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					System.out.print(c);
					int syi3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Çarpımı : " + dortIslem.carpma(syi1, syi2, syi3));
				}
				else if (kacsayi == 4){
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					System.out.print(c);
					int syi3 = scanner.nextInt();
					System.out.print(d);
					int syi4 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Çarpımı : " + dortIslem.carpma(syi1, syi2, syi3, syi4));
					
				}
			}
			else if (islem.equals("4")) {
				System.out.print("Kaç Değer Böleceksiniz : ");
				int kacsayi = scanner.nextInt();
				
				if (kacsayi == 2) {
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Bölümü : " + dortIslem.bolme(syi1, syi2));
				}
				else if (kacsayi == 3) {
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					System.out.print(c);
					int syi3 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Bölümü : " + dortIslem.bolme(syi1, syi2, syi3));
				}
				else if (kacsayi == 4){
					System.out.print(a);
					int syi1 = scanner.nextInt();
					System.out.print(b);
					int syi2 = scanner.nextInt();
					System.out.print(c);
					int syi3 = scanner.nextInt();
					System.out.print(d);
					int syi4 = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Bölümü : " + dortIslem.bolme(syi1, syi2, syi3, syi4));
					
				}
			}
			else {
				System.out.println("Bunun İçin Uygun Bir Metod Bulunmuyor...");
			}
		}
	}
}
