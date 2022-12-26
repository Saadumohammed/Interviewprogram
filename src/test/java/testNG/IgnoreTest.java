package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test(enabled = false)
	private void mens() {
		System.out.println("Mens Clothings");

	}
	@Test()
	private void womens() {
		System.out.println("Womens Clothings");

	}
	@Test
	private void kids() {
		System.out.println("Kids clothings");

	}
	@Ignore
	@Test
	private void born_babies() {
		System.out.println("Born Babies");

	}

}
