import java.util.Scanner;

public class Nr1 {
	static int zahl1, zahl2, ergebnis;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Subtraktion zweier ganzer Zahlen");
		System.out.print("Zahl 1: ");
		zahl1 = scanner.nextInt();
		
		System.out.print("Zahl 2: ");
		zahl2 = scanner.nextInt();
		
		ergebnis = zahl1-zahl2;
		System.out.println("Das Ergebnis der Subtraktion " + zahl1 +  " - " + zahl2 + " ist " + ergebnis);
		System.out.println("Programmende Subtraktion");
	}

}
