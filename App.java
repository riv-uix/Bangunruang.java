package bangunruang;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pilih;
		double panjang, lebar, tinggi, jari, tinggiPrisma;
		System.out.println("Pilih Bangun Ruang");
		System.out.println("1. Balok");
		System.out.println("2. Prisma Segitiga");
		System.out.println("3. Prisma Segiempat");
		System.out.println("4. Prisma Segilima");
		System.out.println("5. Tabung");
		System.out.println("6. Kerucut");
		System.out.println("7. Bola");
		System.out.print("Pilih: ");
		pilih = input.nextInt();
		switch (pilih) {
		case 1:
			System.out.print("Masukkan Panjang: ");
			panjang = input.nextDouble();
			System.out.print("Masukkan Lebar: ");
			lebar = input.nextDouble();
			System.out.print("Masukkan Tinggi: ");
			tinggi = input.nextDouble();
			Balok balok = new Balok(panjang, lebar, tinggi);
			balok.calcVolume();
			balok.calcLuasPermukaan();
			break;
		case 2:
			System.out.print("Masukkan Panjang Alas: ");
			panjang = input.nextDouble();
			System.out.print("Masukkan Lebar Alas: ");
			lebar = input.nextDouble();
			System.out.print("Masukkan Tinggi: ");
			tinggi = input.nextDouble();
			Prismasegitiga prismaSegitiga = new Prismasegitiga(panjang, lebar, tinggi);
			prismaSegitiga.calcVolume();
			prismaSegitiga.calcLuasPermukaan();
			break;
		case 3:
			System.out.print("Masukkan Panjang Alas: ");
			panjang = input.nextDouble();
			System.out.print("Masukkan Lebar Alas: ");
			lebar = input.nextDouble();
			System.out.print("Masukkan Tinggi: ");
			tinggi = input.nextDouble();
			Prismasesgiempat prismasesgiempat = new Prismasesgiempat(panjang, lebar, tinggi);
			prismasesgiempat.calcVolume();
			prismasesgiempat.calcLuasPermukaan();
			break;
		case 4:
			System.out.print("Masukkan Panjang Alas: ");
			panjang = input.nextDouble();
			System.out.print("Masukkan Lebar Alas: ");
			lebar = input.nextDouble();
			System.out.print("Masukkan Tinggi: ");
			tinggi = input.nextDouble();
			Prismasesgilima prismasegilima = new Prismasesgilima(panjang, lebar, tinggi);
			prismasegilima.calcVolume();
			prismasegilima.calcLuasPermukaan();
			break;
		case 5:
			System.out.print("Masukkan Jari-jari: ");
			jari = input.nextDouble();
			System.out.print("Masukkan Tinggi: ");
			tinggi = input.nextDouble();
			Tabung tabung = new Tabung(jari, tinggi);
			tabung.calcVolume();
			tabung.calcLuasPermukaan();
			break;
		case 6:
			System.out.print("Masukkan Jari-jari: ");
			jari = input.nextDouble();
			System.out.print("Masukkan Tinggi: ");
			tinggi = input.nextDouble();
			Kerucut kerucut = new Kerucut(jari, tinggi);
			kerucut.calcVolume();
			kerucut.calcLuasPermukaan();
			break;
		case 7:
			System.out.print("Masukkan Jari-jari: ");
			jari = input.nextDouble();
			Bola bola = new Bola(jari);
			bola.calcVolume();
			bola.calcLuasPermukaan();
			break;
		default:
			System.out.println("Pilihan tidak ada");
			break;

		}
	}
}
