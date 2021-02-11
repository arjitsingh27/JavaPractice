package ConstructorConcept;

class Constructor {
	
	//constructor is not a method or function
	
	//its not important to create default constructor  bcz default constructor is already present but its hidden
	
	//we can overload a constructor by passing a different parameter
	
	public Constructor()   
	{
		System.out.println("default constructor");
	}
	
	public Constructor(int a,int b)   
	{
		System.out.println(a+b);
	}
	
	public Constructor(String x, String y)   
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(10,12);
		Constructor c3=new Constructor("Arjit","Singh");
		
		
	}

}
