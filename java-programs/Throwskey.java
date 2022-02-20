//Write a program to implement throws keyword.

import java.util.*;
public class Throwskey
{

  static void checkper(double per) throws ArithmeticException 
      {
        if (per < 55) 

          {
              throw new ArithmeticException("not eligible for higher studyes");
          }

        else 

          {
              System.out.println("eligible for higher studyes");
          }
      }

  public static void main(String[] args) 

    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your Mark Percentage");
      double mrk=sc.nextDouble();
      checkper(mrk); 

    }
}