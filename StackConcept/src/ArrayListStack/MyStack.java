package ArrayListStack;

import java.util.ArrayList;

public class MyStack {
	
	ArrayList<Integer> al = new ArrayList<>();
	
	void push(int x) 
	{
		al.add(x);
	}
	
	int pop()
	{
        int res=al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    
    int peek()
    {
        return al.get(al.size()-1);
    }
    
    int size()
    {
        return al.size();
    }
    
    boolean isEmpty()
    {
        return al.isEmpty();
    }

}
