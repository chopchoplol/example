package Sort;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		int[] array=new int[10];
		int temp;
		Scanner wow=new Scanner(System.in);
		
		System.out.println("�������� ������ �����մϴ�. �迭�� ä���ּ���");
		for(int i=0;i<array.length;i++) {
			System.out.print((i+1)+"��° ���Ҹ� �Է��ϼ��� : ");
			int num=wow.nextInt();
			
			array[i]=num;
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.print("�������� ���� ��� : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i<array.length-1) {
				System.out.print(", ");
			}
		}
	}
}
