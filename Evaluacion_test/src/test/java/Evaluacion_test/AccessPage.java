package Evaluacion_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessPage extends Base {
	
	By usernameLocator = By.id("user_login");
	By passwordLocator = By.id("user_pass"); 
	
	By accessBtnLocator = By.name("wp-submit");
	
	By menuPage = By.id("menu-pages");
	By addPage = By.linkText("Add New");
	

	public AccessPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void accessUser() {
		if(isDisplayed(usernameLocator)) {
			type("opensourcecms", usernameLocator);
			type("opensourcecms", passwordLocator);
			click(accessBtnLocator);
		}else {
			
		System.out.println("username textbox was not present");	
		}
		
	}
	
	
}
