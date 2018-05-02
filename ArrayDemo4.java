class ArrayDemo4
{
	static int[] takeArray()
	{
		int[] arr1;
		arr1 = new int[3];
		arr1 [0]= 10; 
		arr1 [1]= 20;
		arr1 [2]= 30;
		return arr1;
	}
	public static void main(String[] args)
	{
		int[]arg = takeArray();
		for(int i=0; i<arg.length; i++)
		{
			System.out.println(arg[i]);
		}
	}
}
