/*Create two arraylist of strings to take First_name and Last_name of the students,
and print their whole name.*/
import java.util.*;

class ArrayListName

	{
		public static void main(String[] args)

			{
				ArrayList<String> firstname=new ArrayList<String>();
				firstname.add("Nithin");
				firstname.add("Abin");
				firstname.add("Jerom");
				firstname.add("Pranav");
				System.out.println(firstname);
				
				ArrayList<String> lastname=new ArrayList<String>();
				lastname.add("Varghese");
				lastname.add("KP");
				lastname.add("Jaison");
				lastname.add("P");
				System.out.println(lastname);

				ArrayList<String> fullname=new ArrayList<String>();

				for(int i=0;i<firstname.size(); i++)
						{
							fullname.add(firstname.get(i)+" "+lastname.get(i));
  
						}

				System.out.println("Full name:");
  				System.out.println();

  				for(String i:fullname)
  					{
  						System.out.println(i);
  					}				

					
			}

	}
	