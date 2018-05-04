class Projector
{
	// State of an object
	
	double price = 5000;
	String company = "EPSON";
	String color = "WHITE";
	String mode = "EP-501";
	String type = "Electronic";
	
	// Behaviour of anf object
	
	void displayPicture()
	{
		System.out.println("DISPLAY PICTURE");
	}
	void Settings()
	{
		System.out.println("SETTINGS");
	}
}
class MainClass1
{
	public static void main(String[] args)
	{
	Projector p1 = new Projector();
	
	System.out.println("PRICE OF PROJECTOR IS: "+p1.price);
	System.out.println("COMPANY OF PROJECTOR IS: "+p1.company);
	
	p1.displayPicture();
	p1.Settings();
	}
}