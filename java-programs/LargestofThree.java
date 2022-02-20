//Write a program to use a Ternary operator and find the greatest of three numbers.
public class LargestofThree

	{
		public static void main(String[] args)

			{
				int a=84;
				int b=26;
				int c=55;
				int lar=(a > b) ? (a > c ? a : c) : (b > c ? b : c);
				System.out.println("largest="+lar);
			}
	}