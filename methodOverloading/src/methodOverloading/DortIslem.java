package methodOverloading;

public class DortIslem {
	public int topla (int sayi1, int sayi2) {
		return (sayi1 + sayi2);
	}
	public int topla (int sayi1, int sayi2, int sayi3) {
		return (sayi1 + sayi2 + sayi3);
	}
	
	//------------------------------------------------------------------;
	// Method Overloadin-Hesap Makinesi;
	
	public static int toplama (int number1, int number2) {
		return (number1 + number2);
	}
	public static int toplama (int number1, int number2, int number3) {
		return (number1 + number2 + number3);
	}
	public static int toplama (int number1, int number2, int number3, int number4) {
		return (number1 + number2 + number3 + number4);
	}
	public static int cikarma (int number1, int number2) {
		return (number1 - number2);
	}
	public static int cikarma (int number1, int number2, int number3) {
		return (number1 - number2 - number3);
	}
	public static int cikarma (int number1, int number2, int number3, int number4) {
		return (number1 - number2 - number3 - number4);
	}
	public static int carpma (int number1, int number2) {
		return (number1 * number2);
	}
	public static int carpma (int number1, int number2, int number3) {
		return (number1 * number2 * number3);
	}
	public static int carpma (int number1, int number2, int number3, int number4) {
		return (number1 * number2 * number3 * number4);
	}
	public static int bolme (int number1, int number2) {
		return (number1 / number2);
	}
	public static int bolme (int number1, int number2, int number3) {
		return (number1 / number2 / number3);
	}
	public static int bolme (int number1, int number2, int number3, int number4) {
		return (number1 / number2 / number3 / number4);
	}
	
	
	
	
	
}
