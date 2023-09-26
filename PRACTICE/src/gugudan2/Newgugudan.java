package gugudan2;
import java.util.Scanner;

public class Newgugudan {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		int first=1;
		int[][] gugu=new int[9][9];
		int dan;
		
		System.out.println("구구단을 계산하는 중입니다.");
		
		for(int i=0;i<gugu.length;i++) {
			for(int j=0;j<gugu[i].length;j++) {
				gugu[i][j]=first*(j+1);
			}
			first++;
		}
		
		System.out.println("구구단 계산이 완료되었습니다.");
		
		while(true) {
			System.out.print("\n원하는 단을 입력하세요 (1~9) : ");
			dan=wow.nextInt();
			
			for(int i=1;i<=gugu[dan-1].length;i++) {
				System.out.println(dan+" X "+i+" = "+(dan*i));
			}
		}
	}
}
