package oopsConcept;

public class StaticNonStatic {
	
	//Global Variable
	
	static int age=10;             // static var
	String name="Arjit";           // non-static var.

	public static void main(String[] args) {
		
		//How we can call Static method.
		
		Static_method();                       // 1. we can call by simple writing method name.
		StaticNonStatic.Static_method();       // 2. we can also call by classname .
		
		//How to access the static var.
		
		System.out.println(age);                            // 1.we can access the static global var directly inside the main() by variable name
		System.out.println(StaticNonStatic.age);            // 2. we can access the static global var directly inside the main() by classname
		// System.out.println(StaticNonStatic.name); 		//This is not allow
		// System.out.println(name);                   		// This is also not allow
		
		
		//Non-static variable can't be access directly inside the static method
 
		
		//How we can call Non-Static method and var.
		
		StaticNonStatic obj=new StaticNonStatic();         //1. by creating the obj of classname
		obj.NonStatic();								   // 2. now using the reference var i.e (obj-->reference var) we can call Non-Static var. 
		System.out.println(obj.name);                      //  3. we can access the static-var by using the reference var i.e (obj-->reference var).
		
		
		//can we call Static method by object reference var??? YES
		
		obj.Static_method();                       // BUT ITS NOT GOOD PRACTISE.
		System.out.println(obj.age);			   //   4. we can access the static var by using  the reference var i.e (obj-->reference var) also.

	}
	
	public void NonStatic()   // Non-Static method
	{
		System.out.println("******Non-Static*********");
		System.out.println(name + " " + age);         //we access static or non static global var inside the non-static method.
	}

	public static void Static_method()   // Static method
	{
		System.out.println("**********Static*************");
		// System.out.println(name + " " + age);     NOT ALLOW NON_STATIC GLOBAL VAR
		System.out.println("*****"+age+"******");
	}

}
