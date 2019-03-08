package lessone01;

public class mobileDevice {
	String model;
	char OS;
	int OSVersion; 
	private int screenWidth, screenHeight;
	boolean hasFlash;
	double price;


	public void printParameters()
	{
		System.out.println(model);System.out.println(OS);System.out.println(OSVersion);System.out.println(hasFlash);System.out.println(price);
	}

	public int calcArea() {
		return screenHeight * screenWidth;
	}
	public void pictureQuality()
	{
		if (hasFlash)
			System.out.println("Good Quality");
		else
			System.out.println("Bad Quality");
	}
	void setArea (int sHeight, int sWidth) {

		if ((sHeight >0) || (sWidth >0))
		{
			screenHeight = sHeight;
			screenWidth = sWidth;
		}
		else
			System.out.println("Values must be positive");}


}



//need to remove the try > catch since the "if" includes it


