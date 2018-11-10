import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zad2SortiranjePoUspjehuOdNajboljeg {

	public static void main(String[] args) {
		
		
		File file = new File("maraton.txt");
		
		try {
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				
				String ime = input.next();
				int vrijeme = input.nextInt();
				
				Maratonci maratonac = new Maratonci(ime, vrijeme);
		        }
			
			Maratonci.sortiraniUcesnici();
			
				
			}
		
		catch (FileNotFoundException e) {
			System.err.format("Fajl ne postoji");
			
		}
		
		
	}
}

	


