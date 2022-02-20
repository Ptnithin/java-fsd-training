class Product

{
	static int mul(int x,int y)
		{
			return x*y;
		}
	static int mul(int x,int y,int z)
		{
			return x*y*z;
		}
	static int mul(int x,int y,int z,int a)
		{
			return x*y*z*a;
		}
	static int mul(int x,int y,int z,int a,int b)
		{
			return x*y*z*a*b;
		}
}

class OverLoading1
{
	public static void main (String[] args)
		{
			System.out.println(Product.mul(1,2));
			System.out.println(Product.mul(1,2,3));
			System.out.println(Product.mul(1,2,3,4));
			System.out.println(Product.mul(1,2,3,4,5));
		}
}