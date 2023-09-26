


public class ¿¹¿Ü {
	public static void main(String[] args) {
		
		String[] stringNumber = {"23", "12", "3.141592"};
		
		int i;
		for(i=0;i<3;i++) {
			
			try {
				
			System.out.println("Value converted to integer: " + Integer.parseInt(stringNumber[i]));
		
			}
			
			catch(NumberFormatException e){
				System.out.println(stringNumber[i]+"cannot be converted to integer");
			}
		}
		
	}
}
