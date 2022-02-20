// Java program to Demonstrate the HashMap() constructor
 
// Importing bsiic required classes
import java.io.*;
import java.util.*;
 
// Main class
// To add elements to HashMap
class HashMapExmp 
{
 
    // Main driver method
    public static void main(String args[])
    {
        // No need to mention the
        // Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>(2);
 
        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2= new HashMap<Integer, String>(3, 0.5f);
 
        // Adding elements using put method
        // Custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
 
        hm2.put(4, "four");
        hm2.put(5, "Nithin");
        hm2.put(6, "six");

        HashMap<Integer, String> hm3= new HashMap<Integer, String>(hm2);
 
        // Print and display mapping of HashMap 1
        System.out.println("Mappings of HashMap hm1 are : "+ hm1);
 
        // Print and display mapping of HashMap 2
        System.out.println("Mapping of HashMap hm2 are : "+ hm2);

        System.out.println("Mapping of HashMap hm3 are : "+ hm3);

        hm2.put(5, "Five");
        hm2.put(7, "Seven");

        System.out.println("Mapping of HashMap hm2 are : "+ hm2);

        hm2.remove(7);

        for (Map.Entry<Integer, String> e : hm2.entrySet())

            System.out.println("Key: " + e.getKey()+ " Value: " + e.getValue());


    }
}