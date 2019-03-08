package lesson06;

import java.util.ArrayList;
import java.util.List;

public class exec01 {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		countries.add("England");
		countries.add("Polland");
		countries.add("New York");
		countries.add("Ittaly");
		countries.add("Spain");
		
		for(String value : countries)
		{
			System.out.println(value);
		}
		int listSize  = countries.size();
		System.out.println(listSize);
		
		if(listSize % 2 == 0) {
			System.out.println("its even");
			System.out.println(countries.get(listSize/2));
			System.out.println(countries.get(listSize/2-1));
		}
		else {
			System.out.println("Odd");
			System.out.println(countries.get(listSize/2));

		}
		int loc = countries.indexOf("Polland");
		countries.set(loc, "Thailand");
		
		for(String value : countries)
		{
			System.out.println(value);
		}
		
		if(countries.contains("Germany")){
			System.out.println(countries.lastIndexOf("Germany"));
			
		}
		else {
			System.out.println("NO");
		}

	}

}
