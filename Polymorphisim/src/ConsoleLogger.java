
public class ConsoleLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to console:"+message);

		/*Overriding sayesinde inheritance ile sahip olunan ayn� zamande base loggerdan
		 * bulunan fonksiyonu her bir class i�in iste�e ba�l� d�zenlenebilir
		 * buna overriding denir
		 * 
		 */
		
}
}
