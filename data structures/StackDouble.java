import java.util.Stack;
class StackDouble
{

	public static void main(String[] args)   
		{  
			//creating an instance of Stack class  
			Stack<Double> stk= new Stack<>();  
			// checking stack is empty or not  
			boolean result = stk.empty();  
			System.out.println("Is the stack empty? " + result);  
			// pushing elements into stack  
			stk.push(87.00);  
			stk.push(16.25);  
			stk.push(85.31);  
			stk.push(58.36);  
			//prints elements of the stack  
			System.out.println("Elements in Stack: " + stk);  
			//stk.pop();
			System.out.println("The last element is "+stk.peek());
			System.out.println("The position of 16.25 in the stack is: "+stk.search(16.25));
		}
}