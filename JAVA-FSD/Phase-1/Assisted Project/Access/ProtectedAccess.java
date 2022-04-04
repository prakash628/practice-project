package Access;

public class ProtectedAccess {
	
	public static void main(String[] args) {
		AccessMod obj2 = new AccessMod();
		
		//Accessing public method in different class but same package
		obj2.add(3,9);
		
		//Accessing private method in different class but same package
		//Error we cannot access private methods outside same class
		obj2.hello();
		
		//Accessing protected method in different class but same package
		obj2.welcome();
	}
}
