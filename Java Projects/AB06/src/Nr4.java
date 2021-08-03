import java.util.Scanner;

public class Nr4 {
	static int zahl;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ZahlInfo\nZahl: ");
		zahl = scanner.nextInt();
		
		System.out.print("Die eingegebene Zahl ist ");
		if(zahl > 0) {
			System.out.print("groesser 0 und ");
		} else {
			System.out.print("keiler 0 und ");
		}
		
		if(zahl%2 == 0) {
			System.out.print("gerade.");
		} else {
			System.out.print("ungerade.");
		}
		
		System.out.println("\nProgrammende ZahlInfo");
	}

}
