package ArrayListStack;

public class ArrayListImplementStack {

	public static void main(String[] args) {
		
		MyStack s=new MyStack();
	    s.push(5);
	    s.push(10);
	    s.push(20);
	    System.out.println(s.pop());
	    System.out.println(s.size());
	    System.out.println(s.peek());
	    System.out.println(s.isEmpty());

	}

}
