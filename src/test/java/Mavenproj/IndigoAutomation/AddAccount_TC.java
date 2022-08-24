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

public class AddAccount_TC extends BaseIndigo{
	
	@Test(priority = 1)
	public void trytoaddwithoutusername() throws MalformedURLException
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
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
		WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
		password.sendKeys("Narol@123!!!");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
		WebElement btnsubmit = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
		btnsubmit.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='AGREE']")));
		WebElement btnagree = driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']"));
		btnagree.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode1")));
		WebElement firstcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode1"));
		firstcode.sendKeys("1");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode2")));
		WebElement secondcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode2"));
		secondcode.sendKeys("2");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode3")));
		WebElement thirdcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode3"));
		thirdcode.sendKeys("3");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode4")));
		WebElement fourthcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode4"));
		fourthcode.sendKeys("4");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textSetAccessCode")));
		WebElement btnsetaccess = driver.findElement(By.id("com.shireburn.indigo:id/textSetAccessCode"));
		btnsetaccess.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Allow Access']")));
		WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
		btnallow.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='While using the app']")));
		WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']"));
		btnpermission.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/cvUserImage")));
		WebElement profile = driver.findElement(By.id("com.shireburn.indigo:id/cvUserImage"));
		profile.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/tvAddAccount")));
		WebElement addaccount = driver.findElement(By.id("com.shireburn.indigo:id/tvAddAccount"));
		addaccount.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue2 = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue2.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/txtUserPlaceHolder")));
		String errormessage = driver.findElement(By.id("com.shireburn.indigo:id/txtUserPlaceHolder")).getText();
		Assert.assertEquals(errormessage, "Username is required.");
		
		
	}
	
	@Test(priority = 2)
	public void trytoaddwithoutpassword() throws MalformedURLException
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
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
		WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
		password.sendKeys("Narol@123!!!");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
		WebElement btnsubmit = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
		btnsubmit.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='AGREE']")));
		WebElement btnagree = driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']"));
		btnagree.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode1")));
		WebElement firstcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode1"));
		firstcode.sendKeys("1");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode2")));
		WebElement secondcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode2"));
		secondcode.sendKeys("2");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode3")));
		WebElement thirdcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode3"));
		thirdcode.sendKeys("3");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode4")));
		WebElement fourthcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode4"));
		fourthcode.sendKeys("4");
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textSetAccessCode")));
		WebElement btnsetaccess = driver.findElement(By.id("com.shireburn.indigo:id/textSetAccessCode"));
		btnsetaccess.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Allow Access']")));
		WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
		btnallow.click();
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='While using the app']")));
		WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']"));
		btnpermission.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/cvUserImage")));
		WebElement profile = driver.findElement(By.id("com.shireburn.indigo:id/cvUserImage"));
		profile.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/tvUserEmail")));
		String showusername = driver.findElement(By.id("com.shireburn.indigo:id/tvUserEmail")).getText();
		Assert.assertEquals(showusername, "mis@narola.email");
		
					
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/tvAddAccount")));
		WebElement addaccount = driver.findElement(By.id("com.shireburn.indigo:id/tvAddAccount"));
		addaccount.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text='Username']")));
		WebElement seconduser = driver.findElement(By.xpath("//android.widget.EditText[@text='Username']"));
		seconduser.sendKeys("pdg@narola.email");
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue2 = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue2.click();		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
		WebElement btnsubmit2 = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
		btnsubmit2.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/txtPasswordPlaceHolder")));
		String errormessage = driver.findElementById("com.shireburn.indigo:id/txtPasswordPlaceHolder").getText();
		Assert.assertEquals(errormessage, "Password is required.");
		
	}
	
	@Test(priority = 3)
	public void Addaccount() throws MalformedURLException
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
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
				WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
				password.sendKeys("Narol@123!!!");
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
				WebElement btnsubmit = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
				btnsubmit.click();
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='AGREE']")));
				WebElement btnagree = driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']"));
				btnagree.click();
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode1")));
				WebElement firstcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode1"));
				firstcode.sendKeys("1");
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode2")));
				WebElement secondcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode2"));
				secondcode.sendKeys("2");
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode3")));
				WebElement thirdcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode3"));
				thirdcode.sendKeys("3");
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode4")));
				WebElement fourthcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode4"));
				fourthcode.sendKeys("4");
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textSetAccessCode")));
				WebElement btnsetaccess = driver.findElement(By.id("com.shireburn.indigo:id/textSetAccessCode"));
				btnsetaccess.click();
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Allow Access']")));
				WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
				btnallow.click();
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='While using the app']")));
				WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']"));
				btnpermission.click();
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/cvUserImage")));
				WebElement profile = driver.findElement(By.id("com.shireburn.indigo:id/cvUserImage"));
				profile.click();
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/tvUserEmail")));
				String showusername = driver.findElement(By.id("com.shireburn.indigo:id/tvUserEmail")).getText();
				Assert.assertEquals(showusername, "mis@narola.email");
				
							
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/tvAddAccount")));
				WebElement addaccount = driver.findElement(By.id("com.shireburn.indigo:id/tvAddAccount"));
				addaccount.click();
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[@text='Username']")));
				WebElement seconduser = driver.findElement(By.xpath("//android.widget.EditText[@text='Username']"));
				seconduser.sendKeys("pdg@narola.email");
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
				WebElement btncontinue2 = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
				btncontinue2.click();		
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
				WebElement newpassword = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
				newpassword.sendKeys("Check@123");
				
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
				WebElement btnsubmit2 = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
				btnsubmit2.click();
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/cvUserImage")));
				WebElement newprofile = driver.findElement(By.id("com.shireburn.indigo:id/cvUserImage"));
				newprofile.click();
				
				new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='pdg@narola.email']")));
				String shownewusername = driver.findElement(By.xpath("//android.widget.TextView[@text='pdg@narola.email']")).getText();
				Assert.assertEquals(shownewusername, "pdg@narola.email");
				
				
		
	}

}
