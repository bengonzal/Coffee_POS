package application;

public abstract class Drink {
	private String item_name;
	private double base_price;
	private double total_price;
	private String item_description;
	
	public void set_Item_Name(String item_name) {
		this.item_name = item_name;
	}
	
	public void set_Base_Price(double base_price) {
		this.base_price = base_price;
	}
	
	public void set_Total_Price(double total_price) {
		this.total_price = total_price;
	}
	
	public void set_Item_Description(String item_description) {
		this.item_description = item_description;
	}
	
	public String get_Item_Name() {
		return item_name;
	}
	
	public double get_Base_Price() {
		return base_price;
	}
	
	public double get_total_price() {
		return total_price;
	}
	
	public String get_Item_Description() {
		return item_description;
	}
}
