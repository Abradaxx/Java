package abstractClasses;

public abstract class GameCalculator {
	

		public abstract void hesapla();
		
		public final void gameOver() {
			System.out.println("Oyun Bitti");
		}
	 
}
/* Abstract class oldugu zaman herkes kendi hesaplas�n� yazmak zorunda
 * yani override olucak ve herkes kendi hesab�n� yazacak
 * Abstract classlar base s�n�flar� gizlemeye yarar ��nk� abstract classlar 
 * tek ba��na kullanmaz yani newlenemez
 * 
 * 
 */

