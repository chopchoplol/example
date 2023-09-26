package Pyramid;
import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		System.out.print("피라미드의 층수를 입력하세요. : ");
		int num=wow.nextInt();
		
		if(num<=0) {
			System.out.println("잘못된 입력입니다.");
		}
		else {
			for(int i=1;i<=num;i++) {
				for(int j=0;j<num-i;j++) {
					System.out.print(" ");
				}
				for(int k=1;k<=(i*2)-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
