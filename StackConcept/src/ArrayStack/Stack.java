package ArrayStack;

public class Stack {
	
	int arr[]=new int[5];
	int top=-1;
	
	void push(int data) 
	{
		if(top==arr.length-1)
			System.out.println("OverFlow");
		else
			arr[++top]=data;
	}
	
	int pop() 
	{
		if(top==-1) 
		{
			System.out.println("UnderFlow");
			return 0;
		}
		else 
		{
			int x = arr[top--];
			return x;
		}	
	}
	
	int peek()
    {
		if(top==-1)
			System.out.println("Stack is Empty");
		int x = arr[top];
        return x;    
    }
	
	boolean isEmpty() 
	{
		return (top==-1);
	}
	
	void show() 
	{
		for(int n : arr) 
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
