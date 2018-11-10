import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad5NajboljiMaratonci {

	public static void main(String[] args) throws FileNotFoundException {
	
		File file = new File("maraton.txt");
		File najboljiMaratonci = new File ("C:/Users/medn/eclipse-workspace/Maraton/najboljiMaratonci.txt");
		PrintWriter output = new PrintWriter(najboljiMaratonci);
		
		try {
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				
				String ime = input.next();
				int vrijeme = input.nextInt();
				
				Maratonci maratonac = new Maratonci(ime, vrijeme);
		        }
			
			Maratonci.najboljiMaratonci();
				
			}
		
		catch (FileNotFoundException e) {
			System.err.format("Fajl ne postoji");
		}
		


	}

}
