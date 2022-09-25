package methods;

import java.util.Scanner;

public class Main {
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,4,8,9,0};
		int aranacak = 2;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj = "";
		if (varMi) {
			mesajVer("Sayı Mevcuttur : " + aranacak);
		}
		else {
			mesajVer("Sayı Mevcut Değildir : " + aranacak);
			
		}
		
		System.out.println("------------------------------------");
	}
	
	//Java da metod isimleri nasıl yazılır. -> camelCase
	// Kullanıcıdan Bir Sayı Alarak Mevcut Olup Olmadığına Bakalım.
	
	public static void sayiBul() {
		Scanner scanner = new Scanner(System.in);
		int[] Numbers = new int[] {7,10,12,15,3};
		boolean varMİ = false;
		System.out.print("Lütfen Bir Sayı Giriniz : ");
		int a = scanner.nextInt();
		
		for (int Number : Numbers) {
			if (Number == a) {
				varMİ = true;
				break;
			}
		}
		String mesaj = "";
		if (varMİ) {
			mesajVer("Sayı Mevcuttur : " + a);
		}
		else {
			mesajVer("Sayı Mevcuttur : " + a);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		sayiBulmaca();
		sayiBul();
		System.out.println("--------------------------------------");
	}

}
