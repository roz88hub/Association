
public class Car {
	
	Wheel wheels;
	Engine engine;
	Seat seats;
	
	//Default Constructor
		Car(){
		}
	
	@Override
		public String toString() {
			return "Car [wheels=" + wheels + ", engine=" + engine + "]";
		}

	Car(Engine e, Wheel w, Seat s){
		this.engine = e;
		this.wheels = w;
		this.seats =s;
	}
	//material, filler, brand, suitableSeason, isInfantSafe, isHeated,
	public static void main(String[] args) {
		Car c = new Car(new Engine(1.8, "Petrol", 5, 250), new Wheel(34.5,"Tata", 24), new Seat("Leather","Cotton","HOLYCOW", "Winter" ,true, false));
		c.engine.start();
	}
	
}
