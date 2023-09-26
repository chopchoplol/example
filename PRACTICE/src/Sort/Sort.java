package Sort;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		int[] array=new int[10];
		int temp;
		Scanner wow=new Scanner(System.in);
		
		System.out.println("오름차순 정렬을 시작합니다. 배열을 채워주세요");
		for(int i=0;i<array.length;i++) {
			System.out.print((i+1)+"번째 원소를 입력하세요 : ");
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
		
		System.out.print("오름차순 정렬 결과 : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
			if(i<array.length-1) {
				System.out.print(", ");
			}
		}
	}
}
