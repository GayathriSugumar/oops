package Constructor;

public class iPad {
	int price;
	String model;
	String color;
	String brand;
	String storage;
	
	
	//constructor with parameter
		public iPad(int price,String brand,String model,String color) 
		{
			System.out.println("It is invoked");
			this.price=price;
			this.brand=brand;
			this.model=model;
			this.color=color;
			
			}
	
	public void login() {
			System.out.println("enter password");
	}
	public void music() {
		System.out.println("playing music");
	}
	public void game() {
		System.out.println("play games");
	}
	public void animation() {
		System.out.println("create animation");
    }
	public void movies() {
		System.out.println("watching and store movies");
	}
	public void displayInfo() {
		System.out.println("price="+this.price);
		System.out.println("brand="+this.brand);
		System.out.println("model="+this.model);
		System.out.println("color="+this.color);
	}		

}
