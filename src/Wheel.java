
public class Wheel {

	private double pressure;
	private boolean isPressueLow;
	private	String brand;
	private int size;
	
	public Wheel(double pressure, boolean isPressueLow, String brand, int size) {
		this.pressure = pressure;
		this.isPressueLow = isPressueLow;
		this.brand = brand;
		this.size = size;
	}
	public Wheel(double pressure, String brand, int size) {
		this.pressure = pressure;
		this.brand = brand;
		this.size = size; 
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public boolean isPressueLow() {
		return isPressueLow;
	}
	public void setPressueLow(boolean isPressueLow) {
		this.isPressueLow = isPressueLow;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Wheel [pressure=" + pressure + ", isPressueLow=" + isPressueLow
				+ ", brand=" + brand + ", size=" + size + "]";
	}
	
	
	
	
	
	
}
