public class overload 
{
	String test(int value)
	{
		return String.format("%d",value);
	}
	String test(double value)
	{
		return String.format("%.3f",value);
	}
	String test(String value)
	{
		return String.format("%.2f",Double.parseDouble(value));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      overload ob= new overload();
      System.out.println(ob.test(500));
      System.out.println(ob.test(89.9934));
      System.out.println(ob.test("550"));
	}
}
