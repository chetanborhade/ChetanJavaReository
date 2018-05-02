import java.util.Scanner;
class ScannerDemo1
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter Name");
		String name = sc1.next();
		System.out.println("Please enter age");
		int age = sc1.nextInt();
		
		if(age>18)
		{
			System.out.println(name + " ELIGIBLE FOR VOTING");
		}
		else
		{
			System.out.println(age + " NOT ELEGIBLE FOR VOTING");
		}
	}
}