//Write a program to input an array of integers according to the users, and find the greatest value of them.
import java.util.*;
import java.io.*;

class GratestElement

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
		
			int max=arr[0];
		

			for(int i=0;i<n;i++)
					{
						if(arr[i]>max)
							{
								max=arr[i];
							}
					}
			System.out.println("The Gratest element is:"+max);
		}



	}