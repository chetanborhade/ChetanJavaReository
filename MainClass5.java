class Demo1
{
	int k = 12;
}

class MainClass5
{
	public static void main(String[] args)
	{
		Demo1 d1 = new Demo1();
		d1.k = 33;
		System.out.println("K VALUE IS: " +d1.k);
		
		Demo1 d2 = new Demo1();
		System.out.println("K VALUE IS: " +d2.k);
	}
	
}