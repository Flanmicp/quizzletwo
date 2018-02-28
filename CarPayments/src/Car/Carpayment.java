package Car;
import org.apache.poi.ss.formula.functions.Finance;
public class Carpayment {
		// Attributes
		private double Price, DwnPay, intrstrate;
		private int loan;
		
		//Methods
		public Carpayment(double Price, double DwnPay, double intrstrate, int loan)
		{
			super();
			this.Price = Price;
			this.DwnPay = DwnPay;
			this.intrstrate = intrstrate;
			this.loan = loan;
		}

		public double getPrice() {
			return Price;
		}


		public void setPrice(double price) {
			Price = price;
		}


		public double getDwnPay() {
			return DwnPay;
		}


		public void setDwnPay(double dwnPay) {
			DwnPay = dwnPay;
		}


		public double getIntrstrate() {
			return intrstrate;
		}


		public void setIntrstrate(double intrstrate) {
			this.intrstrate = intrstrate;
		}


		public int getLoan() {
			return loan;
		}


		public void setLoan(int loan) {
			this.loan = loan;
		}


		public double monthlyPayment()
		{
			return Finance.pmt(intrstrate/12, loan, Price-DwnPay);
		}
		
		public double totalIntrestPay()
		{
			return (loan*monthlyPayment()) +(Price-DwnPay);	
			
		}
		
	}

