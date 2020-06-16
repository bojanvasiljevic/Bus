package autobuska;

/**
 * Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
 * Svi podaci mogu da se dohvate, ali ne i postave.  Putnik je covek koji poseduje novac.
 * Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom
 * kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme, gde je
 * potrebno vratiti indikator uspesnosti.
 * 
 * Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime
 * voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je
 * dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima
 * samo ako je vozac prisutan. Autobus ispisati u sledecem obliku: Naziv ( vozac
 * - Putnik1[novac], Putnik2 [novac],... )
 * 
 * @author Bojan
 *
 */

public class Man {

	private String name;
	private String lastName;

	public Man(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLastName() {
		return lastName;
	}

}
