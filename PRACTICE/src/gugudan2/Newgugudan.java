package gugudan2;
import java.util.Scanner;

public class Newgugudan {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		int first=1;
		int[][] gugu=new int[9][9];
		int dan;
		
		System.out.println("�������� ����ϴ� ���Դϴ�.");
		
		for(int i=0;i<gugu.length;i++) {
			for(int j=0;j<gugu[i].length;j++) {
				gugu[i][j]=first*(j+1);
			}
			first++;
		}
		
		System.out.println("������ ����� �Ϸ�Ǿ����ϴ�.");
		
		while(true) {
			System.out.print("\n���ϴ� ���� �Է��ϼ��� (1~9) : ");
			dan=wow.nextInt();
			
			for(int i=1;i<=gugu[dan-1].length;i++) {
				System.out.println(dan+" X "+i+" = "+(dan*i));
			}
		}
	}
}
