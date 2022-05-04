package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class MyLeads extends BaseClass {
	
	 
	 
	public CreateLead clickCreateLead() {
		getdriver().findElement(By.linkText(prop.getProperty("createLeads"))).click();
		return new CreateLead();
		
	}

}
