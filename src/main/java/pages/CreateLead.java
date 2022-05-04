package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class CreateLead extends BaseClass {
	

	public CreateLead companyName(String compayname) {
		getdriver().findElement(By.id("createLeadForm_companyName")).sendKeys(compayname);
     return this;
	}
	public CreateLead firstName (String firstname) {
		getdriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	  return this;
	}
	public CreateLead lastName(String lastName) {
		getdriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	public ViewLead createButton() {
		getdriver().findElement(By.name("submitButton")).click();
		return new ViewLead();
	}
}