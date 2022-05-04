package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hooks.BaseClass;
import pages.CreateLead;
import pages.Login;


public class ViewLeadtestCase extends BaseClass{
	@BeforeClass
	public void setfile() {
		excelfile = "CreateLead";
	}
	
	
	@Test(dataProvider="data")
	public void viewLead_02(String cname,String fname,String lname) {
		new Login()
		.userName(prop.getProperty("username"))
	     .passWord(prop.getProperty("password"))
		.logIn()
		.clickCRMSFA()
		.clickhome()
		.clickCreateLead()		
		.companyName(cname)
		.firstName(fname)
		.lastName(lname)
		.createButton();
	}

}
