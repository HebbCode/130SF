//水仙花数
//19点23分 卡住了，看番去，明天再说
public class SF9 {
	public static void main(String[] args)
	{
		int i=153,a,b,c;
		//for(i=100;i<1000;i++)
		{
			a=i/100;
			b=i/10%10;
			c=i%10;
			if(Math.pow(a,3) * Math.pow(b,3) * Math.pow(c,3) == (double)i)System.out.print(i);
		}
		//System.out.print(Math.pow(1, 5));
	}
}
