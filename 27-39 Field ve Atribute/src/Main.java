
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product product=new Product();// burada productta product constructoru a�mam�z gerek
		Product product=new Product(123, "Kerem","bu �ok g�zel",6000, 6,"K�rm�z�");
		
		
			
		
		
		/*
		 * diyelim yukardaki gibi �r�nleri yazd�k fakat ger�ek hayattaki kullan�m� ne?
		 * siz ger�ek hayatta kullan�c�ya ekran veriyorsunuz
		 * id yi otamatik arkaplanda olu�turuytorunuz
		 * name i�in textbox yaz�yorsunuz
		 * �r�n�n a��klams� diyorsnuz
		 * �r�n�n stok adetini gir diyorsunnuz
		 * butonu yaz�yorsunuz vesayre
		 * peki bu productu kim kullanacak ba�ka bir class
		 */
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
		
		
	}

	

}
