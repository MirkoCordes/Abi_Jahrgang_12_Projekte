import java.util.Scanner;

public class Nr2 {
	static int x1, x2, y1, y2;
	static double ergebnis;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Punktabstand\n1. Punkt x: ");
		x1 = scanner.nextInt();
		System.out.print("1. Punkt y: ");
		y1 = scanner.nextInt();
		System.out.print("2. Punkt x: ");
		x2 = scanner.nextInt();
		System.out.print("2. Punkt y: ");
		y2 = scanner.nextInt();
		
		ergebnis = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.print("Der Punktabstand ist: " + ergebnis + "\nProgrammende Subtraktion");
		
	}

}
