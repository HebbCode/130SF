//求100以内的偶数之和 Part1
public class SF1 {
		public static void main(String[] args) {
			int i=1,sum=0;
			while(i<100)
			{
				if(i%2==0)sum+=i;
				i++;
			}
			System.out.println(sum);
		}
}
