package oopIntro;

public class Category {
	//�nce bir kategoriyi kategori yapan �zellikleri buraya koyuyoruz
	
	private int id;
	private String Name;
	
	public Category(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public Category() {
		// TODO Auto-generated constructor stub
	}
	//constructor vermeden yapm�� olduma�a��da ama yukar�da constructor yaparakta bu degerleri verdirebiliri
	// bu da �nemli olan degi�kenin okunabilir veya yaz�labilir olmas�na g�re de�i�ir.
	public int getId() {
		return this.id;
		
	}
	public void setId(int id) {// void bunun i�i bir �ey d�nd�rm�cem bir �ey yap�cam demek not et bunlar� deftere 
		this.id=id;// verece�im degeri buraya at�yaca��m
		
		
		
	}
	public String getName() {
		return this.Name+"!";
		
	}
	public void setName(String Name) {
		this.Name=Name;
		
	}
	///// yukarada yapt�g�m�z �rne�i sa�t�k source ve getter ve setter ile yapabilirz
	
}
