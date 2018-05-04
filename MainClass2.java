class Battery
{
	String name = "Litjium";
	int status = 40;
	{
		void charging(int charge)
		{
			status = status+charge;
		}
		void discharging(int discharge)
		{
			status = status-discharge;
		}
		void current status()
		{
			System.out.println("current status is: "+status);
			
		}
	}
		void MainClass3
		{
			public static void main(String[] args)
			{
				Battery b1 = new battery(string[] args)
				System.out.println("Battery name is " +b1.name);
				b1.charging(25);
				b1.current status();
				
				b1.discharging(15);
				b1.current status();
				
				b1.charging(30);
				b1.discharging(10);
				b1.charging(35);
				
				b1. current status();			}
		}
}