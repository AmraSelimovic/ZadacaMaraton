import java.util.Scanner;

public class Zad6Astronau {

	public static void main(String[] args) {
		
		String URLString = "http://www.textfiles.com/science/astronau.txt";
		
		try {
			
			java.net.URL url = new java.net.URL(URLString);
			int counter = 0;
			
			Scanner input = new Scanner(url.openStream());
			while (input.hasNextLine()) {
				String line = input.nextLine();
				counter++;
			}
			
			input.close();
			System.out.println("Broj linija je: " + counter);
			}
		
			catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
			}
		
			catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
			}


	}

}
