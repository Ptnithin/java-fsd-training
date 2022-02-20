//Write a java program to implement an abstract class with two abstract methods and one non-abstract method
abstract class Google
{
	abstract void search();
	abstract void result();

	void message()
	{
		System.out.println("Thankyou for using Google");
	}
}

class SearchAll extends Google
{
	void search()
	{
		System.out.println("Searching for all results");
	}

	void result()
	{
		System.out.println("Displaying all  search results");
	}
}

class SearchImage extends Google
{
	void search()
	{
		System.out.println("Searching for Images");
	}

	void result()
	{
		System.out.println("Displaying the Images");
	}
}

class AbstractClassSample
{
	public static void main(String[] args)
	{
		Google g=new SearchAll();
		g.message();
		g.search();
		g.result();

		Google g1=new SearchImage();
		g1.message();
		g1.search();
		g1.result();
	}
	
}