/*Write a program to input an array of integers according to the user , and also take a input of a 
particular integer and find out the occurence of the intger in the array.*/
import java.util.*;
import java.io.*;

class ArrayOccurance

	{
		public static void main(String[] args)

		{

			System.out.println("Enter the size of the array");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();

			int[] arr=new int[n];
			System.out.println("Enter the integer elements of the Array");

			for(int i=0;i<n;i++)
				
					{
						arr[i]=sc.nextInt();
					}

			System.out.println("The Array Elements are:");

			for(int i=0;i<n;i++)
				
					{
						System.out.print(arr[i]+",");
					}
			System.out.println(" ");
			System.out.println("Enter the element whose count you want to know");
        	int num=sc.nextInt();
        	int occ=0;
        

        	for(int i=0;i<n;i++)
        		{
            		if(num==arr[i])
            			{
                			occ++; 
            			}
        		}		
        
        System.out.println(num+" occurred "+occ+" times ");

		}

	}