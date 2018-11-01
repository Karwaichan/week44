public class NietPriem {
	
	public static boolean isEven(int x) {
		 if(x %2==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String [] args) {
		
		int uitkomst = 0;
		
		for(int x = 1;x<1000;x++) {
			if(isEven(x)==true) {
				uitkomst += x;
				System.out.println(x);
			}
			
		}
		System.out.println("Total sum of even numbers is: "+uitkomst);
		
	}
	
}