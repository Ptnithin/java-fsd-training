import java.io.*;
class OverLoading2

{
	static void mul(int x,int y)
		{
			System.out.println(x*y);
		}
	 static void mul(double x,float y)
		{
			System.out.println(x*y);
		}
	 static void mul(double x,int y)
		{
			System.out.println(x*y);
		}
	 static void mul(double x,double y)
		{
			System.out.println(x*y);
		}

	public static void main (String[] args)
		{
			mul(1,2);
			mul(1.589,7.1);
			mul(5.3698,2);
			mul(8.2547,6.2587);
		}
			
}