package Evaluacion_test;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Opensourcecms_AutomatedTest {
	
	private WebDriver driver;
	
	By usernameLocator = By.id("user_login");
	By passwordLocator = By.id("user_pass"); 
	
	By accessBtnLocator = By.name("wp-submit");
	
	
	
	By menuPage = By.id("menu-pages");
	By addPage = By.linkText("Add New");
	
	//By exitLocator = By.cssSelector("wp-admin-bar-top-secondary");
	//By exitBtnLocator = By.name("wp-admin-bar-logout");
	
	@Before
	public void setUp() throws Exception{
		ChromeOptions chromeOptions = new ChromeOptions(); 
		chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.findElement(exitLocator).isSelected();
		//driver.findElement(exitBtnLocator).click();
		
	}
	
	@Test
	public void test() {

		driver.findElement(usernameLocator).sendKeys("opensourcecms");
		driver.findElement(passwordLocator).sendKeys("opensourcecms");
		driver.findElement(accessBtnLocator).click();
		driver.findElement(menuPage).click();
		driver.findElement(addPage).click();
		
		
		
	}

}
