package bus;

/**
 * Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime
 * voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je
 * dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima
 * samo ako je vozac prisutan. Autobus ispisati u sledecem obliku: Naziv ( vozac
 * - Putnik1[novac], Putnik2 [novac],... )
 * @author Bojan
 *
 */

import java.util.ArrayList;
import java.util.Arrays;

import org.w3c.dom.ls.LSInput;

public class Bus {
	private static int BUS_ID = 1;

	private String busName;
	private Driver driverName;
	private float ticketPrice;
	private ArrayList<Passinger> passingerList;
	private int id;

	public Bus(String busName, int ticketPrice) {
		this.busName = busName;
		this.ticketPrice = ticketPrice;
		passingerList = new ArrayList<Passinger>();
		id = BUS_ID;
		BUS_ID = getRandom();
	}

	public int getRandom() {
		return ((int) (Math.random() * (100000 - 1))) + 1;
	}

	public String getBusName() {
		return busName;
	}

	public int getID() {
		return id;
	}

	public Driver getDriverName() {
		return driverName;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public ArrayList<Passinger> getPassingerList() {
		return passingerList;
	}

	public boolean addDriver(Driver driverName) {
		this.driverName = driverName;
		return true;
	}

	public boolean removeDriver(Driver driverName) {
		if (this.driverName == driverName) {
			this.driverName = null;
			return true;
		} else {
			return false;
		}
	}

	public boolean addPassinger(Passinger passingerName) {
		for (Passinger name : passingerList) {
			if (name == passingerName) {
				return false;
			}
		}
		passingerList.add(passingerName);
		return true;
	}

	public boolean removePassinger(Passinger name) {
		for (int i = 0; i < passingerList.size(); i++) {
			if (passingerList.get(i) == name) {
				passingerList.remove(name);
				return true;
			}
		}
		return false;
	}

	public boolean ticketCharge() {
		if (this.driverName == null) {
			return false;
		}
		for (int i = 0; i < passingerList.size(); i++) {
			if (!passingerList.get(i).removeMoney(ticketPrice)) {
				passingerList.remove(i);
				i--;
			}
		}

		return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(busName).append(" ").append("Sa jedinstvenim ID: ").append(id).append(". ")
				.append("Lista putnika na ovoj liniji je: ").append(Arrays.toString(passingerList.toArray()));
		return sb.toString();
	}

}
