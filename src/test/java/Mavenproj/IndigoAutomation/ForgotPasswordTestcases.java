package Mavenproj.IndigoAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ForgotPasswordTestcases extends BaseIndigo{
	
	
	@Test(priority = 1)
	public void Trytogetresetpassword() throws MalformedURLException
	{
		
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//First test
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("mis@narola.email");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/txtRecoverPassword")));
		WebElement forgotpassword = driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPassword"));
		forgotpassword.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textRecoverPassword")));
		WebElement getpasswordreset = driver.findElement(By.id("com.shireburn.indigo:id/textRecoverPassword"));
		getpasswordreset.click();
		
		//String errormessage = driver.findElementById("com.shireburn.indigo:id/lblUNPlaceholder").getText();
		//Assert.assertEquals(errormessage, "Username is required.");
		
		System.out.println("Username is required.");
		
	}
	
	@Test(priority=2)
	public void recoverwithinvaliduser() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("mis@narola.email");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/txtRecoverPassword")));
		WebElement forgotpassword = driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPassword"));
		forgotpassword.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text='Username']")));
		WebElement invaliduser = driver.findElement(By.xpath("//android.widget.EditText[@text='Username']"));
		invaliduser.sendKeys("invalidusername");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textRecoverPassword")));
		WebElement getpasswordreset = driver.findElement(By.id("com.shireburn.indigo:id/textRecoverPassword"));
		getpasswordreset.click();
		
		System.out.println("Invalid user");
		
	}
	
	@Test(priority=3)
	public void recoverwithvaliduser() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("mis@narola.email");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/txtRecoverPassword")));
		WebElement forgotpassword = driver.findElement(By.id("com.shireburn.indigo:id/txtRecoverPassword"));
		forgotpassword.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text='Username']")));
		WebElement invaliduser = driver.findElement(By.xpath("//android.widget.EditText[@text='Username']"));
		invaliduser.sendKeys("mis@narola.email");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textRecoverPassword")));
		WebElement getpasswordreset = driver.findElement(By.id("com.shireburn.indigo:id/textRecoverPassword"));
		getpasswordreset.click();
		
		System.out.println("User should get the mail for recover password on registered email address");
	}

}
