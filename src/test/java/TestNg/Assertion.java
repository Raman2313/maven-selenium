package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	@Test(priority=1)
	void OpenURL() {
		Assert.assertTrue(true);;
	}
	@Test(priority=2, dependsOnMethods=("OpenUrl"))
	void LogIn() {
		Assert.assertTrue(true);
	}

}
