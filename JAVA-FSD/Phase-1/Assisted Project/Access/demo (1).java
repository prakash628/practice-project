package Access1;

import Access.AccessMod;

public class demo {
	public static void main(String[] args) {
		AccessMod obj3 = new AccessMod();
		
		//Accessing public method in different class and different package
		obj3.add(3,6);
		
		//Accessing private method in different class and different package
		//Error cannot access private methods outside the class
		obj3.hello();
		
		//Accessing protected method in different class and different package
		//Error cannot access protected method in different package. Can be only accessed via Inheritance
		obj3.welcome();
	}
}
