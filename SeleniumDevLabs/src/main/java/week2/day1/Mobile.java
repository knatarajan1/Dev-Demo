package week2.day1;

public class Mobile {
	public String mobileModel;;
	public String generation;
	
	public Mobile(String mobileModel,String generation) {
		this.mobileModel=mobileModel;
		this.generation=generation;
	}
	
	public boolean check5G() {
		boolean check5G=false;
		if(this.generation.equalsIgnoreCase("5G"))
			check5G=true;
		return check5G;
	}
	
	public String dispalyMobileDetails() {
		return "Mobile Model is "+this.mobileModel+" with capability of "+this.generation.toUpperCase();
	}
	
	public static String Call(long mobileNumber) {
		return "Dial "+mobileNumber+"............";
	}
	public static String Call(String contactName) {
		return "Call "+contactName+"............";
	}
}
