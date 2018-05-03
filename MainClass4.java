// Non Static multiple copies

class Demo1
{
	void info()
	{
		System.out.println("INFO METHOD");
	}
}

class MainClass4
{
	public static void main(String[] args)
	{
		Demo1 d1 = new Demo1();
		d1.info();
		
		Demo1 d2 = new Demo1();
		d2.info();
		
		System.out.println("D1 Value is: "+d1);
		System.out.println("D2 Value is: "+d2);
	}
}