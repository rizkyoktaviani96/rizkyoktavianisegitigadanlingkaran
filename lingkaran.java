public class lingkaran{
	private int jari;
	private double luaslingkaran;
	private double keliling;

	public lingkaran(int r){
		jari = r;
	}

	public void TampilLingkaran(){
		System.out.println("Lingkaran=");
		System.out.println("jari-jari lingkaran=" +jari);
	}

	public void HitungLingkaran(){
		luaslingkaran = Math.PI*jari*jari;
		System.out.println("Luas Lingkaran=" +luaslingkaran);

		keliling = Math.PI*(jari+jari);
		System.out.println("Keliling Lingkaran=" +keliling);
	}
}