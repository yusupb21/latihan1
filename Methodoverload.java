public class Methodoverload {
	
	public static void main (String[] args) {
	MethodOverloading method = new MethodOverloading();
	method.methodTampilkan("Belajar Java Yuks");
	method.methodTampilkan("Belajar Java Yuks", "Hingga Mengerti");
	System.out.println(method.tambahkanNilai(3, 5));
	}
	
private void methodTampilkan(String nama) {
	System.out.println(nama);
	}
private void methodTampilkan(String nama, String nama1) {
	return nama, nama1;
	}
}