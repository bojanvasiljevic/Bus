package autobuska;

public class Main {

	public static void main(String[] args) {
		Passinger passinger1 = new Passinger("John", "Johnson", 5000);
		Passinger passinger2 = new Passinger("David", "Gray", 1000);
		Passinger passinger3 = new Passinger("Paul", "McCartney", 1653);
		Passinger passinger4 = new Passinger("Iggy", "Pop", 159);
		
		Driver driver1 = new Driver("Paul", "Robinson", "Bus driver");
		Driver driver2 = new Driver("Robin", "Paulson", "Bus driver");
		
		Bus bus1 = new Bus("Lasta", 565);
		Bus bus2 = new Bus("Belegija", 122);
		Bus bus3 = new Bus("Raketa", 789);
		
		bus1.addPassinger(passinger1);
		bus1.addPassinger(passinger2);
		bus1.addPassinger(passinger3);
		
		
		System.out.println(bus1);
		bus1.addDriver(driver1);
		bus1.addPassinger(passinger4);
		System.out.println(bus1.ticketCharge());
		System.out.println(bus1);
		System.out.println(bus2);
		System.out.println(bus3);
		
		
		

	
		
		
		
	}

}
