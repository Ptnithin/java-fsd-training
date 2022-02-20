//Write a Program to implement Finally block along with try and catch block.
import java.util.*;
import java.io.*;

class FinallyBlock
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string");
				String str=sc.nextLine();
				

				try
					{
						char a=str.charAt(30);
						System.out.println("Character at Index 30 is:"+a);
					}
				catch (StringIndexOutOfBoundsException e)
					{
						System.out.println("StringIndexOutOfBoundsException");
					}
				finally
					{
						System.out.println("Length of the string is:"+str.length());
					}

				

			}
	}