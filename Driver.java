package bus;

/**
 * Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
 * 
 * @author Bojan
 *
 */
public class Driver extends Man {

	private String profession;

	public Driver(String name, String lastName) {
		super(name, lastName);
		
	}

	public String getProfession() {
		return this.profession;
	}

}
