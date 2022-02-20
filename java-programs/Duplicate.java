import java.util.*;
import java.io.*;

class Duplicate

	{
		public static void main(String[] args)

		{

		System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int[] arr=new int[n];
		System.out.println("enter the integer elements of the Array");

		for(int i=0;i<n;i++)
				
				{
					arr[i]=sc.nextInt();
				}

		System.out.println("the Array Elements are:");

		for(int i=0;i<n;i++)
				
				{
					System.out.print(arr[i]+",");
				}
		System.out.println(" ");
		System.out.println("The Duplicate elements are:");
		
		
		for(int i=0;i<n;i++)
				{
					for(int j=i+1;j<n;j++)
					{
						if(arr[i]==arr[j] )
						{
							
							arr=deleteElements(arr,j);

						}
					}

				}
		}



	}
