package dataStruture.stack.implementation;
import java.util.*;

public class MinStack {
	
	int curMin;
	Stack<Pair> st;
	public MinStack() {
		this.st = new Stack<Pair>();
	}
	
	public int getStackSize() {
		return st.size();
	}
	
	public Boolean isEmpty() {
		return st.empty();
	}
	
	public int getMin()
	{
		if(this.isEmpty()) return -1;
		
		return this.st.peek().min;
	}
	
	public int top() {
		if(!st.isEmpty())
			return this.st.peek().value;
		return -1;
    }
    
	
	public void push(int value)
	{
		if(this.isEmpty() || st.peek().min>value)
		{
			this.st.push(new Pair(value, value));
		}else
		{
			this.st.push(new Pair(value, st.peek().min));
		}
	}
	
	public void pop()
	{
		
		if(this.st.isEmpty()) return;
		this.st.pop();
	}

}
