package star;
import java.util.Scanner;
public class StarPrint {
	int num;
	
	public StarPrint() {
		Scanner wow=new Scanner(System.in);
		System.out.print("�Ƕ�̵��� ������ �Է��ϼ��� : ");
		num=wow.nextInt();
		
		if(num<=0)
			System.out.println("�߸��� �Է��Դϴ�.");
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
