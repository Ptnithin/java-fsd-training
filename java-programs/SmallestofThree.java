//Write a program to use a Ternary operator and find the smallest of three numbers.
public class SmallestofThree

	{
		public static void main(String[] args)

			{
				int a=59;
				int b=94;
				int c=69;
				int sml=(a < b) ? (a < c ? a : c) : (b < c ? b : c);
				System.out.println("Smallest="+sml);
			}
	}