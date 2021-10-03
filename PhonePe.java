package Constructor;

public class PhonePe {
	String userName;
	long PhoneNo;
	String place;
	long adharNo;
	String PAN;

	PhonePe(){
		System.out.println("Constructor with no parameters invoked");
	}	
	PhonePe(String userName,String place,long PhoneNo){
		System.out.println("Constructor with parameters(mandatory fields) is invoked");
		this.userName=userName;
		this.place=place;
		this.PhoneNo=PhoneNo;
	}
	PhonePe(String userName,String place,long PhoneNo,long adharNo){
		System.out.println("Constructor with parameters(mandatory fields & Adhar No.) is invoked");
		this.userName=userName;
		this.place=place;
		this.PhoneNo=PhoneNo;
		this.adharNo=adharNo;
	}
	PhonePe(String userName,String place,long PhoneNo,String PAN){
		System.out.println("Constructor with parameters(mandatory fields & PAN) is invoked");
		this.userName=userName;
		this.place=place;
		this.PhoneNo=PhoneNo;
		this.PAN=PAN;
	}
	PhonePe(String userName,String place,long PhoneNo,long adharNo,String PAN){
		System.out.println("Constructor with parameters(all fields) is invoked");
		this.userName=userName;
		this.place=place;
		this.PhoneNo=PhoneNo;
		this.adharNo=adharNo;
		this.PAN=PAN;
	}
	public void Login() {
		System.out.println(this.userName);
		System.out.println(this.place);
		System.out.println(this.PhoneNo);
		System.out.println(this.adharNo);
		System.out.println(this.PAN);
	}
		public static void transferMoney() {
			System.out.println("Money transfered successfully");
		}
		public static void rechargeMobile() {
			System.out.println("Book A Cylinder successfully");
		}
		public static void electricityBill() {
			System.out.println(" Rent paid");
		}
		public static void rechargeDTH() {
			System.out.println("DTH recharge done");
		}

}
 

