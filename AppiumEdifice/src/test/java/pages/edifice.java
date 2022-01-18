package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class edifice {
	AndroidDriver<MobileElement> driver ;
	AndroidElement bleAllow;
	AndroidElement bleDeny;
	AndroidElement ButtonNext1;		
	AndroidElement Ea2App;
	AndroidElement ButtonQuitChooseSensor;
	AndroidElement ButtonSenzor;
	AndroidElement NetworkPassword;
	AndroidElement ButtonConfirm;
	AndroidElement ButtonDone;
	AndroidElement ExitConfirm;
	AndroidElement ButtonRefresh;
	AndroidElement CancelButton;
	AndroidElement TryAgainButton;
	AndroidElement ButtonExit;
	AndroidElement AddNetwork;
	AndroidElement AddNetworkCancel;
	AndroidElement NetworkName;
	AndroidElement AdvancedOptions;
	AndroidElement ProxyDropDownMenu;
	AndroidElement ProxyAuto;
	AndroidElement IPSettingsDropDownMenu;
	AndroidElement StaticIPSettings;
	AndroidElement SecurityDropDownMenu;
	AndroidElement SecurityWEP;
	AndroidElement SecurityWPA;
	AndroidElement Security8021x;
	AndroidElement SecurityPasswordInputField;
	AndroidElement ChooseAnotherSenzor;
	AndroidElement NetworkExit;
	AndroidElement PasswordInput;
	AndroidElement QuitCancel;
	AndroidElement ShowPassword;
	AndroidElement IPAddress;
	AndroidElement PasswordCancle;
	AndroidElement CACertificate;
	AndroidElement Phase2Authentication;
	AndroidElement AnonymousIdentity;
	AndroidElement Identety;
	AndroidElement EAPMethodPassword;
	AndroidElement UserCertificate;
	AndroidElement Provisioning;
	AndroidElement EAPDropDownMenu;
	AndroidElement TLS;
	AndroidElement TTLS;
	AndroidElement FAST;
	AndroidElement PWD;
	AndroidElement Geteway;
	AndroidElement NetworkPrefixLength;
	AndroidElement DNS1;
	AndroidElement DNS2;
	AndroidElement ConfirmButtonAdvancedOptions;
	AndroidElement PACScript;
	AndroidElement PACChooseFile;
	AndroidElement IPStaticCancel;

	
	

	
	
	

	public edifice(AndroidDriver<MobileElement> driver) {
		super();
		this.driver = driver;

}
	
	
	
	
	public AndroidElement getTLS() {
		return (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
	}
	
	




	public AndroidElement getIPStaticCancel() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/cancelButton"));
	}




	public AndroidElement getPACScript() {
		return (AndroidElement) driver.findElement(By.xpath("idget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView[1]"));
	}




	public AndroidElement getPACChooseFile() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/pacScript"));
	}




	public AndroidElement getTTLS() {
		return (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
	}




	public AndroidElement getFAST() {
		return (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
	}




	public AndroidElement getPWD() {
		return (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
	}
	




	public AndroidElement getEAPDropDownMenu() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/spinnerEap"));
	}




	public AndroidElement getCACertificate() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/certificateSpinner"));
	}




	public AndroidElement getPhase2Authentication() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/phase2Spinner"));
	}




	public AndroidElement getAnonymousIdentity() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/anonymousIdentityEditText"));
	}




	public AndroidElement getIdentety() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/identityEditText"));
	}




	public AndroidElement getEAPMethodPassword() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/networkPassword"));
	}




	public AndroidElement getUserCertificate() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/userCertificateSpinner"));
	}




	public AndroidElement getProvisioning() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/provisioningEditText"));
	}




	public AndroidElement getChooseAnotherSenzor() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/chooseAnotherSensor"));

	}

	public AndroidElement getIPAddress() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/ipAddressEditText"));
	}
	
	



	public AndroidElement getGeteway() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/gatewayEditText"));
	}




	public AndroidElement getNetworkPrefixLength() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/networkPrefixLengthEditText"));
	}




	public AndroidElement getDNS1() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/dns1EditText"));
	}




	public AndroidElement getDNS2() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/dns2EditText"));
	}
	




	public AndroidElement getConfirmButtonAdvancedOptions() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/confirmButton"));
	}




	public AndroidElement getPasswordCancle() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/buttonCancel"));
	}



	public AndroidElement getShowPassword() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/hidePassword"));
	}



	public AndroidElement getQuitCancel() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/cancel"));
	}



	public AndroidElement getPasswordInput() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/passwordEditText"));
	}



	public AndroidElement getAdvancedOptions() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/advancedOptionsLayout"));
	}
	

	public AndroidElement getNetworkExit() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/buttonExit"));
	}



	public AndroidElement getProxyDropDownMenu() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/proxySpinner"));
	}

	public AndroidElement getProxyAuto() {
		return (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
	}

	public AndroidElement getBleAllow() {
		return (AndroidElement) driver.findElement(By.id("android:id/button1"));
	}

	public AndroidElement getNetworkName() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/networkNameEditText"));
	}
	
	
	


	public AndroidElement getSecurityDropDownMenu() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/customSpinner"));
	}

	public AndroidElement getSecurityWEP() {
		return  (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
	}

	public AndroidElement getSecurityWPA() {
		return  (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
	}

	public AndroidElement getSecurity8021x() {
		return (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
	}

	public AndroidElement getSecurityPasswordInputField() {
		return(AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/passwordEditText"));
	}

	public AndroidElement getIPSettingsDropDownMenu() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/ipSettingsSpinner"));
	}

	public AndroidElement getStaticIPSettings() {
		return (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
	}

	public AndroidElement getAddNetworkCancel() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/buttonCancel"));
	}

	public AndroidElement getAddNetwork() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/addButtonLinearLayout"));
	}

	public AndroidElement getBleDeny() {
		return (AndroidElement) driver.findElement(By.id("android:id/button2"));
	}



	public AndroidElement getButtonNext1() {
		return (AndroidElement) driver.findElementById("com.edifice.ea2:id/btnNext");
	}



	public AndroidElement getEa2App() {
		return (AndroidElement) driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"edificeApp\"]");
	}



	public AndroidElement getButtonSenzor() {
		return (AndroidElement) driver.findElementById("com.edifice.ea2:id/sensor_item_layout");
	}



	public AndroidElement getNetworkPassword() {
		return (AndroidElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout");
	}



	public AndroidElement getButtonConfirm() {
		return (AndroidElement) driver.findElementById("com.edifice.ea2:id/buttonConfirm");
	}



	public AndroidElement getButtonDone() {
		return (AndroidElement) driver.findElementById("com.edifice.ea2:id/doneButton");
	}



	public AndroidElement getExitConfirm() {
		return (AndroidElement) driver.findElementById("com.edifice.ea2:id/confirm");
	}



	public AndroidElement getButtonRefresh() {
		return (AndroidElement) driver.findElementById("com.edifice.ea2:id/refreshBtn");
	}



	public AndroidElement getCancelButton() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/cancel_button"));
	}



	public AndroidElement getTryAgainButton() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/tryAgainBtn"));
	}
	public AndroidElement getButtonExit() {
		return (AndroidElement) driver.findElement(By.id("com.edifice.ea2:id/btnExit"));
	}
	
	
	public void BleAllowClick() {
		this.getBleAllow().click();
		
	}
	public void BleDenyClick() {
		this.getBleDeny().click();
	}
	public void ButtonNextClick() {
		this.getButtonNext1().click();
	}
	public void ButtonTryAgainClick() {
		this.getTryAgainButton().click();
	}
	public void ButtonCancelClick() {
		this.getCancelButton().click();
	}
	public void ButtonRefreshClick() {
		this.getButtonRefresh().click();
	}
	public void ButtonExitConfirmClick() {
		this.getExitConfirm().click();
	}
	public void ButtonDoneClick() {
		this.getButtonDone().click();
	}
	public void ButtonConfirmClick() {
		this.getButtonConfirm().click();
	}
	public void PasswordInputField() {
	this.getNetworkPassword().click();
	}
	//sendKeys("Fa5R9sE79cwzUpNK");
	public void PasswordInputPassword() {
		this.getPasswordInput().sendKeys("Fa5R9sE79cwzUpNK");
	}
	public void SecurityPasswordInput() {
		this.getSecurityPasswordInputField().sendKeys("Fa5R9sE79cwzUpNK");
	}
    public void PasswordInputInvalidPassword() {
	this.getPasswordInput().sendKeys("aaasaafafafad");
    }
	public void IpAddressInput() {
		this.getIPAddress().sendKeys("192.168.1.128");
	}
	public void GatewayInput() {
		this.getGeteway().sendKeys("192.168.1.1");
	}
	public void NetworkPrefixLengthInput() {
		this.getNetworkPrefixLength().sendKeys("24");
	}
	public void DNS1Input() {
		this.getDNS1().sendKeys("8.8.8.8");
	}
	public void DNS2Input() {
		this.getDNS2().sendKeys("8.8.4.4");
	}
	public void AdvancedOptionsConfirmButtonClick() {
		this.getConfirmButtonAdvancedOptions().click();
	}
	public void SenzorButtonClick() {
		this.getButtonSenzor().click();
	}
	public void ea2Start() {
		this.getEa2App().click();
		
	}
	public void ButtonExitClick() {
		this.getButtonExit().click();
	}
	public void ButtonAddNetworkClick() {
		this.getAddNetwork().click();
	}
	public void AddNetworkCancelButtonClick() {
		this.getAddNetworkCancel().click();
	}
	public void NetworkNameInputField() {
		this.getNetworkName().sendKeys("MCD");
		
	}
	public void ButtonAdvancedOptionsCLick() {
		this.getAdvancedOptions().click();
	}
	public void ProxyDropDownClick() {
		this.getProxyDropDownMenu().click();
	}
	public void ProxyAutoClick() {
		this.getProxyAuto().click();
	}
	public void IPDropDownClick() {
		this.getIPSettingsDropDownMenu().click();
	}
	public void IPStaticClick() {
		this.getStaticIPSettings().click();
	}
	public void SecurityWEPClick() {
		this.getSecurityWEP().click();
	}
	public void SecurityWPAClick() {
		this.getSecurityWPA().click();
	}
	public void SecurityDropDownClick() {
		this.getSecurityDropDownMenu().click();
	}
	public void Security8021xClick() {
		this.getSecurity8021x().click();
	}
	public void SecurityPasswordInputField() {
		this.getSecurityPasswordInputField().sendKeys("gagdagf");
	}
	public void ButtonChooseAnotherSensorClick() {
		this.getChooseAnotherSenzor().click();
	}
	public void QuitCancelClick() {
		this.getQuitCancel().click();
	}
	public void ButtonNetworkExitClick() {
		this.getNetworkExit().click();
	}
	public void ButtonShowPassword() {
		this.getShowPassword().click();
	}
    public void ButtonTLSClick() {
	this.getTLS().click();
    }
    public void ButtonTTLSClick() {
    	this.getTTLS().click();
        }
    public void ButtonFastClick() {
    	this.getFAST().click();
        }
    public void ButtonPWDClick() {
    	this.getPWD().click();
        }
    public void EAPDropDownMenuClick() {
    	this.getEAPDropDownMenu().click();
        }
    public void ButtonPasswordCancel() {
    	this.getPasswordCancle().click();
        }
    public void PACScriptChooseFile() {
		this.getPACChooseFile().click();
	}
    public void PACScriptClick() {
		this.getPACScript().click();
	}
    public void StaticCancelButton() {
		this.getIPStaticCancel().click();
	}
	 public void socketOnOFF() throws InterruptedException {		
			System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.google.com");
			driver.navigate().to("http://192.168.33.88/");		
			WebElement password = driver.findElement(By.xpath("//*[@id=\"lForm\"]/div[3]/input[1]"));
			password.click();
			password.sendKeys("1");
			Thread.sleep(2000);
			WebElement submit= driver.findElement(By.xpath("//*[@id=\"lForm\"]/div[3]/input[2]"));
			submit.click();
			Thread.sleep(2000);
			WebElement socket1=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/a"));
			socket1.click();
			Thread.sleep(2000);
			WebElement socketonoff=driver.findElement(By.id("sbtn"));
			socketonoff.click();
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("sbtn"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu\"]/div[9]/a"))).click();
			Thread.sleep(2000);
			driver.close();

		

	}
	 public void socketOnOFFOnces() throws InterruptedException {		
			System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.google.com");
			driver.navigate().to("http://192.168.33.88/");		
			WebElement password = driver.findElement(By.xpath("//*[@id=\"lForm\"]/div[3]/input[1]"));
			password.click();
			password.sendKeys("1");
			Thread.sleep(2000);
			WebElement submit= driver.findElement(By.xpath("//*[@id=\"lForm\"]/div[3]/input[2]"));
			submit.click();
			Thread.sleep(2000);
			WebElement socket1=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/a"));
			socket1.click();
			Thread.sleep(2000);
			WebElement socketonoff=driver.findElement(By.id("sbtn"));
			socketonoff.click();
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu\"]/div[9]/a"))).click();
			Thread.sleep(2000);
			driver.close();

		

	}


		
	}

