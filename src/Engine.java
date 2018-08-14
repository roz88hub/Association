
public class Engine {
	
	private double cyclinderCapacity;
	private String engineType;
	private	int numberofCylinders;
	private double horsePower;

	public void start(){ 
		System.out.println("Starting Engine");
	}
	public void stop(){
		System.out.println("Stopping Engine");
	}
	public void accelerate(){
		System.out.println("Accelerate Engine");
	}
	public double getCyclinderCapacity() {
		return cyclinderCapacity;
	}
	public void setCyclinderCapacity(double cyclinderCapacity) {
		this.cyclinderCapacity = cyclinderCapacity;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getNumberofCylinders() {
		return numberofCylinders;
	}
	public void setNumberofCylinders(int numberofCylinders) {
		this.numberofCylinders = numberofCylinders;
	}
	public double getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public Engine(double cyclinderCapacity, String engineType,
			int numberofCylinders, double horsePower) {
		this.cyclinderCapacity = cyclinderCapacity;
		this.engineType = engineType;
		this.numberofCylinders = numberofCylinders;
		this.horsePower = horsePower;
	}
	@Override
	public String toString() {
		return "Engine [cyclinderCapacity=" + cyclinderCapacity
				+ ", engineType=" + engineType + ", numberofCylinders="
				+ numberofCylinders + ", horsePower=" + horsePower + "]";
	}
}
