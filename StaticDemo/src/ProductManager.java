
public class ProductManager {
public void add(Product product) {

	if(ProductValidator.isValid(product)) {
		System.out.println("Eklendi");
		
	}else {
		System.out.println("�r�n bilgileri ge�ersizdir");
	}
}


}
/*normalde validator.isValid yaz�yor a�a��daki yazd�g�m yerde
 * ki bu olabilsin diye yukarda da new leyip validator diye obje �rne�i olu�turmu�tuk
 * 
 * if(ProductValidator.isValid(product)) yap�cna gelmiyor
 * gelmesi i�in yapmam�z gereken;
 * ProductValidator class�na gidip, public static boolean isValid(Product product)
 * yazmak
 * Static ifadesi gene bu nesnenin �rne�ini olu�turyo�r. Fakat
 * bu statik olarak bir kere olu�uyor
 * ama sadece birkez kullan�l�r sadece isValid gibi utility lerde
 * Peki biz niye u�ra��yor
 * hepsine static yazal�m
 * Biz �nceden new li olu�turdugumuz zaman bellekte o obje olu�uyordu 
 * sonra o bellekten at�l�yordu i�imiz bitince
 * fakat static yaparsak hi�bir �ekilde at�lmaz yani bellekten at�lmaz
 * dikkatli yani �nemli s�n�flar yani classlar static yap�lmaz
 * yard�mc� ara�lar isvalid kullan�m� i�in sadece mesala
 * onlar i�in kullan�labilir
 * 
 * 
 * 
 */
