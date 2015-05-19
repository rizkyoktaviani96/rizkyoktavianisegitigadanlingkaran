public class testhitungan{
	public static void main(String[] args){
		segitiga sg = new segitiga(4,8,12);
		sg.TampilkanSegitiga();
		System.out.println("");
		sg.HitungSegitiga();

		System.out.println();
		System.out.println();

		lingkaran link = new lingkaran(20);
		link.TampilLingkaran();
		System.out.println("");
		link.HitungLingkaran();
	}
}