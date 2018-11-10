import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zad7SortiranjePoAbecedi {

	public static void main(String[] args) {
		
		ArrayList <String> imena = new ArrayList<String>();
		File file = new File("imena.txt");
		
		try {
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				
				String ime = input.nextLine();
				imena.add(ime);
				
		        }
				
			String[] imenik = new String[imena.size()];
			
			for (int i = 0; i < imenik.length; i++) {
				int redniBroj = 0;
				String ime = imena.get(0); 				//postavljamo da je prvo ime u listi najmanje po abecednom redu
				for (int j = 0; j < imena.size(); j++) {   //i sva ostala imena poredimo s tim imenom pomocu compareTo metode za poredjenje stringova
					if (imena.get(j).compareTo(ime) < 0) { // metod compareTo vraca broj manji od 0 ako je sljedece ime u listi
						                                   // u poredjenju sa prvim manje po abecednom redu
						ime = imena.get(j);
						redniBroj = j;
						}
				}
				imenik[i] = ime;
				imena.remove(redniBroj);
			}
			
			for (int i = 0; i < imenik.length; i++) {
				System.out.println(imenik[i]);
			} 
		}
		
		catch (FileNotFoundException e) {
			System.err.format("Fajl ne postoji..");
		}
		
		
	}

	}


