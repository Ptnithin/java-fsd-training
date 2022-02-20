/*5. Write a program to input the following details:
i)Employee Name
ii)Employee Salary
iii)Employee Year of joining

Calculate the Loyalty bonus of the Employee's by
a)if the year of their joining is on or before than 2017,and their Salary is more than 30000/-,
then the bonus will be 22% of the salary.
b)if the year of their joining is on or before than 2017,and their Salary is less than 30000/-,
then the bonus will be 33% of the salary.
c)if the year of their joining is on or before than 2012,
then the bonus will be 40% of the salary.
d)if the year of their joining is after 2017,and their Salary is less than 30000/-,
then the bonus will be 15% of the salary.
e)if the year of their joining is after 2017,and their Salary is more than 30000/-,
then the bonus will be 10% of the salary.*/

import java.util.*;
class Employee
	{
				public static void main(String[] args)

					{
						System.out.println("Enter the Number of Employes");
						Scanner sc=new Scanner(System.in);
						int n=sc.nextInt();
						//System.out.println("Enter the Name, Salary and Year of Joinig of the Employee");
						String[] name=new String[n];
						int[] salary=new int[n];
						int[] year=new int[n];
						double[] netbonus=new double[n];
						double[] netsalary=new double[n];
						for(int i=0;i<n;i++)
							{
								System.out.println("Enter the Name:");
								name[i]=sc.next();
								System.out.println("Enter Your Current Salary:");
								salary[i]=sc.nextInt();
								System.out.println("Enter Your Year of Joining");
								year[i]=sc.nextInt();
								System.out.println("");
								
							}

						for(int i=0;i<n;i++)
							{
								if(year[i]<=2012)
									{
										netbonus[i]=salary[i]*0.40;
										netsalary[i]=salary[i]+netbonus[i];

									}

								else if(year[i]<=2017 || salary[i]>30000)
									{
										netbonus[i]=salary[i]*0.22;
										netsalary[i]=salary[i]+netbonus[i];

									}
								else if(year[i]<=2017 || salary[i]<30000)
									{
										netbonus[i]=salary[i]*0.33;
										netsalary[i]=salary[i]+netbonus[i];

									}
								
								else if(year[i]>=2017 || salary[i]<30000)
									{
										netbonus[i]=salary[i]*0.15;
										netsalary[i]=salary[i]+netbonus[i];

									}
								else if(year[i]>=2017 || salary[i]>30000)
									{
										netbonus[i]=salary[i]*0.10;
										netsalary[i]=salary[i]+netbonus[i];

									}
								
							}

						for(int i=0;i<n;i++)
							{
								System.out.println("Name: "+name[i]);
								System.out.println("Current Sallary: "+salary[i]);
								System.out.println("Year of Joining: "+year[i]);
								System.out.println("Loyalaty Bonus: "+netbonus[i]);
								System.out.println("New Salary: "+netsalary[i]);
								System.out.println("");
							}
					}	

	}