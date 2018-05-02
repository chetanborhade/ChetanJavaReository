class ArrayDemo1
{
	public static void main(String[] args)
	{
		int[] arr1;				//Declarotion
		arr1 = new int[5];		// Size allocation
		
		// Initialization
		
		arr1[0]=20;
		arr1[1]=40;
		arr1[2]=60;
		arr1[3]=80;
		arr1[4]=100;
		
		System.out.println("********************************");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println("ARRAY ELEMENT ARE " +arr1[i]);
		}

	}
}