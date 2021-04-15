import java.util.*;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class maxSubArray
{

	 static int largest(int [] arr)
	 {
	        int i;
         	int max = arr[0];
         	for (i = 1; i < arr.length; i++)
         	if (arr[i] > max)
                 max = arr[i];
                 
                 return max;
         }

	public static void main(String [] args)
	{
		Scanner sc =  new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();
		int [] a = new int[size];
		for(int i=0;i<size;++i)
		a[i]=sc.nextInt();
		
		for(int i=0;i<size;++i)
		{
			if(i+k<=size)
			{
				int [] subArr = Arrays.copyOfRange(a,i,i+k);
				int max = largest(subArr);
				System.out.println(max);	
			}else
			{
				continue;
			}
			 
		}
		
		
	}
}