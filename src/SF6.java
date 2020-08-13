//求2000-3000之间的闰年
public class SF6 {
	public static void main(String[] args)
	{
		int year = 2000,c=1;
		while(year <= 3000)
		{
			if(year % 100 != 0 && year % 4 == 0 || year % 400 ==0)
			{
				System.out.print(year);
				System.out.print('\t');
				if(c % 9 == 0)System.out.print('\n');
				c++;
			}
			year++;
		}
		System.out.print("如上所示"+"共有"+c+"个闰年");
	}
}
