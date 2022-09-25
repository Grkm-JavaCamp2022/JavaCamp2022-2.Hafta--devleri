package classes;

public class Main {
	
	public static void main (String [] args) {
		//Java da iş yapan her şey bir class' dır.
		// reference type
		
		CustomerManager customerManager = new CustomerManager();
		
		CustomerManager customerManager2 = new CustomerManager();
		
		customerManager = customerManager2; 
		
		// customerManager2' yi customerManager' a atadığımız için;
		// 9. satırdaki kod şu şekilde de tanımlanır ;
		// CustomerManager customerManager;
		
		customerManager.Add();
		customerManager.Revove();
		customerManager.Update();
		
		System.out.println("**************************************");
		
		// value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1; // sayi2 = 10;
		sayi1 = 30; // sayi1 = 30;
		System.out.println(sayi2); // Cevap : 10
		
		int[] sayilar1 = new int[] {1,2,3}; 
		int[] sayilar2 = new int[] {4,5,6};
		
		sayilar2 = sayilar1; //sayilar1 {1,2,3} || sayilar2 {1,2,3}
		sayilar1[0] = 10; //sayilar1 {10,2,3} || sayilar2 {10,2,3}
		System.out.println(sayilar2[0]); //Cevap : 10 
		
		
		
		
		
		
	}
}
