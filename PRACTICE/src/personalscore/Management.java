package personalscore;
import java.util.Scanner;
public class Management {
	Scanner wow=new Scanner(System.in);
	String[] name= {"철수","영희","길동","지수"};
	String[] subject= {"국어","영어","수학","과학"};
	int score;
	
	public Management() {
		System.out.println("성적 프로그램입니다.");
		System.out.print("과목 : ");
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]);
			if(i<subject.length-1)
				System.out.print(", ");
		}
		System.out.print("\n학생 : ");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]);
			if(i<name.length-1)
				System.out.print(", ");
		}
		System.out.println();
		
		printdata(name,subject,inputdata(name,subject));
	}
	
	public String[][] inputdata(String[] name, String[] subject){
		String[][] score1=new String[4][4];
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]+"의 성적을 입력하세요");
			for(int j=0;j<subject.length;j++) {
				System.out.print(subject[j]+" : ");
				score=wow.nextInt();
				
				score1[i][j]=Integer.toString(score);
			}
		}
		
		return score1;
	}
	
	public void printdata(String[] name, String[] subject, String[][] data) {
		System.out.println("성적 입력이 완료되었습니다.");
		System.out.print("이름\t");
		for(int i=0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
			for(int q=0;q<data[i].length;q++) {
				System.out.print(data[i][q]+"\t");
			}
			System.out.println();
		}
	}
}
