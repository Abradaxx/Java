package oopIntro;

public class Main {

	public static void main(String[] args) {
	//////////////////////////////////	
	
	
	Product product2 =new Product();
	
	product2.setId(2);
	product2.setName("Lenovo V15");
	product2.setDetails("16 GB Ram M�k�");
	product2.setDiscount(10);
	product2.setUnitPrice(16000);
	
	System.out.println(product2.getUnitPriceAfterDiscount());
	Category category1=new Category();
	category1.setId(1);
	category1.setName("Drinks");
	/////////////////////////////
	Category category2=new Category();
	category2.setId(2);
	category2.setName("Foods");
	System.out.println(category1.getName());// bunlar� birer sayfa gibi d���n
	// her sayafaya teker teker gitmek yerine category.javadan get name e ! ekleyip otamatik g�ncellemesinin sa�l�yorum
	
	System.out.println(category2.getName());
	// �imdi Y�netim dedi ki b�t�n kategorolarin sonuna ! getir
	


	
	
	
	
	


}
	}
