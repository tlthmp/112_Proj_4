
public class Health_Policies extends Policy{
	boolean flag;
	int pweight;

	public Health_Policies() {
		flag = false;
		pweight = 0;
	}

	public Health_Policies(String n, int d, int p, String PO, String A, String C, String S, int By, boolean f, int w) {
		super(n,  d, p,  PO, A, C, S, By);
		flag = f;
		pweight = w;
	
	}

	public void setFlag(boolean f) {
		flag = f;
	}

	public void setWeight(int w) {
		pweight = w;
	}

	public boolean getFlag() {
		return flag;
	}

	public int getWeight() {
		return pweight;
	}
	public int calcMonthlyPrem(){
		int bill = premaccount;
			
			if(flag == true){
				bill = bill + 500;
			}
			if(YEARS - PolicyOwner.getBirth() > 60){
				bill = bill + 300;
			}
			if(YEARS - PolicyOwner.getBirth() < 30){
				bill = bill - 300;
			}
		
		
		return bill/12;
	}
	public void addHealthPolicy(boolean f, int w){
		PolicyOwner.addHealthPolicy(f, w);
	}
	public void PrintData(){
		super.PrintData();
		
		System.out.println("Smoker: " + flag + ", " + "Weight: " + pweight);
	}

}
