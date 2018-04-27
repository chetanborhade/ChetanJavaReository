class circle1
{
	static double areaOfcircle (double rad)
	{
		double area = 3.14*rad*rad;
		return area;
	}
	public static void main(String[] args)
	{
		double area = areaOfcircle(3.2);
		System.out.println("AREA OF CIRCLE IS " +area);
	}
}