//�ҳ��������������� Part1
import java.util.Scanner;
public class SF4 {
	private static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		int size,i,max=0;
		System.out.print("������Ҫ�Ƚ�����������");
		size = input.nextInt();//�������鳤��
		int [] array = new int [size];		
		System.out.print("������Ҫ�Ƚϵ�����������"+size+"������");
		for(i=0;i<size;i++)
		{
			if (input.hasNextInt()) array[i] = input.nextInt();
			else break;
			if(i == 0)max=array[i];
			else if(max<array[i])max=array[i];
			i++;
		}
		System.out.print("�ô������������Ϊ "+max+"��");
		input.close();
	}
}