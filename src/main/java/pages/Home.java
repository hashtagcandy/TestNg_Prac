package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;

public class Home extends BaseClass{


	public MyHome clickCRMSFA() {
		getdriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHome();
	}

}
