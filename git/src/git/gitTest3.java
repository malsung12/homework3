package git;

import java.util.Scanner;

public class gitTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		int month = 0 , day = 0;
		int count, i, total = 0;
		int num[] = {31,28,31,30,31,30,31,31,30,31,30,0};
		
		System.out.print("���� �Է��Ͻÿ�: ");
		month = a.nextInt();
		System.out.print("���� �Է��Ͻÿ�: ");
		day = a.nextInt();
		
		for(i = 0; i <= month-1; i++){
			total += num[i];
		}
		count = total + day;
		
		System.out.print(month+"�� "+ day+"����"+count+"�Դϴ�.");
	}

}