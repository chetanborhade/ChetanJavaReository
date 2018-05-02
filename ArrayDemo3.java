class ArrayDemo3
{
	public static void main(String[] args)
	{
		int[] arr1;			// Declaration
		arr1 = new int[3];	// Size allocatio
		
		// Initialization
		
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		
		printArray(arr1);
	}
		static void printArray(int[] arg)
		{
			for(int i=0; i<arg.length; i++)
			{
				System.out.println(arg[i]);
			}
		}
	
}