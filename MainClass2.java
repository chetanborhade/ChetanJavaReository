class Central1
{
	int d = 12;
	void disp()
	{
		System.out.println("DISP METHOD");
	}
}
class MainClass2
{
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD");
		System.out.println("D VALUE IS " + new Central1().d);
		new Central1().disp();
	}
}