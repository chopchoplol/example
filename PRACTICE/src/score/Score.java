package score;
import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		String[] name= {"ö��","����","�浿","����"};
		String[] str2= {"�̸�","����","����","����","����"};
		int[][] score=new int[4][4];
		int num;
		
		System.out.println("���� ���α׷��Դϴ�.");
		System.out.print("���� : ");
		for(int i=1;i<str2.length;i++) {
			System.out.print(str2[i]);
			if(i<str2.length-1) {
				System.out.print(", ");
			}
		}
		
		System.out.print("\n�л� : ");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]);
			if(i<name.length-1) {
				System.out.print(", ");
			}
		}

		for(int i=0;i<name.length;i++) {
			System.out.println("\n\n"+name[i]+"�� ������ �Է��ϼ���.");
			for(int j=1;j<str2.length;j++) {
				System.out.print(str2[j]+" : ");
				num=wow.nextInt();
				score[i][j-1]=num;
			}
		}
		
		System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
		for(int i=0;i<str2.length;i++) {
			System.out.print(str2[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
