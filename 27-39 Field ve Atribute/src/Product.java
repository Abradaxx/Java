// dikkat edin product Manager demedim 
/*�r�n manager i ilerde konu�ucaz katmanl� yap�larda
 * ad� �st�nde manage ediyor
 * ama �r�n ama ad� �st�nde 
 * bu �r�n�n �zellikleri nedir
 * ad� leptop
 * rengi siyah
 * 15 incj
 * a��rl�g� bla bla �zellikler verirsiniz
 * fiyat�n� verirsiniz bla bla
 * bir class attribute yani �zellik bar�nd�r�r
 * peki arkada�lar bir �r�n�n neleri var
 * 
 */
public class Product {
	public Product(int id, String name,String Descripton, double price, int stockAmount,String renk ) {
		System.out.println("Yap�c� blok �al��t�");
		this.id=id;
		this.name=name;
		this.description=Descripton;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;
		
		
	}
	
	/*
	///biz bunlar� burada tutmu� olduk bunlar bildi�imiz de�i�ken
	//bunlara ayn� zamanda attribute||field diyebiliriz.
	 * //tr de ba�ka kerem yok ama olabilir bizi ay�ran tc kimlik gibi d���n prmiary key
	private int id;// bir �r��n�n id si var id �r�n� tan�mlayan e�siz de�erdir
	
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	*/
	
	
	// Single responsbility bir class bir ama� u�runa olu�turulmal�d�r ona 
			//birden fazla ama� y�klersen kar���kl�k olu�ur.
	//yurt d���nda da yap�lan hata manager a yaz�alcak fonksiyonlar buraya yaz�l�yor yanl�� yaz�lamaz.
///---------------------
	//Encapsulation �htiyac�n� Anlamak
	//Encapsulation, kaps�lleme dedi�imiz bir y�ntemdir.Kullan�c�y� herhangi 	
	/*bir alan�(field) kullanmak i�in k�s�tlamy� �ng�r�r
	 * ayn� zamanda diyelim siz �r�nleri
	 * String name;
	String description;
	double price;
	int stockAmount;
	String renk;
		
	 * �eklinde tan�mlad�g�n�z zaman public olarak i�aretlemi� oluyorsnuz
	 * peki nedir bu public 
	 * public her yerden ula��labilir demek mesala product managerdan producta ula�abiliyorduk classlardan
	 * e�er bunlar�n ba��na yani bu alanlardan birinin ba��na private yazarsan
	 * sadece tan�mland�g� blokta ge�erlidir demektir private
	 * demekki bu product class �n�n i�inde her yerde ge�erli demek
	 * 
	 * 
	 */
	////////////////////////////////////////////
	/*Getter ve Setterlar� konu�uca��m�z� s�yledik
	 * Get= getir ve al demek bir de�eri okumay� y�nelik i�lemdir
	 * Set=kurmak, ayarlamak gibi de�erin de�erini atama de�erini yenileme anlam� olur.
	 * Encapsulation i�in fieldlar�mz� private yapt�k ve bunun sonucuyla bunlar� kullanabilmek i�in bir �ekilde
	 * ayarlama yapmam�z gerek
	 * 
	 * 
	 */
private int id;// bir �r��n�n id si var id �r�n� tan�mlayan e�siz de�erdir
	
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public int getId() {
		return id; // id yi okuyabilir demek
		
	}
	//setter
	public void setId(int id) {
	this.id=id;//this.id diyince bu classdaki tan�mlanm�� fielddaki id yi i�inkullan�c�n�n tan�mlad�g� id yi ata demek
		
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
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	/*Biz encapsulation dan yararlanmak i�in ne yapt�k?
	 * bunun fieldlar�n� getter ve setter la daha kullan�l�r hala getirdik
	 * BU noktada constructor lar ise class � newledi�inizde �al��an blo�u devreye sokmu� oluyorsunuz.
	 * yukarda 
	 * public Product() {
		System.out.println("Yap�c� blok �al��t�");
		}
		�ekilde tan�mlad�k ve mainde new ledi�imiz i�in �oktan �al��t�
		bu noktada product class�na bakt�g�m�zda
		public Product(int id, String name,String descripton, double price, int stockAmount,String renk ) {
		System.out.println("Yap�c� blok �al��t�");
	}
	bu �ekilde parametre yazd�g�m�z zaman sadece bu parametreler girilirse constructor �al��cak demek oluyor
	main e bakt�g�m�z zaman Product product=new Product(); parantez i�i hata verecek
	b�ylece bunu biz constructor blo�undan set edebiliriz ama istemezsek overloading yaparak
	product() yaparak yani bu claas i�erisine product() yazarak bunu yapabiliriz
	b�yle mainde �ncede yapt�g�m�z gibi tan�mlamalar� kullanabiliriz
	Product product=new Product();
	product.setName("Laptop");
	product.setId(1);
	product.setDescription("Asus Laptop")
	product.setPrice(5000);
	product.setStockAmount(3);
	
	
		
	 */
}
