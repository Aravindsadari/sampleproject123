package sortings;
import java.util.*;
public class selectionSort 
{
	static void selectSort(int[] a)
	{
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	static void bubbleSort(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<=i+1;j++)
			{
				if(a[i]>=a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	static void insertSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=i-1;j<i;j++)
			{
				if(a[i]<=a[j])
				{
					a[j]=a[i];
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		selectionSort obj=new selectionSort();
		int a[]=new int[] {5,13,20,8,2,1,4,9};
		int b[]=new int[] {1,2,3,4,5,6,7,8};
		obj.selectSort(a);
		obj.bubbleSort(a);
		obj.insertSort(a);
		obj.selectSort(b);
		obj.bubbleSort(b);
		obj.insertSort(b);
	}
}
