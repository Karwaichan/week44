import java.util.Scanner;

class LandProgramma{

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
			System.out.println("Vul shortcode in van land of 'stop' om ermee op te houden");
			String land;
			while(true)	{
				land = input.nextLine();
				if(land.equalsIgnoreCase("stop")){
					break;
				}
				switch(land){
					case "NL": System.out.println("Nederland, Euro");
					break;
					case "JP": System.out.println("Japan, Japanse Yen");
					break;
					case "KO": System.out.println("Korea, Koreaanse Won");
					break;
					default: System.out.println("Vul shortcode in van land of 'stop' om ermee op te houden");
					break;
				}
				
			}
			
	}
}