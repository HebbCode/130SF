//100以内所有素数之和
//import java.util.Scanner;
public class SF5 {
	public static void main(String[] args)
	{
		int i,j,ssh;
		boolean flag;//若要以变量flag为判断的标志，则需要变为布尔型变量
		for(i=2,ssh=0;i<100;i++)
		{
			for(j=2,flag=true;j*j<=i;j++)
			{
				if(i%j==0) {flag=false;break;}
			}
			if(flag)ssh+=i;
		}
		System.out.print("素数和为"+ssh);
	}
}
