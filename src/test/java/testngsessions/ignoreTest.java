package testngsessions;

import org.testng.annotations.Test;

public class ignoreTest {
	
	
	@Test(description = "searching a product test", priority = 1)
	public void searchTest() {
		System.out.println("search test");
	}
	@Test(priority = 2)
	public void logoTest() {
		System.out.println("logo test");

	}
	@Test(enabled = false, description = "making payment via cc and debit card", priority = 3)
	public void paymentTest() {
		System.out.println("payment test");

	}

}
