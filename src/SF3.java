//��������������� Part1
import java.util.Scanner;
public class SF3{
	public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			int A = input.nextInt();//ʲô����next����ͽ�ʲô ע���Сд
			System.out.print("����������B:");
			int B = input.nextInt();//ʲô����next����ͽ�ʲô ע���Сд
			System.out.print("�ϴ���Ϊ��");
			if(A>B)System.out.println(A);
			else System.out.println(B);	
			input.close();
	}
}