enum DagenInWeek{
	MAANDAG,DINSDAG,WOENSDAG,DONDERDAG,VRIJDAG,ZATERDAG,ZONDAG;
}

public class Week{
	
	public static void main (String [] args) {
		DagenInWeek d;
				
		d = DagenInWeek.VRIJDAG;
		
		switch (d) {
		case MAANDAG: System.out.println("Het is blue monday");
		break;
		case DINSDAG: System.out.println("Het is blue dinsdag");
		break;
		case WOENSDAG: System.out.println("Het is blue woensdag");
		break;
		case DONDERDAG: System.out.println("Het is blue donderdag");
		break;
		case VRIJDAG: System.out.println("Het is TGIF");
		break;
		case ZATERDAG: System.out.println("Het is happy Zaterdag");
		break;
		case ZONDAG: System.out.println("Het is happy Zondag");
		break;
		default: System.out.println("Dit is geen dag in de week");
		break;
		
		}
		
	}
}