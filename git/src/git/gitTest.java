package git;
import java.util.Scanner;

public class gitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner a = new Scanner(System.in);
         
         int[] num = new int[10] ;
         int max =  1, min = 10000, i;
         
         for(i = 0; i < 10; i ++){
         System.out.print("���ڸ� �Է��ϼ���: ");
         num[i] = a.nextInt();
         
         if(num[i] == 0)
         	break;
         if(num[i] < min)
             min = num[i];
         if(num[i] > max)
         	max = num[i];
         }
         System.out.print("���� ū ����" + max + "�̰� ���� ���� ���� " + min + "�Դϴ�.");

	}

}
