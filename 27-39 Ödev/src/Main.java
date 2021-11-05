
public class Main {
	//claslarla �al��mam�z�n sebebi g�ndelik hayattta insanlar�n ihtiyac� de�i�ti�i i�in insanlar�n ihtiyac�na g�re
	//direnmeyen programlar yapmam�z gerekir.
	/*Classlarla ba�layal�m sonra soyutlama k�sm�na ge�elim
	* class olay� interface olay� ve abstack olay syntax olarak bilinir ama 
	* kullan�lm�yor
	* Class �n �zellikleri
	* classlarla gruplama yap�yoruz(yazd�g�m�z metotlar� fonskiyonlar� vesayre)
	*
	*
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// normal de�i�ken olu�turur gibi bu sefer int yerine class yaz�caz
		//b�yle dedi�imiz bellekte customer manager �rettik
		//classlar reference tiptir. bellekte stack da adres heap de obje olu�turur
		//CustomerManager customerManager; bellekte olu�uyor
		//classlar� kullanambilmek i�in newlenmi� olmas� laz�m
		//new yazd�g�m�z zaman Belle�in Heap k�sm�nda obje yani nesne yani customer manager nesnesi olu�uyor
		//stackde customerManager; heapdeki objenin adresini tutuyor
		/*mesala customerManager2 diyip olustursam onunda stack ve heapde gerekli �eyleri olu�uyor
		 * ben e�er customerManager2 nin update veya add fonksiyonunu kullanacaksam onun
		 * heap indeki fonksiyonlar� kullanm�� oluyorum
		 * �imdi a�a��da bunlar� birbirine atayacam
		 * yani
		 * customerManager=customerManager2;
		 * b�yle bi�i yaparsam
		 * diyelim customerManagerin bellekteki yeri 101(stack)
		 * customerManager2 nin bellekteki yeri 102 (stack )�
		 * bunu yapt�g�m�zda 102 nini adresini customer manager a ata demek
		 * 
		 * yani art�k ikiside 102 ye gidiyor
		 * new diyince heapte nesne olu�turuyordu
		 * b�yle olunca 101 bo�ta kald�
		 * birazdan garbage collecter gelip 101 deki bo� kalan yeri siliyor yani java n�n bellek y�neticisi
		 * bir programc� new olu�tururken dikkat etmesi laz�m her zaman
		 *///////////////////////////////////////////////////////////////////////////
		/*�ok �nemli-deger ve referans tipleri anlamak
		 * bunlara value type denir
		 * 
		 * int sayi1=10;
		 * int sayi2=20;
		 * sayi2=sayi1;
		 * sayi1=30;
		 * peki bu value typle ler nas�l �al���yr
		 * stack ve heap olsun
		 * siz de�er tipte bir �ey tan�mladg�n�z zaman stack te olu�uyor
		 * di�erinde ise yani refarance tipte de�eri heapte oluyor
		 * sayi2=20 dedik
		 * deger tipleri okurken sayi2 nin de�eri sayi 1 in de�erine ata dedi�imizde ikiside 10 oluyor
		 * sonra sayi 1 i 30 yapm���z 
		 * �imdi size bir soru daha 
		 * int [] sayilar1=new int[]{1,2,3};
		 * int[] sayilar2=new int[]{4,5,6};
		 * sayilar2=sayilar1;
		 * sayilar1[0]=10;
		 * System.out.println(sayilar2[0])
		 * dedi�igimizde ne olur sizce
		 * arkada�lar diziler referans tiptir
		 * t�r� ne olursa olsun dizilerde ayn� class gibi referans tiptir
		 * diyelim Stack de
		 * s1 101
		 * s2 102
		 * heapte 101 123
		 * 		102 4 5 6
		 * sayilar2=sayilar1 sonras�nda bu de�i�kenlerin ikiside 123 yani 101 li olan adresi tutuyor
		 *  
		 * 
		 */
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		customerManager=customerManager2;
		
	
		
		
	}


}
