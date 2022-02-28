//program which identifies all such positive integers between M and N (inclusive of both), such that the number is perfectly divisible by all of its digits. 

import java.io.*;

//this class contains three functions checkDivisible(), checkNumber(), passNumber()  
class PerfectDivisible
//this method will pass respective number and it's digits to the function checkDivisible()
	//it passes the next digit only if the number is divisible by the present passed digit 
	//this method accepts one parameter 'num' which is the number whose perfect divisibility is to be checked
	//this method returns '0' if the number is not divisible by any of it's digits
	//this method returns '1' if and only if the number is divisible by all of it's digits
	public int checkNumber(int num)
	{
		int temp=num;
		while(temp>0)
		{
			int digit=temp%10; 
			if(checkDivisible(num,digit)==0)
				return 0;
            		else
                		temp=temp/10;
       		 }
		 return 1;
	}
//this method will pass each number within the given range
//main class
class PerfectlyDivisible
{
	//main method
	//this method accepts two command line arguments 'm' and 'n'
	//this method also checks which of the command line arguments is smaller, and passes the smaller value first 
	public static void main(String args[])throws IOException
	{
		//this try block throws an error when the given command line arguments are not INTEGERS
		try 
		{
			int m=Integer.parseInt(args[0]);
			int n=Integer.parseInt(args[1]);
			
			//creating an object of the class PerfectDivisible
			PerfectDivisible pd=new PerfectDivisible();
			if(m<n)
				pd.passNumber(m,n);
			else
				pd.passNumber(n,m);
		}
		//this catch block prints the error report
		catch(NumberFormatException e)
		{
			System.out.println("NOT A VALID INTEGER INPUT");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("PLEASE GIVE COMMAND LINE ARGUMENTS");
		}
	}
}

//end of program