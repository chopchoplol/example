package Factorial;
import java.util.Scanner;

public class Factorial_main {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		int num,total=1,org;
		System.out.println("팩토리얼을 계산해 드립니다. N을 입력하세요.");
		num=wow.nextInt();
		org=num;
		
		if(num<=0) {
			System.out.println("잘못된 입력입니다.");
		}
		else {
			
			for(int i=0;i<org;i++) {
				total*=num--;
		
			}
			
			System.out.println(org+"! = "+total+"입니다.");
		}
	}
}
