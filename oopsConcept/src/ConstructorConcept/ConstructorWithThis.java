package ConstructorConcept;

public class ConstructorWithThis {
	
	//class var or global var
	int age;
	String name;
	
	public ConstructorWithThis(String name,int age) 
	{
		this.name=name;
		this.age=age;
		
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) {
		ConstructorWithThis obj=new ConstructorWithThis("Arjit",19);

	}

}
