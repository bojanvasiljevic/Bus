package autobuska;

/**
 * Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu
 * novca koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu
 * se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
 * 
 * @author Bojan
 *
 */
public class Passinger extends Man {

	private float money;

	public Passinger(String name, String lastName, float money) {
		super(name, lastName);
		this.money = money;
	}

	public float getMoney() {
		return money;
	}

	public boolean addMoney(float amount) {
		if (amount <= 0) {
			return false;
		} else {
			this.money = money + amount;
			return true;
		}
	}

	public boolean removeMoney(float amount) {

		if (amount <= 0 || amount > money) {
			return false;
		} else {
			this.money -= amount;
			return true;
		}
	}

	public String toString() {
		return getName() + ": " + money;
	}

}
