package Stack;
import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		String[] name= {"ö��","����","����","����"};

		int[] rlscore=new int[4];
		int num;
		String[] str= {"��"," "};
		int q=100;
		
		System.out.println("������ ������ 0~100�̸� 10���� �Դϴ�.");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"�� ������ �Է����ּ��� : ");
			num=wow.nextInt();
			rlscore[i]=num-num%10;
		}
		
		System.out.println("==========================================");
		
		for(int i=100;i>0;i-=10) {
			System.out.print(i+"-\t");
			
			for(int j=0;j<rlscore.length;j++) {
				if(rlscore[j]-i>=0) {
					System.out.print("��\t");
				}
				else
					System.out.print(" \t");
			}
			System.out.println();
		}
		System.out.print("\t");
		for(int k=0;k<name.length;k++){
			System.out.print(name[k]+"\t");
		}
	
		System.out.println("\n============================================");
	}
}
