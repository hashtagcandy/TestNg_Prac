package pages;

import java.util.Properties;

import org.openqa.selenium.By;


import hooks.BaseClass;

public class MyHome extends BaseClass {
	
	
	public MyLeads  clickhome() {
		getdriver().findElement(By.linkText(prop.getProperty("LeadsLink"))).click();
		return new MyLeads();
	}

	
	
}
