package bangunruang;

class Kubus extends Kotak implements Geometri {
	public Kubus(double panjang, double lebar, double tinggi) {
		super(panjang, lebar, tinggi);
	}

	@Override
	public void calcVolume() {
		setVolume(getPanjang() * getLebar() * getTinggi());
	}

	private void setVolume(double d) {
	}

	@Override
	public void calcLuasPermukaan() {
		setLuasPermukaan(6 * (getPanjang() * getLebar()));
	}

	private void setLuasPermukaan(double d) {
	}

}
