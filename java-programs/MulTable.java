//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number
import java.util.*;

class MulTable
	{
		public static void main(String[] args)
			{
				System.out.println("Enter a Number");
				Scanner s=new Scanner(System.in);
				int a=s.nextInt();

				for(int i=1;i<=10;i++)
				{
					int p=a*i;
					System.out.println(a+"*"+i+"="+p);
				}
			}
	}