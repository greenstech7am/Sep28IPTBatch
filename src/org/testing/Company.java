package org.testing;

public class Company {
	
	//1. Declare your object global
	public static Company c;
	
	//2. Create a constructor
	private Company() {
		
	}
	
	//3. Create a method for Object Creation
	public static Company createObject() {
		
		if (c==null) {			 
			 c = new Company();
		}	
		return c;
	}
	
	//4.Create all methods you want
	
	public void compId() {
		System.out.println("123");

	}
	public void compName() {
		System.out.println("Samsung");

	}
	
	
	public static void main(String[] args) {
		
		Company c1 = createObject();
		c1.compId();
		c1.compName();
		System.out.println(System.identityHashCode(c1));
		
		Company c2 = createObject();
		System.out.println(System.identityHashCode(c2));
		
	
		
		
		
	}
	
	
	
	
	
	

}
