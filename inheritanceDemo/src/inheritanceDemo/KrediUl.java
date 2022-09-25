package inheritanceDemo;

public class KrediUl {
	/*public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {
		ogretmenKrediManager.Hesapla(); } */
	
	// Bunun yerine;
	
	public void KrediHesapla (BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();
	}
	
	
}
