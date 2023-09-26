package score;
import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner wow=new Scanner(System.in);
		String[] name= {"철수","영희","길동","지수"};
		String[] str2= {"이름","국어","영어","수학","과학"};
		int[][] score=new int[4][4];
		int num;
		
		System.out.println("성적 프로그램입니다.");
		System.out.print("과목 : ");
		for(int i=1;i<str2.length;i++) {
			System.out.print(str2[i]);
			if(i<str2.length-1) {
				System.out.print(", ");
			}
		}
		
		System.out.print("\n학생 : ");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]);
			if(i<name.length-1) {
				System.out.print(", ");
			}
		}

		for(int i=0;i<name.length;i++) {
			System.out.println("\n\n"+name[i]+"의 성적을 입력하세요.");
			for(int j=1;j<str2.length;j++) {
				System.out.print(str2[j]+" : ");
				num=wow.nextInt();
				score[i][j-1]=num;
			}
		}
		
		System.out.println("성적 입력이 완료되었습니다.");
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
