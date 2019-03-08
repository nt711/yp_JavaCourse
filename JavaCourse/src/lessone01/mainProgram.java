package lessone01;

public class mainProgram {

	public static void main(String[] args) {
		mobileDevice device1 = new mobileDevice();
		device1.model = "Galaxy";
		device1.OS = 'A';
		device1.OSVersion = 12;
		device1.hasFlash = false;
		device1.price = 3500;
		
		device1.printParameters();
		
		device1.setArea(5, 11);
				System.out.println("Device's Area is: " + device1.calcArea());
		device1.pictureQuality();

	}

}
