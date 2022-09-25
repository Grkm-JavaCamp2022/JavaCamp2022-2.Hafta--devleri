package classesWithAttributes;

public class Product {
	
	// attribute | field denir.
	//Değişkenlerin başına herhangi bir niteleyici yazmadığımızda public' dir.
	
	

	 /*-----------------------------------------------------------------  
	 *    Niteleyici   |  Sınıf  |  Paket  |  Alt Sınıf  |  Dış Dünya  |
	 *                 |         |         |             |             |
	 *      public     |  evet   |  evet   |     evet    |    evet     |
	 *    protected    |  evet   |  evet   |     evet    |    hayır    |
	 *     private     |  evet   |  hayır  |    hayır    |    hayır    |    
	 -----------------------------------------------------------------*/
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	
	// Construstor
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı Blok Çalıştı.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
	}
	//Overloading.
	public Product() {
		
	}
	
	
	//get = al/ getir.
	//set = değere bir atama yap.Değer ver.
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0, 1) + id;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	    
	
}
