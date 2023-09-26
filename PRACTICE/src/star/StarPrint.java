package star;
import java.util.Scanner;
public class StarPrint {
	int num;
	
	public StarPrint() {
		Scanner wow=new Scanner(System.in);
		System.out.print("피라미드이 층수를 입력하세요 : ");
		num=wow.nextInt();
		
		if(num<=0)
			System.out.println("잘못된 입력입니다.");
		else
			starP(num);
	}
	
	public void starP(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
