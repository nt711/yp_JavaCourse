package Package1;

public class mobileDevice
{
	String model;
	char OS; // A - Android , I - IOS , W - Windows Phone
	int OSVersion;
	boolean hasFlash;
	double price;
	
	// Ex 01
	public void printParameters()
	{		
		System.out.println("Device Details: " + model + " " + OS + " " + OSVersion + " " + hasFlash + " " + price);
	}
	
	//Ex 02
	private int screenWidth , screenHeight; //EX03 - insert private modifier
		
	public int calcArea()
	{
		return screenWidth * screenHeight;
	}
	
	public void pictureQuality()
	{
		if (hasFlash)
			System.out.println("Good Quality");
		else
			System.out.println("Bad Quality");
	}
	
	//EX03
//	public void setArea(int width, int height)
//	{
//		if(width > 0 && width <= 10)
//			screenWidth = width;
//		if(height > 0 && height <= 20)
//			screenHeight = height;
//		else
//		{
//			screenWidth = 0;
//			screenHeight = 0;
//		}
//	}
	
	//EX03
	public mobileDevice(int width, int height)
	{
		if(width > 0 && width <= 10)
			screenWidth = width;
		if(height > 0 && height <= 20)
			screenHeight = height;
		else
		{
			screenWidth = 0;
			screenHeight = 0;
		}
	}
}

