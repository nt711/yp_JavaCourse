package lessone02;

public class exe01 {

	public static void main(String[] args) {
		String fName = "Nati";
		String lName = "Tirosh";
		int iAge = 224;
				
		String sAge = Integer.toString(iAge);
		System.out.println(sAge);
		
		String fullName = fName + " " + lName;
		System.out.println(fullName.toUpperCase());
		System.out.println(fullName.length());
		System.out.println(fullName.equals(iAge));
		
	}

}
