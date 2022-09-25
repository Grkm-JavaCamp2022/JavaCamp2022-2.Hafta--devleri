package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {//Bir class'ın içerisinde başka bir class kullanılabilir.
		
		//JDBC kodları yazarak veritabanına kaydedebilir.
		
		System.out.println("Ürün Eklendi " + product.getName());
		
	}
}
