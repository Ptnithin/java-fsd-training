//Write a java program to evaluate two statements each using Logical OR and Logical And operator.

public class LogicalOp
{
	public static void main(String[] args)
	{
		String UID ="211451";
		String PSD = "Password@123";

		if (UID == "211451" && PSD == "Password@123") 
		{
			System.out.println("Access Granted");
		}

		else
		{
			System.out.println("Access Denied");
		}

		int score=75;
		boolean isSunny= false; 

		if (score>80 || isSunny) 

			{
				System.out.println("You can play outside"); 
			}

		else 

			{
				System.out.println("You can't play outside");
			}
	}
}