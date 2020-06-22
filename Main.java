package bus;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	/*
	 * Passinger passinger1 = new Passinger("John", "Johnson", 5000); Passinger
	 * passinger2 = new Passinger("David", "Gray", 1000); Passinger passinger3 = new
	 * Passinger("Paul", "McCartney", 1653); Passinger passinger4 = new
	 * Passinger("Iggy", "Pop", 159);
	 * 
	 * Driver driver1 = new Driver("Paul", "Robinson", "Bus driver"); Driver driver2
	 * = new Driver("Robin", "Paulson", "Bus driver");
	 * 
	 * Bus bus1 = new Bus("Lasta", 565); Bus bus2 = new Bus("Belegija", 122); Bus
	 * bus3 = new Bus("Raketa", 789);
	 * 
	 * bus1.addPassinger(passinger1); bus1.addPassinger(passinger2);
	 * bus1.addPassinger(passinger3);
	 * 
	 * System.out.println(bus1); bus1.addDriver(driver1);
	 * bus1.addPassinger(passinger4);
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String busLineName;
		int ticketPrice;
		boolean loopCheck = true;
		while (loopCheck) {
			System.out.println("Create another bus line Y/N");
			String onOff = s.next();
			if (onOff.toUpperCase().equals("N")) {
				loopCheck = false;
				continue;
			} else {
				System.out.println("Enter Bus name and press enter:  ");
				busLineName = s.next().toUpperCase();
				System.out.println("Enter ticket price and press enter");
				ticketPrice = s.nextInt();
				Bus bus1 = new Bus(busLineName, ticketPrice);

				System.out.println("Enter driver name and press enter");
				String name = s.next();
				while (name == null) {
					System.out.println("you must enter name!");
					name = s.next();
				}
				System.out.println("Enter diver lastname and press enter");
				String lastName = s.next();
				while (lastName == null) {
					System.out.println("you must enter name!");
					lastName = s.next();
				}

				Driver driver = new Driver(name, lastName);
				System.out.println("Press Y to add driver " + name + " to bus: " + busLineName);
				String check = s.next();
				if (check.toLowerCase().equals("y")) {
					if (bus1.addDriver(driver)) {
						System.out.println("Succesful");
					} else {
						System.out.println("Unsuccesful");
					}
				}
				boolean passingerAdd = true;
				do {
					System.out.println("Add passinger first name");
					name = s.next();
					System.out.println("Add passinger lastname");
					lastName = s.next();
					System.out.println("Add passinger cash");
					float money = s.nextFloat();
					Passinger passinger = new Passinger(name, lastName, money);
					bus1.addPassinger(passinger);
					System.out.println("To add another passiner press Y or N to go to next step");
					onOff = s.next();
					if (onOff.toUpperCase().equals("Y")) {
						passingerAdd = true;
						continue;
					} else {
						passingerAdd = false;
					}
				} while (passingerAdd);
				int switchOptions;
				do {
				System.out.println("Select one of the following options");
				System.out.println("1. View passinger list");
				System.out.println("2. Charge ticket to passingers");
				System.out.println("0. to exit meny");
				switchOptions = s.nextInt();
				
					switch (switchOptions) {
					case 1:
						System.out.println(Arrays.toString(bus1.getPassingerList().toArray()));
						break;
					case 2:
						bus1.ticketCharge();
						break;

					}
				}while(switchOptions !=0);
				
			}

		}
	}

}
