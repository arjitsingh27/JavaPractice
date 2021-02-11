package ArrayStack;

public class StackImplementArray {

	public static void main(String[] args) {
		
		Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        s.pop();
        
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(150);
        s.push(160);
        s.show();
        System.out.println(s.peek() + " Top Value");
        System.out.println(s.isEmpty());
	}

}
