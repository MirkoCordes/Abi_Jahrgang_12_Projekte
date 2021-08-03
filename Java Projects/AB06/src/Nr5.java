import java.util.Scanner;

public class Nr5 {
	static float gewicht;
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Briefporto\nGewicht des Briefs in g: ");
		gewicht = scanner.nextFloat();
		
		if(gewicht <= 20) {
			System.out.print("Preis = 0,80€");
		} else if (gewicht <= 50) {
			System.out.print("");
		}else if (gewicht <= 500) {
			System.out.print("");
		}else if (gewicht <= 1000) {
			System.out.print("");
		}else {
			System.out.print("");
		}
	}
}
