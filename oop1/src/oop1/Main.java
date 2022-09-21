package oop1;

public class Main {
	public static void main(String[] args) {
		 Product product1 = new Product();
		 				//set value
		 product1.setName("Delonghi Kahve Makinesi");
		 product1.setDiscount(5);
		 product1.setUnitPrice(4678);
		 product1.setUnitsInStock(34);
		 product1.setImageUrl("image1.jpg");
		 				//get value		 product1.name = "Delonghi Kahve Makinesi";
		 Product product2 = new Product();
		 product2.setName("Nescafe Kahve Makinesi");
		 product2.setDiscount(3);
		 product2.setUnitPrice(4538);
		 product2.setUnitsInStock(4);
		 product2.setImageUrl("image2.jpg");
		 
		 Product product3 = new Product();
		 product3.setName("Smeg Kahve Makinesi");
		 product3.setDiscount(2);
		 product3.setUnitPrice(8712);
		 product3.setUnitsInStock(65);
		 product3.setImageUrl("image3.jpg");
		 
		 IndividualCustomer individualCustomer = new IndividualCustomer();
		 individualCustomer.setId(1);
		 individualCustomer.setCustomerNumber("3241343243121");
		 individualCustomer.setPhone("+9945050505005");
		 individualCustomer.setLastName("Ali");
		 individualCustomer.setLastName("Huseynli");
		 
		 CoorperateCustomer cuorperateCustomer = new CoorperateCustomer();
		 cuorperateCustomer.setId(2);
		 cuorperateCustomer.setCompanyName("tocuh");
		 cuorperateCustomer.setPhone("12312331");
		 cuorperateCustomer.setTaxNumber("asda213vcv");
		 cuorperateCustomer.setCustomerNumber("0123912a");
		 
		 Customer[] customers =  {individualCustomer,cuorperateCustomer};
		 for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
		}
		 
		 Product[] products = new Product[] {product1,product2,product3};
		 for(var item : products)
		 {
			 System.out.println(item.getName());
		 }
	}
}
