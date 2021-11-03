
public class Policy_Owner extends Policy {
	String name;
	String address;
	String city;
	String state;
	int birthyear;

	public Policy_Owner() {
		name = "";
		address = "";
		city = "";
		state = "";
		birthyear = 0;

	}

	public Policy_Owner(String n, String a, String c, String s, int by) {
		name = n;
		address = a;
		city = c;
		state = s;
		birthyear = by;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAddress(String a) {
		address = a;
	}

	public void setCity(String c) {
		city = c;
	}

	public void setState(String s) {
		state = s;
	}

	public void setBirth(int by) {
		birthyear = by;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getBirth() {
		return birthyear;
	}

	public String toString() {
		return ("Name: " + name + ", " + "Address: " + address + ", " + "City: " + city + ", State: " + state + ", " + "Year Born: " + birthyear);

	}
}
