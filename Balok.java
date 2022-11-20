package bangunruang;

public class Balok extends Kotak implements Geometri {
	public Balok(double panjang, double lebar, double tinggi) {
		super(panjang, lebar, tinggi);
	}

	public void calcVolume() {
		System.out.println("Volume Balok: " + getVolume());
	}

	public void calcLuasPermukaan() {
		System.out.println("Luas Permukaan Balok: " + getLuasPermukaan());
	}
}
