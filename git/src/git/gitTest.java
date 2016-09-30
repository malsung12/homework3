package git;
import java.util.Scanner;

public class gitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner a = new Scanner(System.in);
         
         int[] num = new int[10] ;
         int max =  1, min = 10000, i;
         
         for(i = 0; i < 10; i ++){
         System.out.print("숫자를 입력하세요: ");
         num[i] = a.nextInt();
         
         if(num[i] == 0)
         	break;
         if(num[i] < min)
             min = num[i];
         if(num[i] > max)
         	max = num[i];
         }
         System.out.print("가장 큰 수는" + max + "이고 가장 작은 수는 " + min + "입니다.");

	}

}
