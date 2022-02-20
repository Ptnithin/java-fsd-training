//Write a Program to implement Throw Keyword and handel the exceptions.
import java.io.*;
import java.util.*;


class Throwkey
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the first number");
				int i=sc.nextInt();
				System.out.println("Enter the second number");
				int j=sc.nextInt();

				try
					{
						if(i<j)
						{
							throw new Exception();
						}

						else
						{
							System.out.println(i-j);
						}
					}

				catch(Exception e)
					{
						System.out.println("Error");
					}

			

			
			}
	}