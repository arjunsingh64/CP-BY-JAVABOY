import java.util.*;
import java.util.Scanner;
import java.util.Collections;
public class swapArrayCount
{
	public static int minSwap(int [] arr,int n)
	{
		int [] dupli = new int[n];
		for(int i=0;i<n;++i)
		{
			dupli[i] = arr[i];
		}
		Arrays.sort(dupli);

		int i=0;
		int cnt = 0;
		while(i<n)
		{		
			if(arr[i] != dupli[i])
			{
				swap(arr,i,search(dupli,arr[i]));
				++cnt;
			}
			
			if(arr[i]==dupli[i])
			{
				++i;
			}
		}
		return cnt;
	}
	
	public static int search(int [] dupArr,int target)
	{
		int index =  Arrays.binarySearch(dupArr,target);			// return index of target element
		return index;
	}
	
	public static void swap(int [] arr,int indexArr,int realIndex)
	{
		int temp = arr[indexArr];
		arr[indexArr] = arr[realIndex];
		arr[realIndex] = temp; 
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int i=0;i<size;++i)
			{
				arr[i] = sc.nextInt();
			}
			int result = swap.minSwap(arr,size);
			System.out.println(result);			
		}	
	}
}