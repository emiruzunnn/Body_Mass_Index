import java.util.Scanner;

public class VucutKitle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lutfen Kilonuzu Giriniz: ");
		double kilo = scanner.nextDouble();
		
		System.out.println("Lutfen Boyunuzu (Metre Cinsinden) Giriniz: ");
		double boy = scanner.nextDouble();
		
		double index = kilo / (boy * boy);
		System.out.print("Vucut Kitle Indexiniz: " + index);

	}

}
