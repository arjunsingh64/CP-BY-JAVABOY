import java.util.Scanner;
import java.util.Collections;
public class subArrayMaxSum
{
	public static void main(String [] args)
	{
		Scanner sc =  new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int i=0;i<size;++i)
			arr[i]=sc.nextInt();
		
			int maxOfArr = Integer.MIN_VALUE;
			int checkSum = 0;
		
			for(int i=0;i<size;++i)
			{
				checkSum = checkSum + arr[i];
				if(maxOfArr<checkSum)
				{
					maxOfArr = checkSum;
				}
				if(checkSum < 0)
				{
					checkSum = 0;
				}
			}
			System.out.println(maxOfArr);
		}
	}
}