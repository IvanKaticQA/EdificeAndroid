package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EdificeTestAndroid extends BaseClass{
	
	@Test (priority = 0)
	public void BluDeny() {
	
	Edifice.BleDenyClick();
	assertEquals(true, Edifice.getBleAllow().isDisplayed());
		
	}
	@Test (priority = 1)
	public void BluDialog() throws InterruptedException {
		
		
		assertEquals(true, Edifice.getBleAllow().isDisplayed());
	}
	@Test (priority = 2)
	public void BluAllow() throws InterruptedException {
		
		Edifice.BleAllowClick();
		Thread.sleep(2000);
		Edifice.BleAllowClick();
		assertEquals(true, Edifice.getButtonNext1().isDisplayed());
	}
	@Test (priority = 5)
	public void Screen_Step_1() throws InterruptedException{
		
		Edifice.ButtonNextClick();
		assertEquals(true, Edifice.getButtonExit().isDisplayed());
		Edifice.ButtonExitClick();
		Edifice.ButtonExitConfirmClick();
	}
	
	@Test (priority = 6)
	public void Choose_a_sensor() throws InterruptedException{
		Edifice.socketOnOFF();
		Edifice.ea2Start();
		//driver.launchApp(); //ne pronalazi preko resetApp ni preko LaunchApp potrebno je vrv izaci i kliknuti na edifice app i tako pokrenuti.
		Thread.sleep(20000);
		Edifice.ButtonNextClick();
		//Thread.sleep(45000);
		Edifice.ButtonRefreshClick();
		Edifice.SenzorButtonClick();
		assertEquals(true, Edifice.getButtonNext1().isDisplayed());
	}
	
	@Test (priority = 10)
	public void Screen_Step_2() throws InterruptedException{

		assertEquals(true, Edifice.getButtonNext1().isDisplayed());
	}
	@Test (priority = 15)
	public void Screen_Select_a_Network() throws InterruptedException{
		
	
		Edifice.ButtonNextClick();
		assertEquals(true, Edifice.getNetworkExit().isDisplayed());
	
	}
	
	@Test (priority = 20)
	public void Choose_a_network() throws InterruptedException{
	
	Edifice.PasswordInputField();
	assertEquals(true, Edifice.getShowPassword().isDisplayed());
	}
	@Test (priority = 21)
	public void Choose_a_network_Password_Show() throws InterruptedException{
		Edifice.PasswordInputPassword();
		Edifice.ButtonShowPassword();
		//Thread.sleep(1000);
		//Edifice.ButtonShowPassword();
		assertEquals(true, Edifice.getPasswordInput().isDisplayed());
	}
	@Test (priority = 22)
	public void Choose_a_network_Password_Cancel() throws InterruptedException{
		
		Edifice.ButtonPasswordCancel();
		assertEquals(true, Edifice.getAddNetwork().isDisplayed());
	}
	@Test (priority = 23)
	public void Choose_a_network_Incorrect_Password() throws InterruptedException{
		
		Edifice.PasswordInputField();
		Edifice.PasswordInputInvalidPassword();
		Edifice.ButtonConfirmClick();
		assertEquals(true, Edifice.getTryAgainButton().isDisplayed());
	}
	@Test (priority = 24)
	public void Choose_a_network_Connection_Failed() throws InterruptedException{
		
		
		assertEquals(true, Edifice.getTryAgainButton().isDisplayed());
	}
	@Test (priority = 25)
	public void Choose_a_network_Connection_Failed_Back() throws InterruptedException{
		
		Edifice.ButtonTryAgainClick();
		assertEquals(true, Edifice.getAddNetwork().isDisplayed());
	}
	@Test (priority = 26)
	public void Choose_a_network_Connection_Correct_Password() throws InterruptedException{
		
		Edifice.PasswordInputPassword();
		Edifice.ButtonConfirmClick();
		assertEquals(true, Edifice.getButtonDone().isDisplayed());
	}
	@Test (priority = 27)
	public void Successful_connection() throws InterruptedException{
		
		assertEquals(true, Edifice.getChooseAnotherSenzor().isDisplayed());
	}
	
	@Test (priority = 30)
	public void Button_Quit_Screen_Choose_a_sensor() throws InterruptedException{
		driver.launchApp();
		//Edifice.BleAllowClick();
		Edifice.ButtonNextClick();
		Edifice.ButtonExitClick();
		assertEquals(true, Edifice.getExitConfirm().isDisplayed());
		
		
	}
	@Test (priority = 32)
	public void Button_Quit_Screen_Choose_a_sensor_Quit() throws InterruptedException{
		
		
		Edifice.ButtonExitConfirmClick();
		assertEquals(true, Edifice.getEa2App().isDisplayed());
		
	}
	
	@Test (priority = 34)
	public void Button_Quit_Screen_Choose_a_sensor_Cancel() throws InterruptedException{
		Edifice.ea2Start();
		//Edifice.BleAllowClick();
		//Edifice.BleAllowClick();
		Edifice.ButtonNextClick();
		Edifice.ButtonExitClick();
		Edifice.QuitCancelClick();
		assertEquals(true, Edifice.getButtonExit().isDisplayed());
		
		
	}
	
	@Test (priority =42 )
	public void Button_Quit_Screen_Select_Network() throws InterruptedException{
		
		
		Edifice.ButtonNextClick();
		Edifice.ButtonNetworkExitClick();
		assertEquals(true, Edifice.getExitConfirm().isDisplayed());
		
	}
	@Test (priority =43 )
	public void Button_Quit_Screen_Select_Network_Cancel() throws InterruptedException{
		
		
		Edifice.QuitCancelClick();
		assertEquals(true, Edifice.getNetworkExit().isDisplayed());
	}
	@Test (priority =44 )
	public void Button_Quit_Screen_Select_Network_Quit() throws InterruptedException{
		
		
		Edifice.ButtonNetworkExitClick();
		Edifice.ButtonExitConfirmClick();
		assertEquals(true, Edifice.getEa2App().isDisplayed());
	}
	@Test (priority = 36)
	public void Choose_a_sensor_Refresh() throws InterruptedException{
		
		
		
		Edifice.ButtonRefreshClick();
		assertEquals(true, Edifice.getButtonExit().isDisplayed());
	}
	@Test (priority = 35)
	public void Choose_a_sensor_No_Results() throws InterruptedException{
	
		Edifice.socketOnOFF();
		assertEquals(true, Edifice.getButtonRefresh().isDisplayed());
		
	}
	@Test (priority = 37)
	public void Dialog_Connection_Cancel() throws InterruptedException{
		
		Edifice.SenzorButtonClick();
		Edifice.ButtonCancelClick();
	}
	@Test (priority = 38)
	public void Connecting_to_a_sensor_failed() throws InterruptedException{
		
	    
		Edifice.socketOnOFFOnces();
		Edifice.SenzorButtonClick();
		assertEquals(true, Edifice.getTryAgainButton().isDisplayed());
	
	}
	@Test (priority = 39)
	public void Connecting_to_a_sensor_back() throws InterruptedException{
	
		Edifice.socketOnOFFOnces();
		Thread.sleep(35000);
		Edifice.ButtonTryAgainClick();
		Edifice.ButtonRefreshClick();
		Edifice.SenzorButtonClick();
		assertEquals(true, Edifice.getButtonNext1().isDisplayed());

	}
	@Test (priority = 40)
	public void Connecting_to_a_sensor_Success() throws InterruptedException{
	
		
		
		assertEquals(true, Edifice.getButtonNext1().isDisplayed());
		

	}
	@Test (priority = 90)
	public void Add_Network() throws InterruptedException{
		
	    Edifice.ea2Start();
	    Edifice.ButtonNextClick();
	    Edifice.SenzorButtonClick();
		Edifice.ButtonNextClick();
		Edifice.ButtonAddNetworkClick();
		assertEquals(true, Edifice.getSecurityDropDownMenu().isDisplayed());

	}


	@Test (priority = 95)
	public void Add_Network_Cancel() throws InterruptedException{
	
		Edifice.AddNetworkCancelButtonClick();
		assertEquals(true, Edifice.getAddNetwork().isDisplayed());
		

	}
	@Test (priority = 100)
	public void Add_Network_Confirm() throws InterruptedException{
	
		Edifice.ButtonAddNetworkClick();
		Edifice.NetworkNameInputField();
		Edifice.ButtonConfirmClick();
		//Edifice.socketOnOFF();
		assertEquals(true, Edifice.getTryAgainButton().isDisplayed());

	}
	@Test (priority = 105)
	public void Add_Network_AdvancedSettings_Proxy_None() throws InterruptedException{
		//Thread.sleep(10000);
		Edifice.ButtonTryAgainClick();
	    //Edifice.ButtonRefreshClick();
	   // Edifice.SenzorButtonClick();
	    
	    //Edifice.ButtonNextClick();
		//Edifice.ButtonTryAgainClick();
		Edifice.ButtonAddNetworkClick();
		Edifice.NetworkNameInputField();
		Edifice.ButtonAdvancedOptionsCLick();
		Edifice.AdvancedOptionsConfirmButtonClick();
		Edifice.ButtonConfirmClick();
		assertEquals(true, Edifice.getTryAgainButton().isDisplayed());
		

	}
	@Test (priority = 110)
	public void Add_Network_AdvancedSettings_Proxy_Auto() throws InterruptedException{
	
		
		Edifice.ButtonTryAgainClick();
		Edifice.ButtonAddNetworkClick();
		Edifice.NetworkNameInputField();
		Edifice.ButtonAdvancedOptionsCLick();
		Edifice.ProxyDropDownClick();
		Edifice.ProxyAutoClick();
		Edifice.PACScriptChooseFile();
		//Edifice.PACScriptClick();
		Thread.sleep(10000);
		Edifice.AdvancedOptionsConfirmButtonClick();
		Edifice.ButtonConfirmClick();
		assertEquals(true, Edifice.getTryAgainButton().isDisplayed());

	}
	@Test (priority = 115)
	public void Add_Network_AdvancedSettings_IP_Static() throws InterruptedException{
	
		Edifice.ButtonTryAgainClick();
		Edifice.ButtonAddNetworkClick();
		Edifice.NetworkNameInputField();
		Edifice.ButtonAdvancedOptionsCLick();
		Edifice.IPDropDownClick();
		Edifice.IPStaticClick();
		assertEquals(true, Edifice.getIPAddress().isDisplayed());
		
		
		

	}
	@Test (priority = 120)
	public void Add_Network_Security_WEP() throws InterruptedException{
		//Edifice.AddNetworkCancelButtonClick();
	
		Edifice.StaticCancelButton();
		Edifice.SecurityDropDownClick();
		Edifice.SecurityWEPClick();
		Edifice.NetworkNameInputField();
		Edifice.PasswordInputInvalidPassword();
		Edifice.ButtonConfirmClick();
		
		
		
		

	}
	@Test (priority = 125)
	public void Add_Network_Security_WPA_WPA2() throws InterruptedException{
	
		Edifice.ButtonTryAgainClick();
		Edifice.ButtonAddNetworkClick();
		Edifice.NetworkNameInputField();
		Edifice.SecurityDropDownClick();
		Edifice.SecurityWPAClick();
		Edifice.PasswordInputInvalidPassword();
		Edifice.ButtonConfirmClick();
		
		
		

	}
	@Test (priority = 130)
	public void Add_Network_Secuirty_802_1x() throws InterruptedException{
	
		Edifice.ButtonTryAgainClick();
		Edifice.ButtonAddNetworkClick();
		Edifice.NetworkNameInputField();
		Edifice.SecurityDropDownClick();
		Edifice.Security8021xClick();
		Edifice.socketOnOFF();
		
		

	}
	@Test (priority = 132)
	public void Add_Network_Secuirty_802_1x_PEAP() throws InterruptedException{
		
	    Thread.sleep(10000);
		assertEquals(true, Edifice.getPhase2Authentication().isDisplayed());
		assertEquals(true, Edifice.getCACertificate().isDisplayed());
		assertEquals(true, Edifice.getAnonymousIdentity().isDisplayed());
		assertEquals(true, Edifice.getIdentety().isDisplayed());
		assertEquals(true, Edifice.getEAPMethodPassword().isDisplayed());
	}
	@Test (priority = 134)
	public void Add_Network_Secuirty_802_1x_TLS() throws InterruptedException{
		Thread.sleep(10000);
		Edifice.EAPDropDownMenuClick();
		Edifice.ButtonTLSClick();
		assertEquals(true, Edifice.getCACertificate().isDisplayed());
		assertEquals(true, Edifice.getIdentety().isDisplayed());
		assertEquals(true, Edifice.getUserCertificate().isDisplayed());
	}
	@Test (priority = 135)
	public void Add_Network_Secuirty_802_1x_TTLS() throws InterruptedException{
		Thread.sleep(10000);
		Edifice.EAPDropDownMenuClick();
		Edifice.ButtonTTLSClick();
		assertEquals(true, Edifice.getPhase2Authentication().isDisplayed());
		assertEquals(true, Edifice.getCACertificate().isDisplayed());
		assertEquals(true, Edifice.getAnonymousIdentity().isDisplayed());
		assertEquals(true, Edifice.getIdentety().isDisplayed());
		assertEquals(true, Edifice.getEAPMethodPassword().isDisplayed());
	}
	@Test (priority = 136)
	public void Add_Network_Secuirty_802_1x_FAST() throws InterruptedException{
		Thread.sleep(10000);
		Edifice.EAPDropDownMenuClick();
		Edifice.ButtonFastClick();
		assertEquals(true, Edifice.getPhase2Authentication().isDisplayed());
		assertEquals(true, Edifice.getCACertificate().isDisplayed());
		assertEquals(true, Edifice.getProvisioning().isDisplayed());
		assertEquals(true, Edifice.getIdentety().isDisplayed());
		assertEquals(true, Edifice.getEAPMethodPassword().isDisplayed());
	}
	@Test (priority = 137)
	public void Add_Network_Secuirty_802_1x_PWD() throws InterruptedException{
		Thread.sleep(10000);
		Edifice.EAPDropDownMenuClick();
		Edifice.ButtonPWDClick();
		assertEquals(true, Edifice.getIdentety().isDisplayed());
		assertEquals(true, Edifice.getEAPMethodPassword().isDisplayed());
	}
	@Test (priority = 107)
	public void Add_Network_Advenced_Options() throws InterruptedException{
		
		//Edifice.ButtonConfirmClick();
	   Edifice.ButtonTryAgainClick();
	   Edifice.ButtonAddNetworkClick();
	   Edifice.NetworkNameInputField();
	   Edifice.ButtonAdvancedOptionsCLick();
	   Edifice.IPDropDownClick();
	   Edifice.IPStaticClick();
	   Edifice.IpAddressInput();
	   Edifice.GatewayInput();
	   Edifice.NetworkPrefixLengthInput();
	   Edifice.DNS1Input();
	   Edifice.DNS2Input();
	   Edifice.AdvancedOptionsConfirmButtonClick();
	   Edifice.ButtonConfirmClick();
	   assertEquals(true, Edifice.getTryAgainButton().isDisplayed());
	   
	
		
	}
	@Test (priority = 36)
	public void Device_Name() throws InterruptedException{
		Edifice.ButtonRefreshClick();
		Edifice.ButtonRefreshClick();
		assertEquals(true, Edifice.getButtonSenzor().isDisplayed());
		
		
	}
	@Test (priority = 28)
	public void Choosing_another_senzor() throws InterruptedException{
		
		
		Edifice.ButtonChooseAnotherSensorClick();
		Edifice.SenzorButtonClick();
		
	}
	@Test (priority = 145)
	public void Choosing_another_network_networkList() throws InterruptedException{
		
		//Edifice.socketOnOFF();
		Thread.sleep(15000);
		Edifice.ButtonPasswordCancel();
		Edifice.ButtonTryAgainClick();
		//Edifice.ButtonNextClick();
		//Edifice.ButtonRefreshClick();
		//Edifice.ButtonRefreshClick();
		Edifice.SenzorButtonClick();
		Edifice.ButtonNextClick();
		Edifice.PasswordInputPassword();
		Edifice.ButtonConfirmClick();
		Edifice.ButtonChooseAnotherSensorClick();
		Edifice.SenzorButtonClick();
		Edifice.ButtonNextClick();
	}
	
	
	

	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {
		//Edifice.socketOnOFF();
		//driver.launchApp();
		//if (Edifice.getBleAllow().isDisplayed()) {
			//Edifice.BleAllowClick(); 
		//}else {
			//  System.out.println("Nastavak sa testiranjem");
		//}
			
		}
	}

