/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount. Note- create a method EmployeeBonus to calculate the bonus and return it.
*/

import java.util.*;

class SalaryBonus
	{

		static double empbonus(double salary,int exp)

			{
				double netbonus;

				if(exp>5)
					{
						netbonus=salary*0.05;
					}
				else
					{
						netbonus=0.0;
					}
				return netbonus;
			}
	

		public static void main(String[] args)

			{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter your current salary");
				double salary=s.nextDouble();
				System.out.println("Number of years of Experience");
				int exp=s.nextInt();
				double bonus=empbonus(salary,exp);

				System.out.println("The net bonus="+bonus);
				System.out.println("The net Salary="+ (salary+bonus));
			}
	}