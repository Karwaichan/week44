import java.util.Random;
import java.util.Scanner;

public class Galgje {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	Random random = new Random();
	String test = "papegaai"; //bekijk arraylist functionaliteit.
	String raden ="";
	
	String[] woorden = { "auto", "guitaar", "sneeuw","peper","fruit" };
	char[] randomGuess = woorden[random.nextInt(woorden.length)].toCharArray();
	
	
	
	int raadTeller = 1;
	int raadLimiet = 6;
	boolean raadPogingen = false;
	
	
	System.out.println("\t#####-Welkom bij galgje!-####");
	printMenu();
	
	Game:
	while(!raden.equals(test) && !raadPogingen) {
			
			if(raadTeller<=raadLimiet) {
			System.out.println("\tVul een 'voorlopig' woord  in"); //zoek uit hoe je per letter kan controleren.
			String gok = input.next();
			raadTeller++;
			}else {
				raadPogingen = true;
			}
	

		}
	if(raadPogingen) {
		System.out.println("Je hebt verloren je mag niet meer raden");
	}
	System.out.println("\t#######################");
	System.out.println("\t# Bedankt en tot Ooit!#");
	System.out.println("\t#######################");
	
	}
	
	public static void printMenu() {
		System.out.println("\t\t**SpelMenu**");
		System.out.println("\t<DRUK> 1. Om progressie te zien.");
		System.out.println("\t<DRUK> 2. Om te stoppen.");
		System.out.println("");
		
	}

}