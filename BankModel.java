package tch;


public class BankModel {
	int id;
	String bankName;
	String type;
	String city;
	String state;
	int zip;
	
	@Override
	public String toString() {
		return "BankModel [id=" + id + ", bankName=" + bankName + ", type=" + type + ", city=" + city + ", state="
				+ state + ", zip=" + zip + "]";
	}
	public BankModel(int id, String bankName, String type, String city, String state, int zip) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.type = type;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
}
