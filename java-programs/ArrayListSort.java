import java.util.*;

class ArrayListSort

	{
		public static void main(String[] args)

			{
				ArrayList<Double> dblnum=new ArrayList<Double>();
				dblnum.add(10.36);
				dblnum.add(63.58);
				dblnum.add(88.36);
				dblnum.add(71.36);
				System.out.println("Before Sorting: "+dblnum);
				
				
				
				Collections.sort(dblnum);
				Collections.reverse(dblnum);

				System.out.println("After Sorting: "+dblnum);


					
			}

	}