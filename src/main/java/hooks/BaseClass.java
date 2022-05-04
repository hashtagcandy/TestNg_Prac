package hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {
	
	public ChromeDriver driver;
	public String excelfile;
	public Properties prop;
	
	private static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver> ();
	
	public void setdriver() {
		tldriver.set(new ChromeDriver());
	}
	
	
	public RemoteWebDriver getdriver() {
		return tldriver.get();
	}
	
	
	@Parameters("language")
	@BeforeMethod
	public void launchBrowser(String language) throws IOException {
		WebDriverManager.chromedriver().setup();
		setdriver();		
	//	driver=new ChromeDriver();
		getdriver().get("http://leaftaps.com/opentaps/control/login");
		getdriver().manage().window().maximize();
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		FileInputStream input = new FileInputStream(new File("./src/main/java/utils/"+language+".properties"));
		prop = new Properties();
		prop.load(input);
	}
	
	@DataProvider(indices=0)
	public String[][] data() throws IOException {
		return ReadExcel.excelfile(excelfile);

	}
	
	  @AfterMethod public void tearDown() {
		  getdriver().close();	  	  
	  }
	 
}
