package autobuska;

/**
 * Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
 * 
 * @author Bojan
 *
 */
public class Driver extends Man {

	private String profession;

	public Driver(String name, String lastName, String profession) {
		super(name, lastName);
		this.profession = profession;
	}

	public String getProfession() {
		return this.profession;
	}

}
