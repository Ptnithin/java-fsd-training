import java.io.*;
import java.util.*;


class MyException extends Exception
	{
		MyException(String s)
			{
				super(s);
			}
	}

class UserDefined
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
							throw new MyException(i+" is less than "+j);
						}

						else
						{
							System.out.println(i-j);
						}
					}

				catch(MyException e)
					{
						System.out.println(e);
					}

			

			
			}
	}
	