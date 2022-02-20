
import java.util.*;


class QueueExmp2
{
	public static void main(String[] args)
	{
		Queue<Double> q= new LinkedList<>();

		System.out.println(q.isEmpty()); //isEmpty()

		q.add(36.45);
		q.add(58.34);
		q.add(69.21);
		q.add(78.45);
		q.add(62.12);
		System.out.println("Elements of queue "+ q);

		Double removedele = q.remove();	//remove()
        System.out.println("removed element is: "+ removedele);
        System.out.println(q);

        Double head = q.peek();	//peek()
        System.out.println("head of q is :"+head);

        int size = q.size();	//size()
        System.out.println("Size of queue :" + size);

        System.out.println(q.contains(69.21));	//contains()

        ArrayList<Double> arraylist = new ArrayList<Double>();
        arraylist.add(99.25);
        arraylist.add(10.5);
        arraylist.add(5.55);
        
        q.addAll(arraylist);	 //addAll

        System.out.println("Elements of queue "+ q);

        q.clear();	//clear()
		System.out.println("Elements of queue "+ q);
  


	}
}