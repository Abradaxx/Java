package abstractReCap;

public class CustomerManager {

	BaseDataBaseManager dataBaseManager;
	
	
	public void getCustomers() {
		//OracleDataBaseManager oracleDataBaseManager=new OracleDataBaseManager();
		//bunu yaparsak yarrag� yedik, ba��ml�y�z !
		// bunun yerine bunlar�n extend etti�i s�n�ftan ula�abiliriz
		dataBaseManager.getData();
}




}
