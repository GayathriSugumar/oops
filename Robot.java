package Constructor;

public class Robot {

	int price;
	String brand;
	String model;
	String version;
	String type;
	String color;
	String capacity;
		
	
	//constructor with parameter
	public Robot(int price,String brand,String model,String version,String type,String color,String capacity) {
		System.out.println("It is invoked");
		this.price=price;
		this.brand=brand;
		this.model=model;
		this.version=version;
		this.type=type;
		this.color=color;
		this.capacity=capacity;
		}
	
	public void switchOnOff() {
		System.out.println("Robot activation");
	}
	public void tasks() {
		System.out.println("Robot doing tasks");
	}
	public void communicating() {
		System.out.println("communicat with voice processing");
	}
	public void records() {
		System.out.println("capture videos and photos");
	}
	
	
	public void displayInfo() {
		System.out.println("price="+this.price);
		System.out.println("brand="+this.brand);
		System.out.println("model="+this.model);
		System.out.println("version="+this.version);
		System.out.println("type="+this.type);
		System.out.println("color="+this.color);
		System.out.println("capacity="+this.capacity);
	}
}
