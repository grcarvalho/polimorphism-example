package entities;

public class ImportedProduct extends Product{
	double customsFee;

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	public ImportedProduct() {
	}
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	@Override
	public String priceTag() {
		return super.name + " $ " + (super.price + this.customsFee) + " (Customs fee: $ " + this.customsFee + ")";
	}

}
