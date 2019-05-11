import java.util.Scanner;
//NAMA : ISMAIL UMAR
//NIM  : D0217308
//KELAS: INFORMATIKA. A 2017
public class STARWARS0002 {	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("INPUT");
		System.out.print("panjang : ");
		int panjang = input.nextInt();
		System.out.print("lebar : ");
		int lebar = input.nextInt();
	

		int luas = ( panjang * lebar );
		int keliling = (2 * panjang + 2 * lebar);
		
		System.out.println("OUTPUT");
		System.out.println("luas : " + luas);
		System.out.println("keliling : " + keliling);
		}
	}

