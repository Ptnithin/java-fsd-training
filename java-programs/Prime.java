//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
import java.util.*;

class Prime
	{
		
		public static void main(String[] args)
			{
				System.out.println("Enter a +ve integer");
				Scanner s=new Scanner(System.in);
				int a=s.nextInt();

				boolean flag=false;
				for(int i=2;i<a/2;i++)
				{
					if(a%i==0)
					{
						flag= true;
					}
				}

				if(!flag)
					{
						System.out.println(a+" is a prime number");
					}
				else
					{
						System.out.println(a+" is not a prime number");
					}

			}
	}	

