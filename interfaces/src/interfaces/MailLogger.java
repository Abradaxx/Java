package interfaces;

public class MailLogger implements Logger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("E mail g�nderildi:"+message);
		//burayada e mail g�nderilmesi i�in gereken kodlar
	}
	
	
}
