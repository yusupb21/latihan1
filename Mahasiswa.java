public class Mahasiswa {
	public String nama;
	
	public void kuliah() {
		System.out.println ("kuliah");
	}
	
	public static void main (String[] args) {
		Mahasiswa rendy = new Mahasiswa();
		
		rendy.nama = "Rendy Firmansyah";
		rendy.kuliah();
		}
}