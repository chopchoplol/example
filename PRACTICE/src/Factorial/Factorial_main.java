package Factorial;
import java.util.Scanner;

public class Factorial_main {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		int num,total=1,org;
		System.out.println("���丮���� ����� �帳�ϴ�. N�� �Է��ϼ���.");
		num=wow.nextInt();
		org=num;
		
		if(num<=0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		else {
			
			for(int i=0;i<org;i++) {
				total*=num--;
		
			}
			
			System.out.println(org+"! = "+total+"�Դϴ�.");
		}
	}
}
