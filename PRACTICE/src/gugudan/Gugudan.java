package gugudan;
import java.util.Scanner;


public class Gugudan {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		int num;
		
		System.out.print("������ ��� ���α׷��Դϴ�. �ܼ��� �Է��ϼ���. : ");
		num=wow.nextInt();
		
		if(num<=0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		else {
			for(int i=1;i<=9;i++) {
				System.out.println(num+" X "+i+" = "+num*i);
			}
		}
	}
}
