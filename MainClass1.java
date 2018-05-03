class central1
{
	static int k = 12;
	
	static void test()
	{
		System.out.println("TEST METHOD");
	}
}
class MainClass1
{
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		System.out.println("K Value is: " +central1.k);
		central1.test();
	}
}