import java.io.*;
import java.util.*;

class HashTableExmp
{
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		Hashtable<Double, Character> ht1 = new Hashtable<>(4);

		// Initialization of a Hashtable
		// using Generics
		Hashtable<Character,Integer> ht2= new Hashtable<Character,Integer>(3, 0.5f);

		// Inserting the Elements
		// using put() method
		ht1.put(0.1, 'G');
		ht1.put(0.2, 'F');
		ht1.put(0.3, 'G');

		ht2.put('E',1);
		ht2.put('F',2);
		ht2.put('G',3);

		Map<Double,String> hm1=new HashMap<>();

		hm1.put(1.0,"Nithin");
		hm1.put(2.0,"Abin");
		hm1.put(3.0, "Sidharth");
		hm1.put(4.0, "Jagan");

		Hashtable<Double,String> ht3= new Hashtable<Double,String>(hm1);
		
		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
		System.out.println("Mappings of ht2 : " + ht2);
		System.out.println("Mappings of ht3 : " + ht3);

		System.out.println("Size of map ht3 is:  " + ht3.size());


		if (ht3.containsKey(1.0)) 
		{
            String a = ht3.get(1.0);
            System.out.println("value for key"+ " \"1.0\" is:- " + a);
        }

        ht3.put(3.0, "Dennis");

        ht3.remove(4.0);

        for (Map.Entry<Double,String> e : ht3.entrySet())
        {
            System.out.println(e.getKey() + " "+ e.getValue());
        }



	}
}
