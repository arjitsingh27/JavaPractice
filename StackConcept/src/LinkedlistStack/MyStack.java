package LinkedlistStack;

public class MyStack {
	
	Node head;
	int sz;
	
	
	void push(int x)
	{
		
        Node temp=new Node();
        temp.data=x;
        temp.next=head;
        head=temp;
        sz++;
    }
    
    int pop()
    {
        if(head==null)
        {
        	return Integer.MAX_VALUE;
        }
        int res=head.data;
//        Node temp=head;
        head=head.next;
        sz--;
        return res;
    }
    
    int peek()
    {
        if(head==null)
        {
        	return Integer.MAX_VALUE;
        }
        return head.data;
    }
    
    int size()
    {
        return sz;
    }
    
    boolean isEmpty()
    {
        return head==null;
    }

}
