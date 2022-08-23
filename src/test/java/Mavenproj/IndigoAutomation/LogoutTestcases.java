package Mavenproj.IndigoAutomation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LogoutTestcases extends BaseIndigo{
	
	
	@Test(priority = 1)
	public void Trytologout() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/rlLogout")));
		WebElement btnconfirm = driver.findElement(By.id("com.shireburn.indigo:id/rlLogout"));
		btnconfirm.click();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='CANCEL']")));
		WebElement btncancel = driver.findElement(By.xpath("//android.widget.Button[@text='CANCEL']"));
		btncancel.click();
		
			
		
	}

	
	@Test(priority = 2)
	public void LogoutfromApp() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
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
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shireburn.indigo:id/rlLogout")));
		WebElement btnconfirm = driver.findElement(By.id("com.shireburn.indigo:id/rlLogout"));
		btnconfirm.click();
				
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='LOGOUT']")));
		WebElement btnlogout = driver.findElement(By.xpath("//android.widget.Button[@text='LOGOUT']"));
		btnlogout.click();
				
		System.out.println("User logged out successfully");
	}
	
}
