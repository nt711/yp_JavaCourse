package Package1;

public class mainProgram
{
	public static void main(String[] args)
	{
		mobileDevice md = new mobileDevice(10, 6); //EX04
		md.model = "LG";
		md.OS = 'A';
		md.OSVersion = 6;
		md.hasFlash = true;
		md.price = 2500.0;
		md.printParameters();
		
		// EX02
		//md.screenHeight = 10; 
		//md.screenWidth = 6;
		//System.out.println("Device's Area is: " + md.calcArea());
		md.pictureQuality();
		
		//EX03
		//md.setArea(6, 10);
		System.out.println("Device's Area is: " + md.calcArea());
		
		
	}
}
