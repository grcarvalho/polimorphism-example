package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UsedProduct extends Product{
	private Date manufactureDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public UsedProduct(String name, double price, String manufactureDate) throws ParseException {
		super(name, price);
		this.manufactureDate = sdf.parse(manufactureDate);
	}
	public Date getManufatureDate() {
		return manufactureDate;
	}
	public void setManufatureDate(String manufactureDate) throws ParseException {
		this.manufactureDate = sdf.parse(manufactureDate);
	}
	
	@Override
	public String priceTag() {
		return name + " (used) $ " + price + " (Manufacture date: " + manufactureDate + ")";
	}

}
