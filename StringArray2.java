// Split Functionality

class StringArray2
{
	public static void main(String[] args)
	{
		String str = "Java_Sql_android_j2ee_Selenium";
		String[] arr1 = str.split("_");
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
}