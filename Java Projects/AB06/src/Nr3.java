import java.util.Scanner;

public class Nr3 {
	static float verbrauchL, gefahrenKm, ergebnis;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Berechnung Durchschnittsverbrauch\nverbrauchter Kraftstoff in l: ");
		verbrauchL = scanner.nextFloat();
		System.out.print("gefahrene Strecke in km: ");
		gefahrenKm = scanner.nextFloat();
		
		if(verbrauchL > 0 || gefahrenKm > 0) {
			ergebnis = verbrauchL/gefahrenKm*100;
			System.out.print("Der Verbrauch liegt bei " + ergebnis + " Litern je 100 km\nProgrammende Durchschnittsverbrauch");
		} else {
			System.out.print("FEHLER: Die Werte müssen der Wahrheit entsprechen!");
		}
	}

}
