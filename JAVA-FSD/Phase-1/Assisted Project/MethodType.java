package Assignment;



public class MethodType {
	
	public void hello()
	{
		System.out.println("Inside hello method. No return type");
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double mul(double a, double b)
	{
		return a*b;
	}
	
	public float div(float a, float b)
	{
		return a/b;
	}
	
	public String ending()
	{
		return "Thank you";
	}

	public static void main(String[] args) {
		MethodType mt = new MethodType();
		mt.hello();
		System.out.println(mt.add(20, 30));
		System.out.println(mt.mul(50, 80));
		System.out.println(mt.div(200, 10));
		System.out.println(mt.ending());

	}

}

