package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		//Class'ların en temel özelliği ortak oferasyonları tutmaktır.
		
		DortIslem dortIslem = new DortIslem();
		int tsonuc = dortIslem.Topla(10, 3);
		System.out.println("Sonuç : " + tsonuc);
		
		
		int csonuc = dortIslem.Cikar(10, 3);
		System.out.println("Sonuç : " + csonuc);
		
		
		int casonuc = dortIslem.Carp(10, 3);
		System.out.println("Sonuç : " + casonuc);
		
		
		int bsonuc = dortIslem.Bol(10, 3);
		System.out.println("Sonuç : " + bsonuc);
	}

}
