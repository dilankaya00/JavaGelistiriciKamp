
public class Campaigns {
	private String name;
	private double discount;
	public Campaigns(String name, double discount) {
		super();
		this.name = name;
		this.discount = discount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
