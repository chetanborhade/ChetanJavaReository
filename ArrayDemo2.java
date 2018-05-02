//Exception program

class ArrayDemo2
{
	public static void main(String[] args)
	{
		int[] arr1;				//Declaration
		arr1 = new int[3];		//Size allocation
		
		// Initialization
		
		arr1[0]=50;
		arr1[1]=100;
		arr1[2]=150;
		arr1[3]=200;
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
	}
}