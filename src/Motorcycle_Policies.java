
public class Motorcycle_Policies extends Policy{
	private String type;
	private String VIN;
	private int yearbuilt;
	private int numAccidents;

	public Motorcycle_Policies() {
		type = "";
		VIN = "";
		yearbuilt = 0;
		numAccidents = 0;
	}

	public Motorcycle_Policies(String n, int d, int p, String PO, String A, String C, String S, int By, String t, String v, int y, int num) {
		super(n,  d, p,  PO, A, C, S, By);
		type = t;
		VIN = v;
		yearbuilt = y;
		numAccidents = num;
		
	}
	

	public void setType(String t) {
		type = t;
	}

	public void setVIN(String v) {
		VIN = v;
	}

	public void setYearBuilt(int y) {
		yearbuilt = y;
	}

	public void setAccidentNum(int n) {
		numAccidents = n;
	}

	public String getType() {
		return type;
	}

	public String getVIN() {
		return VIN;
	}

	public int getYearBuilt() {
		return yearbuilt;
	}

	public int getAccidentNum() {
		return numAccidents;
	}
	public void addMotorPolicy(String t, int v, int yb, int na){
		PolicyOwner.addMotorPolicy(t, v, yb, na);
	}
	public int calcMonthlyPrem(){
		int Prem = premaccount + (numAccidents*250);
		if(type == "Scooter"){
			return (Prem-400)/12;
		}
		else{
			return (Prem)/12;
		}
		
	}
	public void PrintData(){
		super.PrintData();
		
		System.out.println("Type: " + type + ", " + "Vehicle Identification Number: " + VIN + ", " + "Year Built: " + yearbuilt + ", " + "Number of Accidents: " + numAccidents);
	}
}
