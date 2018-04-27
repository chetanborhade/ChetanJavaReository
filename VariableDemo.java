class VariableDemo
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
	
	//System.out.println("A IS " +a);
	//System.out.println("B IS " +b);
	//System.out.println("C IS " +c);
	
	a = c;
	b = a;
	c = a;
	b = c;
	c = a;
	
	System.out.println("A is " +a);
	System.out.println("B is " +b);
	System.out. println("C is " +c);
	}
}