//求两数的最大公约数
import java.util.Scanner;
public class SF7 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int m,n,r;
		System.out.print("请输入两个数，以空格隔开：");
		m = input.nextInt();
		n = input.nextInt();
		if(m < n){r = m;m = n;n = r;}//设定m为较大数
		r=m % n;
		while(r != 0)// 辗转相除法
		{
			m = n;
			n = r;
			r = m % n;
		}
		System.out.print("两个数的最大公约数为："+n);
		input.close();
	}
}