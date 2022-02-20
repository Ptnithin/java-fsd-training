import java.util.*;
import java.io.*;

class OutofBound
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string");
				String str=sc.nextLine();
				System.out.println("Length of the string is:"+str.length());

				try
					{
						char a=str.charAt(30);
						System.out.println("Character at Index 30 is:"+a);
					}
				catch (StringIndexOutOfBoundsException e)
					{
						System.out.println("StringIndexOutOfBoundsException");
					}

				

			}
	}