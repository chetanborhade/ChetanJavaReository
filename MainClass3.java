class Central1
{
	int a = 33; 		// non static data
	void disp()			// non static function
	{
		System.out.println("DISP METHOD");
		
	}
}
class MainClass3
{
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD");
		
		Central1 c1 = new Central1();
		System.out.println("A VALUE IS: " +c1.a);
		c1.disp();
	}
}