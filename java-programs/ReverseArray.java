/*Write a program to input a String array and display it, and now to copy the elements into
another array in the reverse order and print the reverse_array elements.*/

import java.util.*;
import java.io.*;

class ReverseArray

	{
		public static void main(String[] args)

		{

			System.out.println("Enter the size of the array");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();

			String[] arr=new String[n];
			System.out.println("Enter the string elements of the Array");

			for(int i=0;i<n;i++)
				
					{
						arr[i]=sc.next();
					}

			System.out.println("The Array Elements are:");

			for(int i=0;i<n;i++)
				
					{
						System.out.print(arr[i]+" ");
					}
			System.out.println(" ");

			String[] revarr=new String[n];

			for(int i=0;i<n;i++)
			{
				revarr[i]=arr[n-i-1];
			}
					

			for(int i=0;i<n;i++)
				
					{
						System.out.print(revarr[i]+" ");
					}

			
			System.out.println(" ");

		}

	}