public class segitiga {
	private int alas;
	private int tinggi;
	private int sisimiring;
	private double luas;
	private double keliling;

		public segitiga(int a, int t, int s){
		alas = a;
		tinggi = t;
		sisimiring = s;
	}

	public void TampilkanSegitiga(){
		System.out.println("Segitiga=");
		System.out.println("Alas = " +alas);
		System.out.println("tinggi = " +tinggi);
		System.out.println("sisimiring = " +sisimiring);		
	}

	public void HitungSegitiga(){
		luas = 0.5*alas*tinggi;
		System.out.println("Luas Segitiga=" +luas);

		keliling = alas+tinggi+sisimiring;
		System.out.println("Keliling Segitiga=" +keliling);
	}
}