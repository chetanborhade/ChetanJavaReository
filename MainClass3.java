class Battery
{
	String name = "Litjium";
	int status = 40;
	
		void Charging(int charge)
		{
			status = status+charge;
		}
		void Discharging(int discharge)
		{
			status = status-discharge;
		}
		void CurrentStatus()
		{
			System.out.println("current status is: "+status);
			
		}
}
class MainClass3
		{
			public static void main(String[] args)
			{
				Battery b1 = new Battery();
				System.out.println("Battery name is " +b1.name);
				b1.Charging(25);
				b1.CurrentStatus();
				
				b1.Discharging(15);
				b1.CurrentStatus();
				
				b1.Charging(30);
				b1.Discharging(10);
				b1.Charging(35);
				
				b1.CurrentStatus();			
			}
		}

