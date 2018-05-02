class StringFunction
{
	public static void main(String[] args)
	{
		String str = "Java Tester";
		
		System.out.println("Length of given string-->  "+str.length());
		System.out.println("Char at specified index-->  "+str.charAt(8));
		System.out.println("Index of specified char-->  "+str.indexOf("a"));
		System.out.println("LastIndex of specified char-->  "+str.lastIndexOf("a"));
		System.out.println("Given string contains-->  "+str.contains("test"));
		System.out.println("Given string start withsq-->  "+str.startsWith("Java"));
		System.out.println("Given string end withsq-->  "+str.endsWith("Tester"));
		System.out.println("substring of givenstring-->  "+str.substring(0,4));
		System.out.println("Uppercase-->  "+str.toUpperCase());
		System.out.println("Lowecase-->  "+str.toLowerCase());
		
	}
}
