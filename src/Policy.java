
public class Policy{
	protected final int YEARS = 2016;
	protected String pnumber;
	protected int pdate;
	protected int premaccount;
	protected Policy_Owner PolicyOwner;

	public Policy() {
		pnumber = "";
		pdate = 0;
		premaccount = 0;

	}

	public Policy(String n, int d, int p,  String PO, String A, String C, String S, int By) {
		pnumber = n;
		pdate = d;
		premaccount = p;
		PolicyOwner = new Policy_Owner(PO, A, C, S, By);
	}

	public void setNumber(String n) {
		pnumber = n;
	}

	public void setDate(int d) {
		pdate = d;
	}

	public void setPremium(int p) {
		premaccount = p;
	}

	public String getNum() {
		return pnumber;
	}

	public int getDate() {
		return pdate;
	}

	public int getPremium() {
		return premaccount;
	}
	public Policy_Owner getPolicyOwner(){
		return PolicyOwner;
	}
	public void addPolicyOwner(String n, String a, String c, String s, int by) {
		setPolicy(new Policy_Owner(n,a,c,s,by));
	}
	public void addPolicy(String pn, int pd, int pa){
		PolicyOwner.addPolicy(pn, pd, pa);
	}
	public void addMotorPolicy(String t, int v, int yb, int na){
		PolicyOwner.addMotorPolicy(t, v, yb, na);
	}
	public void addHealthPolicy(boolean f, int w){
		PolicyOwner.addHealthPolicy(f, w);
	}
	public int calcMonthlyPrem(){
		return (premaccount/12);
	}

	public void setPolicy(Policy_Owner policy) {
		this.PolicyOwner = policy;
	}
	public void PrintData(){
		System.out.println("Policy Number: " + pnumber + ", Policy Start Date: " + pdate + ", Amount Owed: " + premaccount);
		System.out.println(PolicyOwner.toString());
		System.out.println("Monthly Premium: $"+ calcMonthlyPrem());
	}

}
