import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad1NajbrziMaratonac extends Maratonci {

	public static void main(String[] args) {
		

		File file = new File("maraton.txt");
		
		try {
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				
				String ime = input.next();
				int vrijeme = input.nextInt();
				
				Maratonci maratonac = new Maratonci(ime, vrijeme);
			}
			
			Maratonci.najbrzi();
					
		}
		
		catch (FileNotFoundException e) {
			System.err.format("Fajl ne postoji");
		}
		
		
	}

	}


