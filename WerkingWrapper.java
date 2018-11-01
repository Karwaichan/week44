import java.util.Scanner;

public class WerkingWrapper {
	public static void main(String [] args){
		
		Scanner in = new Scanner (System.in);
		
		char karakter = 'A';
		int volwassen = 0;
		
		
		System.out.println("In welk jaar ben je geboren?");
		String input = in.nextLine();
		
		volwassen = Integer.parseInt(input) +18;
		
		System.out.println("Je bent volwassen in het jaar: " +volwassen);
		
		System.out.println("Het karakter " + karakter+ " is a kleine letter? "+Character.isLowerCase(karakter));
		System.out.println("Het karakter " + karakter+ " is a grote letter? "+Character.isUpperCase(karakter));
		System.out.println("Het karakter " + karakter+ " is een cijfer? "+Character.isDigit(karakter));
		
	}

}