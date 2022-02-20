import java.util.*;

class ArrayListSum

	{
		public static void main(String[] args)

			{
				ArrayList<Integer> num=new ArrayList<Integer>();
				num.add(10);
				num.add(63);
				num.add(88);
				num.add(71);
				System.out.println(num);

				int sum=0;

				for(Integer nmbr:num)

						{
							sum+=nmbr;
						}


				System.out.println("Sum= "+sum);
				System.out.println("Average="+ sum/num.size());


					
			}

	}