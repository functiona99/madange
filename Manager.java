package manager;

public class Manager {

	private String managerID;
	private String managerPassword;
	public Manager() {}
	public Manager(String managerID, String managerPassword) {
		super();
		this.managerID = managerID;
		this.managerPassword = managerPassword;
	}
	public String getManagerID() {
		return managerID;
	}
	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	
	
}
