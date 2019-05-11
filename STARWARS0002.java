import java.util.Scanner;
//NAMA : ISMAIL UMAR
//NIM  : D0217308
//KELAS: INFORMATIKA. A 2017

public class STARWARS0002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("INPUT");
		System.out.print("panjang : ");
		double panjang = input.nextDouble();
		System.out.print("lebar : ");
		double lebar = input.nextDouble();
		
		double luas = (panjang * lebar);
		double keliling = 2 * (panjang + lebar);

		System.out.println("OUTPUT");
		System.out.println("luas : " + luas);
		System.out.println("keliling: " + keliling);
	}
}
