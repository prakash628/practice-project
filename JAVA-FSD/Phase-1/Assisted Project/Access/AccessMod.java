package Access;

public class AccessMod {
	public void add(int a, int b)
	{
		int result = a+b;
		System.out.println(result);
	}
	
	private String hello()
	{
		return "Hiiie";
	}
	
	protected String welcome()
	{
		return "Welcome to the program";
	}
	
	public static void main(String[] args) {
		AccessMod obj = new AccessMod();
		
		//Accessing public method in same class
		obj.add(4, 74);
		
		//Accessing private method in same class
		obj.hello();
		
		//Accessing protected method in same class
		obj.welcome();
	}

}
