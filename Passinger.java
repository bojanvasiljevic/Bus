package bus;


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
