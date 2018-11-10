import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Maratonci {
	
	private String imeUcesnika;
	private int vrijemeKojeJeOstvario;
	
	protected static ArrayList <Maratonci> maratonci = new ArrayList<Maratonci>();
	static Scanner unos = new Scanner(System.in);
	
	public Maratonci(){
		
	}
	
	
	public Maratonci(String imeUcesnika, int vrijemeKojeJeOstvario) {
		this.imeUcesnika = imeUcesnika;
		this.vrijemeKojeJeOstvario = vrijemeKojeJeOstvario;
		
		maratonci.add(this);
	}
	
	public void setImeUcesnika(String imeUcesnika) {
		this.imeUcesnika = imeUcesnika;
	}
	
	public void setVrijemeKojeJeOstvario(int vrijemeKojeJeOstvario) {
		this.vrijemeKojeJeOstvario = vrijemeKojeJeOstvario;
	}
	
	public String getImeUcesnika() {
		return imeUcesnika;
	}
	
	public int getVrijemeKojeJeOstvario() {
		return vrijemeKojeJeOstvario;
	}
	
	
	// Zadatak1
	public static void najbrzi() {
		
		int najboljeVrijeme = maratonci.get(0).getVrijemeKojeJeOstvario();
		Maratonci najbolji = maratonci.get(0);
	
		for (int i = 0; i < maratonci.size(); i++) {
			if (maratonci.get(i).getVrijemeKojeJeOstvario() <= najboljeVrijeme) {
				najboljeVrijeme = maratonci.get(i).getVrijemeKojeJeOstvario();
				najbolji = maratonci.get(i);
			}
			
		}
	
		System.out.print("Pobjednik maratona je " + najbolji.getImeUcesnika());
		System.out.println(", sa vremenom " + najbolji.getVrijemeKojeJeOstvario() + " minuta.");
			
	}
	
	//Zadatak2
	protected static ArrayList <Maratonci> listaSortiranih = new ArrayList<Maratonci>();
	
	public static void sortiraniUcesnici() {
		
		int[] vremenaUcesnika =new int[maratonci.size()];
	
		for (int i = 0; i < vremenaUcesnika.length; i++) {
			vremenaUcesnika[i] = maratonci.get(i).getVrijemeKojeJeOstvario();
		}
	
		int[] sortiranaVremenaUcesnika = sort(vremenaUcesnika);
	
		for (int i = 0; i < sortiranaVremenaUcesnika.length; i++) {
			for (int j = 0; j < maratonci.size(); j++) {
				if (maratonci.get(j).getVrijemeKojeJeOstvario() == sortiranaVremenaUcesnika[i]) {
					listaSortiranih.add(maratonci.get(j));
				}
			}
		
		}

		for (int i = 0; i < listaSortiranih.size(); i++) {
			System.out.println((i + 1) + ". " + listaSortiranih.get(i).getImeUcesnika() + " " + listaSortiranih.get(i).getVrijemeKojeJeOstvario());
		}
	
	}
	
	public static int[] sort(int[] nizz) { //metod za sortiranje niza
		
		for(int i=0; i<nizz.length-1; i++) {
			for(int j=0; j<nizz.length-i-1; j++) {
				if(nizz[j]>nizz[j+1]) {
					int temp=nizz[j];
					nizz[j]=nizz[j+1];
					nizz[j+1]=temp;
				}
			}
			
		}
		return nizz;
	}
	
	
	//Zadatak3
	public static void zad3VrijemeZaTrazenoIme () {
		
		System.out.println("Unesite ime nekog od ucesnika: ");
		String ime = unos.next();
		boolean imePostoji = false;
		
		for(int i=0; i<maratonci.size(); i++) {
			if(maratonci.get(i).getImeUcesnika().equals(ime)) {
				System.out.println("Vrijeme ucesnika " + maratonci.get(i).getImeUcesnika() + " iznosi " + maratonci.get(i).getVrijemeKojeJeOstvario() + " minuta.");
				imePostoji = true;
				break;
			}
		}
		
		if(!imePostoji) {
			System.out.println("Ucesnik ne postoji!");
		}
		
	}
	
	//Zadatak4
	public static void prosjecnoVrijeme() {
		
		int zbir =0;
		
		for(int i=0; i<maratonci.size(); i++) {
			zbir+= maratonci.get(i).getVrijemeKojeJeOstvario();
		}
		
		double prosjek = zbir/maratonci.size();
		
		System.out.println("Prosjecno vrijeme svih ucesnika je: " + prosjek);
	}
		
	
	//Zadatak5
	public static void najboljiMaratonci() throws FileNotFoundException {
		
	
		File najboljiMaratonci = new File ("C:/Users/medn/eclipse-workspace/Maraton/najboljiMaratonci.txt");
		PrintWriter output = new PrintWriter(najboljiMaratonci);
		
		for (int i = 0; i < maratonci.size(); i++) {
			if (maratonci.get(i).getVrijemeKojeJeOstvario() < 300) {
				output.println(maratonci.get(i).getImeUcesnika() + " " + maratonci.get(i).getVrijemeKojeJeOstvario());
		}
	}
	
	output.close();
	System.out.println("Najbolji uneseni!");
			
		
	}

}
