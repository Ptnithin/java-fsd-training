 /*Create an arraylist of user-defined data type Book. it should have:-
i)Name of the Book
ii)Author of the book
iii)year of publication of the book
iV)numer of copies sold.
sort the array list based on the year of publication.*/
import java.util.*;
 class Lib
 {  
	 public static void main(String[] args)
	 {  
		  //Creating user-defined class objects  
		  Book b1=new Book("abcdefgh","sam",2010,5000);  
		  Book b2=new Book("lkjhgfda","sid",2015,6900);  
		  Book b3=new Book("qwertuyu","Abin",2019,4000);  
		  //creating arraylist  
		  ArrayList<Book> lib=new ArrayList<Book>();  
		  lib.add(b1);//adding Student class object  
		  lib.add(b2);  
		  lib.add(b3);  
		  //Getting Iterator  
		  Iterator itr=lib.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext())
		  {  
		    Book bk=(Book)itr.next();  
		    System.out.println(bk.bookname+" "+bk.authorname+" "+bk.year+" "+bk.copies);  
		  }  
		  Collections
	 }  
 } 
 

class Book{  
  String bookname;  
  String authorname;  
  int year;
  int copies;  
  Book(String bookname,String authorname,int year,int copies)
  {  
   this.bookname=bookname;  
   this.authorname=authorname;  
   this.year=year;
   this.copies=copies;  
  }  
}