/*Write a program to take take two strings as an input from the user and check
if the second one is a substring of the first.*/
import java.util.*;
import java.io.*;

class SubString
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1=sc.nextLine();
		System.out.println("Enter the Second String");
		String s2=sc.nextLine();
		if(s1.contains(s2))
		{
			System.out.println(s2+" is a Substring of "+s1);
		}
		else
		{
			System.out.println(s2+" is not a Substring of "+s1);
		}
	}
}