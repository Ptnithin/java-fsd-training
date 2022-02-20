class Car
{
	void industry()
	{
		System.out.println("Automotive");
	}
}
class MaruthiSuzuki extends Car
{	
	void country()
	{	
		System.out.println("Indian Brand");
	}
}	
class Alto extends MaruthiSuzuki
{
	void segment()
	{
		System.out.println("800CC Segment");
	}
}


class MultiLevel
{
	public static void main(String[] args)
		{
			Alto a= new Alto();
			a.industry();
			a.country();
			a.segment();
		}

}