import java.util.Random;
import java.util.Scanner;

public class Hoofdprogramma {
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

	
	
	while(!raden.equals(test) && !raadPogingen) {
			
			if(raadTeller<=raadLimiet) {
			System.out.println("\tVul een letter  in"); //zoek uit hoe je per letter kan controleren.
			printArray(randomGuess);
			String gok = input.next();
			char invoer = input.nextLine().charAt(0);
			raadTeller++;
			}else {
				raadPogingen = true;
			}
			
			if(input.equals(randomGuess)) {
				
			}
	

		}
	if(raadPogingen) {
		System.out.println("Je hebt verloren je mag niet meer raden");
	}
	System.out.println("\t#######################");
	System.out.println("\t# Bedankt en tot Ooit!#");
	System.out.println("\t#######################");
	
	}
	
	public static void printArray(char[] array) {
		for(int x =0;x<array.length;x++) {
			array[x] = '_';
			System.out.print("\t"+array[x]+" ");
		}
	}

}
