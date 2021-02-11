package oopsConcept;

public class CallbyValueCallbyRef {
	
	int x,y;

	public static void main(String[] args) {

		CallbyValueCallbyRef obj1=new CallbyValueCallbyRef();
		int p=10;
		int q=20;
		obj1.textSum(p, q);  //Passing the value
		
		obj1.x=50;
		obj1.y=60;
		obj1.swap(obj1);    //Passing the reference
		
		
		//After Swapping
		System.out.println("x --> "+obj1.x+"  y --> "+obj1.y);

	}
	
	public int textSum(int a,int b)                   //  Call by value
	{
		System.out.println(a+b);
		a=100;
		b=200;
		System.out.println(a+b);
		return 1;
		
	}
	public void swap(CallbyValueCallbyRef obj2)     //  Call by Reference
	{
		int temp;
		temp=obj2.x;
		obj2.x=obj2.y;
		obj2.y=temp;
		
	}
	
	

}
