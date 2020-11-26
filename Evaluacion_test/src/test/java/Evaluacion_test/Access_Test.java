package Evaluacion_test;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Access_Test {
	
	private WebDriver driver;
	AccessPage accessPage;
	
	
	@Before
	public void setUp() {
		accessPage = new AccessPage(driver);
		driver = accessPage.chromeDriverConnection();
		accessPage.visit("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
	}

	@After
	public void tearDown() throws Exception{
		
		
	}
	
	
	@Test
	public void test() throws InterruptedException{
		accessPage.accessUser();
	}

}
