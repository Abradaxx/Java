package nLayeredDemo.business.concretes;
import java.util.List;
import nLayeredDemo.business.abstracs.IProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.IProductsDao;
import nLayeredDemo.entities.concretes.Product;



public class ProductManager implements IProductService {
 
	private IProductsDao productDao;
	private LoggerService loggerService;
	

	public ProductManager(IProductsDao productDao, LoggerService loggerService) {
	super();
	this.productDao = productDao;
	this.loggerService=loggerService;

	
	/*Bunun sayesinde hybernateProductDao ya ba�l� de�iliz
	 * ama hybernate in ProductDao nun refereans� tutabilen interface
	 * sayesinde kolayca ekleme yapabilece�iz
	 * 
	 * 
	 */
}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		//�� kodlar�
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n Kabul Edilmiyor");
			return;//metod i�i bitirir burada a�a�� bakmaz olay� bitirir
			
		}
		//HibernateProductDao dao=new HibernateProductDao();
		//dao.add(product);
		//bu �ok yanl�� ba��ml� hale geliyoruz
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi: "+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}//i� kodlar�n� yapan s�n�ft�

	
	
	
	
}
