class Accountingg{
	public double valueOfSupply;
	public static double vatRate = 0.1;
	public Accountingg(double valueOfSupply){
		this.valueOfSupply = valueOfSupply;
	}
	
	public double getVAT() {
		return valueOfSupply * vatRate;
		}
	public double getTotal() {
			double total = valueOfSupply + getVAT();
			return total;
		}
}

public class AccountingApp {
	
	public static void main(String[] args) {
		
		Accountingg a1 = new Accountingg(10000.0);
		Accountingg a2 = new Accountingg(20000.0);
		
		System.out.println("Value of supply : "+a1.valueOfSupply);
		System.out.println("Value of supply : "+a2.valueOfSupply);
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		System.out.println("Total :"+ a1.getTotal());
		System.out.println("Total :"+ a2.getTotal());
	
	}
}
