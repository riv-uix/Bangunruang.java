package bangunruang;

public class Prismasesgilima extends Prisma implements Geometri {
	public Prismasesgilima(double alas, double tinggi, double tinggiPrisma) {
		super(alas, tinggi, tinggiPrisma);
		this.tinggiPrisma = tinggiPrisma;
	}

	public void calcVolume() {
		System.out.println("Volume Prismasegilima: " + getVolume());
	}

	public void calcLuasPermukaan() {
		System.out.println("Luas Permukaan Prismasegilima: " + getLuasPermukaan());
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
