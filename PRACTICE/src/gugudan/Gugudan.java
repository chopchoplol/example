package gugudan;
import java.util.Scanner;


public class Gugudan {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		int num;
		
		System.out.print("구구단 출력 프로그램입니다. 단수를 입력하세요. : ");
		num=wow.nextInt();
		
		if(num<=0) {
			System.out.println("잘못된 입력입니다.");
		}
		else {
			for(int i=1;i<=9;i++) {
				System.out.println(num+" X "+i+" = "+num*i);
			}
		}
	}
}
