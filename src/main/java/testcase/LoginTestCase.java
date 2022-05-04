package testcase;

import org.testng.annotations.Test;

import hooks.BaseClass;
import pages.Home;
import pages.Login;
import pages.MyHome;

public class LoginTestCase extends BaseClass{
  
		
	@Test
	public void Login_01() throws InterruptedException {
	   
     new Login().userName(prop.getProperty("username"))
     .passWord(prop.getProperty("password"))
     .logIn();    
    
	}

}
