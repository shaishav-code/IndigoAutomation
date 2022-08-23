package Mavenproj.IndigoAutomation.login.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage {
	
	AndroidDriver driver;
	
	public WelcomePage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Log in to your Indigo account']")
	private WebElement accountbtn;
	
	public void logbutton()
	{
		accountbtn.click();
	}

}
