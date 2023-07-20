

public class Restaurant {
	private int resid;
	private String name;
	@Override
	public String toString() {
		return "Restaurant [getResid()=" + getResid() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getSignatureMenu()=" + getSignatureMenu() + ", getRate()=" + getRate() + "]";
	}
	private String address;
	private String signatureMenu;
	private int rate;
	
	//res 생성자
	public Restaurant() {
		
	}
	public Restaurant(int resid, String name, String address, String signatureMenu, int rate) {
		this.resid =resid;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}
	
	
	
	//getter setter
	public int getResid() {
		return resid;
	}
	public void setResid(int resid) {
		this.resid = resid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSignatureMenu() {
		return signatureMenu;
	}
	public void setSignatureMenu(String signatureMenu) {
		this.signatureMenu = signatureMenu;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	
	

}
