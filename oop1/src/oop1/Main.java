package oop1;

import javax.swing.SortingFocusTraversalPolicy;

public class Main {
	public static void main(String [] args) {
		String mesaj = "Vade Oranı";
		
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscort(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUr1("image1.jpg");
		
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscort(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUr1("image2.jpg");
		
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscort(9);
		product3.setUnitPrice(4500);
		product3.setUnitInStock(1);
		product3.setImageUr1("image3.jpg");
		
		
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			System.out.println("<li>" + product.getDiscort() + "</li>");
			System.out.println("<li>" + product.getUnitPrice() + "</li>");
			System.out.println("<li>" + product.getUnitInStock() + "</li>");
			System.out.println("<li>" + product.getImageUr1() + "</li>");
			
		}
		System.out.println("</ul>");
		
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("52222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demirog");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("5333333333333");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("111111111111");
				
				
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		System.out.println("----------------------------------------");
		System.out.println("First Name : " + individualCustomer.getFirstName());
		System.out.println("Last Name : " + individualCustomer.getLastName());
		System.out.println("Company Name : " + corporateCustomer.getCompanyName());
		
	}
}
