import java.util.Scanner;
//NAMA : ISMAIL UMAR
//NIM  : D0217308
//KELAS: INFORMATIKA. A 2017
public class STARWARS0002 {	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("INPUT");
		System.out.print("panjang : ");
		double p = input.nextDouble();
		System.out.print("lebar : ");
		double l = input.nextDouble();

		int luas = (int)p * (int)l;
		int keliling = (int) (p + p + l + l);
		
		System.out.println("OUTPUT");
		System.out.println("luas : " + luas);
		System.out.println("keliling : " + keliling);
		}
	}

