//找出出数组中最大的数 Part1
import java.util.Scanner;
public class SF4 {
	private static Scanner input;
	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		int size,i,max=0;
		System.out.print("请输入要比较数的数量：");
		size = input.nextInt();//输入数组长度
		int [] array = new int [size];		
		System.out.print("请输入要比较的数（不超过"+size+"个）：");
		for(i=0;i<size;i++)
		{
			if (input.hasNextInt()) array[i] = input.nextInt();
			else break;
			if(i == 0)max=array[i];
			else if(max<array[i])max=array[i];
			i++;
		}
		System.out.print("该串数字中最大数为 "+max+"！");
		input.close();
	}
}
