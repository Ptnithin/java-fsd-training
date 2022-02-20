 /*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user

Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
 import java.util.*;

 class Attendence
 	{
 		public static void main(String[] args)
 			{
 				double per;
 				Scanner s=new Scanner(System.in);
 				System.out.println("Enter the Number of classes held:");
 				double clshld=s.nextInt();
 				System.out.println("Enter the number of classes attended");
 				int clsatd=s.nextInt();
 				per=(clsatd/clshld)*100;
 				System.out.println("Persentage of class Attended="+per);

 				if(per>75)
 				{
 					System.out.println("Student is permitted to appear for the exam");
 				}
 				else
 				{
 					System.out.println("Student is not permitted to appear for the exam");
 				}

 			}
 	}