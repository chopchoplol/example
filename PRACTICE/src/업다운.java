import java.util.Scanner;
import java.util.Random;

public class ¾÷´Ù¿î {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			Random num = new Random();
			
			int number = num.nextInt(100);
			int i, j=0, h=99;
			int put = s.nextInt();
			String boo = s.next();
			String wow = null;
			boolean re;
			
			System.out.println("Random number is generated. Guess the number: ");
			System.out.println("0~99");
			
			for(i=1;;i++) {
				
				
				System.out.println(j + "~" + h);
				
				try {
					System.out.println(i + ">>" + put);
					
				}
				
				catch(NumberFormatException e) {
					System.out.println("Only integer is allowed");
					
					continue;
				}
				
				if(put > number) {
					System.out.println("Enter a larger number.");
					
					put = j;
					continue;
					
				}
				else if(put < number) {
					System.out.println("Enter a smaller number.");
					
					put = h;
					continue;
				}
				else {
					System.out.println("Correct.");
					System.out.println("Try again? (y/n)>>" + boo);
					
					if(boo == "N") {
						wow = "true";
						break;
					}
					
				}
				
			
				break;
				
				
				
			}
			
			if(wow == "true") {
				break;
			}
			
			
			
			
			
		}
		
		
		
		
		
	}
}
