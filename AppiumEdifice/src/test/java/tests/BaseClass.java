package tests;



import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.edifice;

public class BaseClass {
	
    edifice  Edifice;
	AndroidDriver<MobileElement> driver;
   

	
	
    @BeforeClass
	public void setup () throws MalformedURLException {
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("deviceName", "85fb4fa4");
		caps.setCapability("AppWaitActivity", "*");	
		caps.setCapability("appPackage", "com.edifice.ea2");
		caps.setCapability("appActivity", ".SplashActivity");
		driver= new AndroidDriver<MobileElement>(caps);
		Edifice = new edifice(driver);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(140, TimeUnit.SECONDS);
		
	
		
	}
  
	

}

	
		

	


