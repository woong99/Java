package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		tomas.takeSubway(greenSubway);
		
		james.showInfo();
		tomas.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
		
		Student edward = new Student("Edward", 20000);
		Taxi goodTaxi  = new Taxi("잘 간다 운수택시");
		edward.takeTaxi(goodTaxi);
		edward.showInfo();
		goodTaxi.showTaxiInfo();
	}

}
