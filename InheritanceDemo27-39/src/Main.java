
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inhertinca daha ger�ek�i ger�ek hayatta kullan�m�
		// yaz�l�mda en �nemli olgu de�i�ikliktir.
		//amac�m�z de�i�ime direnmiyen programlar yazmak
		//�imdi bir bankac�l�k uygulamas� d���n�n
		//�imdi diyelim ki bu bir kredi hesapla
		//OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		//ogretmenKrediManager.hesapla();
		//krediu� olu�turduktan sonra buradan parametre �a��rarak kullanabiliriz
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		//i�te buna poliforimz diyor.
		//Gelin �imdi bir �nceki video da s�yledi�im gibi polimorfizm yapal�m
		//
		
	}

}
