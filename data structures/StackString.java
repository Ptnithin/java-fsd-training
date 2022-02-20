import java.util.Stack;
class StackString
{

	public static void main(String[] args)   
		{  
			//creating an instance of Stack class  
			Stack<String> stk= new Stack<>();  
			// checking stack is empty or not  
			boolean result = stk.empty();  
			System.out.println("Is the stack empty? " + result);  
			// pushing elements into stack  
			stk.push("Nithin");  
			stk.push("Abin");  
			stk.push("Sid");  
			stk.push("Melvin");  
			//prints elements of the stack  
			System.out.println("Elements in Stack: " + stk);  
			stk.pop();
			//stk.pop();
			System.out.println("The last element is "+stk.peek());
			System.out.println("The position of Nithin in the stack is: "+stk.search("Nithin"));
		}
}