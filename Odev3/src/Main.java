
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Person wPerson=new WomanPerson(1,"Ay�e","Bozkurt",2001);
	wPerson.bilgiDogrulama();
	Person mPerson=new ManPerson(2,"Kerem","Bozkurt",2001);
	mPerson.bilgiDogrulama();
	Person ChildPerson=new ChildPerson(3,"Ali","Y�lmaz",2006);
	ChildPerson.bilgiDogrulama();
	Game WhoBuyedGame=new Game();
	WhoBuyedGame.buyGame(ChildPerson);


	

}
}
/*Bir oyun yazmak istiyorsunuz. Bu yaz�l�m i�in backend kodlar�n� JAVA ile geli�tirmeyi planl�yoruz. Yeni �ye, sat�� ve kampanya y�netimi yap�lmas� isteniyor. Nesnelere ait �zellikleri istedi�iniz gibi verebilirsiniz. Burada ama� yazd���n�z kodun kalitesidir. �devde gereksinimleri tam anlamad���n�z durum benim i�in �nemli de�il, kendinize g�re mant�k geli�tirebilirsiniz. Dedi�im gibi kod kalitesiyle ilgileniyoruz �u an :)



Gereksinimler

1.     Oyuncular�n sisteme kay�t olabilece�i, bilgilerini g�ncelleyebilece�i, kay�tlar�n� silebilece�i bir ortam� simule ediniz. M��teri bilgilerinin do�rulu�unu e-devlet sistemlerini kullanarak do�rulama yapmak istiyoruz. (E-devlet sistemlerinde do�rulama TcNo, Ad, Soyad, Do�umY�l� bilgileriyle yap�l�r. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)

2.     Oyun sat��� yap�labilecek sat�� ortam�n� simule ediniz.( Yap�lan sat��lar oyuncu ile ili�kilendirilmelidir. Oyuncunun parametre olarak metotta olmas�n� kastediyorum.)

3.     Sisteme yeni kampanya giri�i, kampanyan�n silinmesi ve g�ncellenmesi imkanlar�n� simule ediniz.

4.     Sat��larda kampanya entegrasyonunu simule ediniz.

5.     �devinizi Github�a y�kleyiniz. Github linkinizi payla��n�z.

6. Di�er arkada�lar�n�n�z Github kodlar�n� inceleyiniz. Ona y�ld�z vermeyi unutmay�n�z :)
*/