import java.util.*;
public class Present 
{
	

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.next();
		System.out.println("Enter the no.of characters: ");
		int len = sc.nextInt();
		
		char[] array1 = new char[len];
		System.out.println("Enter the characters: ");
		for(int i=0;i<len;i++)
		{
			array1[i] = sc.next().charAt(0);
		}
		
		for(int i=0;i<array1.length;i++)
		{
			int result=s1.indexOf(array1[i]);
			if (result!=-1)
			{
				System.out.println(array1[i] +"  is present and its a substring  ");
			}
	
			else
			{
				System.out.println(array1[i]+"  is NOT a substring  ");	
			}
		}

	}
	

}
