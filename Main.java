package bus;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String busLineName;
		int ticketPrice;
		boolean loopCheck = true;
		while (loopCheck) {
			System.out.println("Create another bus line Y/N");
			String onOff = s.next();
			while (!onOff.toUpperCase().equals("Y") && !onOff.toUpperCase().equals("N")) {
				System.out.println("Error!!! Please select Y or N in order to proceed!!!");
				onOff = s.next();
			}
			if (onOff.toUpperCase().equals("N")) {
				loopCheck = false;
				System.out.println("Program had shut down");
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
					System.out.println("3. View ID number");
					System.out.println("0. to exit meny");
					switchOptions = s.nextInt();

					switch (switchOptions) {
					case 0:
						switchOptions = 0;
						break;
					case 1:
						System.out.println();
						System.out.print("***Passinger list: ");
						System.out.println(Arrays.toString(bus1.getPassingerList().toArray()));
						System.out.println();
						break;
					case 2:
						bus1.ticketCharge();
						break;
					case 3:
						System.out.println(bus1.getID());
						break;
					default:
						System.out.println("***********************************************************");
						System.out.println("*    Eror you have to select one of the stated options    *");
						System.out.println("***********************************************************");

					}
				} while (switchOptions != 0);

			}

		}
	}

}
