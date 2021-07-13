package serviceNow.CommonUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseSeleniumClass extends CommonUtilities{
	
	@Parameters({"url","browserName"})
	@BeforeMethod
	public void setUp(String url,String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
			 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			  
			 capabilities.setCapability("ignoreZoomSetting",true);
			 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			 capabilities.setCapability(InternetExplorerDriver.
			   INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			driver = new InternetExplorerDriver(capabilities);
		default:
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();	
	}

	

}
