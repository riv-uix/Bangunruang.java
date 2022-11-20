package bangunruang;

public class Prismasesgiempat extends Prisma implements Geometri {
	public Prismasesgiempat(double alas, double tinggi, double tinggiPrisma) {
		super(alas, tinggi, tinggiPrisma);
		this.tinggiPrisma = tinggiPrisma;
	}

	public void calcVolume() {
		System.out.println("Volume Prismasesgiempat: " + getVolume());
	}

	public void calcLuasPermukaan() {
		System.out.println("Luas Permukaan Prismasesgiempat: " + getLuasPermukaan());
	}

	public double getVolume() {
		return (getLebar() * tinggiPrisma);
	}

	public double getLuasPermukaan() {
		return (getKeliling() * tinggiPrisma) + (2 * getLebar());
	}

	private double getKeliling() {
		return 0;
	}

	private double tinggiPrisma;
}
