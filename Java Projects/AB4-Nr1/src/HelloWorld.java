
public class HelloWorld {
	
	public static int i = 3; 
	
	public static void main(String[] args) {
		// i ist immer 3
		
		
		i=3;
		//i = SetzeIAufZehn(i);
		//System.out.println("Zahl i=" + i);
		if(i==4) {
			System.out.println("Zahl i=" + i);
		} else if (i==3) {
			i++;
		}
	}
	
	/*public static int SetzeIAufZehn(int i) {
		i = 10;
		return i;
	}
	*/

}
