import java.util.Scanner;

public class Galgje {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	String test = "papegaai"; //bekijk arraylist functionaliteit.
	int counter = 0;
	
	
	System.out.println("\t#####-Welkom bij galgje!-####");
	printMenu();
	
	Game:
	while(true) {
		
			System.out.println("\tVul een 'voorlopig' woord  in"); //zoek uit hoe je per letter kan controleren.
			String gok = input.next();
			
	
			if(gok.equals("2")) {
				break;
			}
			if(gok.equals(test)) {
				counter++;
				System.out.println("\tJe hebt het prototype verslagen, pfff...big deal!");
				break;
			}
			if(gok.equals("1")) {
				getProgressie(counter);
				continue Game;
			}
			getWoord();
			//getPoppetje();
			counter++;
		}
	System.out.println("\t#######################");
	System.out.println("\t# Bedankt en tot Ooit!#");
	System.out.println("\t#######################");
	getProgressie(counter);
	}
	
	public static void printMenu() {
		System.out.println("\t\t**SpelMenu**");
		System.out.println("\t<DRUK> 1. Om progressie te zien.");
		System.out.println("\t<DRUK> 2. Om te stoppen.");
		System.out.println("");
	}
	public static void getProgressie(int counter) {
		System.out.println("\tJe hebt in het spel "+counter+ " pogingen gedaan.");
	}
	public static void getWoord() {
		System.out.println("");
		System.out.println("Je hebt de volgende (??????? - letters) al geraden\n");
		
	}
}