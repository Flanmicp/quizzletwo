package Car;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDrive {

	@Test
	public void test() {
		
		Carpayment car = new Carpayment(35000,0,.1,60);
	
		
		assertEquals(car.monthlyPayment(), -743.6465648943916, 0.00);
		assertEquals(car.totalIntrestPay(), -9618.793893663496, 0.00);

		
	}
}

