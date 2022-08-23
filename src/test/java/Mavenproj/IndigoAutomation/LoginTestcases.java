package Mavenproj.IndigoAutomation;
import org.testng.annotations.Test;

import com.google.gson.annotations.Until;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTestcases extends BaseIndigo{
	
	
	@Test (priority = 1)
	// To click on the 'Continue' button without filled the user name
	public void LoginWithoutInsertValue() throws MalformedURLException 
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// To click on the 'Login' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		// To click on the 'Continue' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/btnLogin"));
		btncontinue.click();
		
		// To compare the actual and expected text
		String errormessage = driver.findElement(By.id("com.shireburn.indigo:id/txtUserPlaceHolder")).getText();
		Assert.assertEquals(errormessage, "Username is required.");
		
	}
	
	
	@Test (priority = 2)
	// To click on the 'Continue' button to insert user name and without filled password
	public void LoginWithoutPassword() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// To click on the 'Login' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		// To insert the user name value
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("invalidusername");
		
		// To click on the 'Continue' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
		
		// To click on the 'Continue' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
		WebElement btnconitinuepsw = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
		btnconitinuepsw.click();
		
		// To compare the actual and expected text
		String errormessage = driver.findElementById("com.shireburn.indigo:id/txtPasswordPlaceHolder").getText();
		Assert.assertEquals(errormessage, "Password is required.");
		
		
			
	}
	
	
	@Test (priority = 3)
	// To click on the 'Continue' button to filled the invalid credentials
	public void InvalidCredentials() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// To click on the 'Login' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		// To insert the user name value
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("invalidusername");
		
		// To click on the 'Continue' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
		
		// To insert the password value
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
		WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
		password.sendKeys("password");
		
		// To click on the 'Continue' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
		WebElement btnconitinuepsw = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
		btnconitinuepsw.click();
		
		// To compare the actual and expected text
		String errormessage = driver.findElementById("com.shireburn.indigo:id/txtLgnTitle").getText();
		Assert.assertEquals(errormessage, "Enter your Password");
		
			
	}
	
	
	@Test (priority = 4)
	// To click on the show password icon inside the password field
	public void ViewPassword() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// To click on the 'Login' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		// To insert the user name value
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("mis@narola.email");
		
		// To click on the 'Continue' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();
		
		// To insert the password value
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
		WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
		password.sendKeys("Narol@123!!!");
		
		// To tap on the show password icon to view the password
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/ivPass")));
		WebElement showpsw = driver.findElement(By.id("com.shireburn.indigo:id/ivPass"));
		showpsw.click();
		
		System.out.println("Password shown");
		
	}
	
	
	@Test (priority = 5)
	// To click on the 'Continue' button after filled the valid login credentials
	public void ValidCredentials() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// To click on the 'Login' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")));
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		// To insert the user name value
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etUsername")));
		WebElement username = driver.findElement(By.id("com.shireburn.indigo:id/etUsername"));
		username.sendKeys("mis@narola.email");
		
		// To click on the 'Continue' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textLogin")));
		WebElement btncontinue = driver.findElement(By.id("com.shireburn.indigo:id/textLogin"));
		btncontinue.click();		
		
		// To insert the password value
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etPassword")));
		WebElement password = driver.findElement(By.id("com.shireburn.indigo:id/etPassword"));
		password.sendKeys("Narol@123!!!");
		
		// To click on the 'Submit' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/btnConstraint")));
		WebElement btnsubmit = driver.findElement(By.id("com.shireburn.indigo:id/btnConstraint"));
		btnsubmit.click();
		
		// To click on the 'Agree' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='AGREE']")));
		WebElement btnagree = driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']"));
		btnagree.click();
		
		// To insert the first dial access code
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode1")));
		WebElement firstcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode1"));
		firstcode.sendKeys("1");
		
		// To insert the second dial access code
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode2")));
		WebElement secondcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode2"));
		secondcode.sendKeys("2");
		
		// To insert the third dial access code
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode3")));
		WebElement thirdcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode3"));
		thirdcode.sendKeys("3");
		
		// To insert the fourth dial access code
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/etCode4")));
		WebElement fourthcode = driver.findElement(By.id("com.shireburn.indigo:id/etCode4"));
		fourthcode.sendKeys("4");
		
		// To click on the 'Set access code' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/textSetAccessCode")));
		WebElement btnsetaccess = driver.findElement(By.id("com.shireburn.indigo:id/textSetAccessCode"));
		btnsetaccess.click();
		
		// To click on the 'Allow' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Allow Access']")));
		WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
		btnallow.click();
		
		// To click on the 'Permission access' button
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='While using the app']")));
		WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']"));
		btnpermission.click();
		
		System.out.println("User logged in successfully in the indigo application");
		
	}
		
		
}

