package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.bussines.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("api/products")
public class ProductsController {
	
	private	ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
@GetMapping("/getall")	
public List<Product> getAll(){
	return this.productService.getAll();
	
}





}



//kurumsal mimari injection tekrardan bak


/*burada api isimlendirme kuralı var
 * productscontroller yazdık yani çogul isim veriririz yani class i çogul isimde oluşturduk
 * Peki Controller ne demek bu güne kadar controller duymadık
 * hepsiburadayı düşünelim
 * mobil uygulaması var android ve ios
 * web var yani angular
 * bunlar bambaşka uygulamalar bide bizim
 * backendimiz var
 * bunlar birbiriyle anlaşamıyor çünkü biri java diğerleri farklı bişi
 * bunun için api yerleştirdik 
 * ve içinde controller var yani havalimanları gibi düşünelim
 * gelen persistance i contorller düzenliyor gel kardeş iniş yap diyor
 * bunun için class üstüne belirtmek için :
 * @RestController yazdık
 * @RequestMapping da altına yazdık çünkü fazladan controller gerekli olabilir
 * bunu daha iyi anlamak için 
 * diyelim sitemiz olsun
 * kodlama.io/api/products içerinsinde gelen persistanci bu api karşılayacak -> @RequestMapping("api/products ")
 * gibi yazıyoruz
 * 
 * şimdi arkadaşlar artık operasyonlarımızı yazabiliriz
 * v
 *front end back endtten veri istediği zaman http yoluyola istiyor mesala bunun mantıgı get olyıuor
 *yani 
 *@GetMapping
 *
 *biz eğer böyle yazarsak nolur
 *diyelim bizim sitemiz kodlama io
 *@GetMapping("/getall")	
public List<Product> getAll(){
	
}
 *kodlama.io/api/products/getall tarzı istekde bulunursam yukardaki fonksiyon çalışacak
 *
 */
