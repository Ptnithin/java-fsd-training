class SumOp
{
	int sum(int a,int b)
	{
		System.out.println("Parent class Sum");
		return a+b;
	}
}

class SumOne extends SumOp
{
	int sum(int a,int b)
	{
		System.out.println("Child class Sum");
		return a+b;
	}
}

class MulOp
{
	int mul(int a,int b)
	{
		System.out.println("Parent class product");
		return a*b;
	}
}

class MulOne extends MulOp
{
	int mul(int a,int b)
	{
		System.out.println("Child class product");
		return a*b;
	}
}
class MethodOverride2
{
	public static void main(String[] args)
	{
		SumOp s=new SumOne();
		System.out.println(s.sum(2,8));
		MulOp m=new MulOne();
		System.out.println(m.mul(2,8));
	}
}
		