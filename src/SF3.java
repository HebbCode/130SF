//求两个数的最大者 Part1
import java.util.Scanner;
public class SF3{
	public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			int A = input.nextInt();//什么类型next后面就接什么 注意大小写
			System.out.print("请输入数字B:");
			int B = input.nextInt();//什么类型next后面就接什么 注意大小写
			System.out.print("较大者为：");
			if(A>B)System.out.println(A);
			else System.out.println(B);	
			input.close();
	}
}