package Mavenproj.IndigoAutomation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LogoutTestcases extends BaseIndigo{
	
	
	@Test(priority = 1)
	public void Trytologout() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		WebElement username = driver.findElementById("com.shireburn.indigo:id/etUsername");
		username.sendKeys("mis@narola.email");
		
		WebElement btncontinue = driver.findElementById("com.shireburn.indigo:id/textLogin");
		btncontinue.click();
		
		WebElement password = driver.findElementById("com.shireburn.indigo:id/etPassword");
		password.sendKeys("Narol@123!!!");
		
		WebElement btnsubmit = driver.findElementById("com.shireburn.indigo:id/btnConstraint");
		btnsubmit.click();
		
		WebElement btnagree = driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']"));
		btnagree.click();
		
		WebElement firstcode = driver.findElementById("com.shireburn.indigo:id/etCode1");
		firstcode.sendKeys("1");
		WebElement secondcode = driver.findElementById("com.shireburn.indigo:id/etCode2");
		secondcode.sendKeys("2");
		WebElement thirdcode = driver.findElementById("com.shireburn.indigo:id/etCode3");
		thirdcode.sendKeys("3");
		WebElement fourthcode = driver.findElementById("com.shireburn.indigo:id/etCode4");
		fourthcode.sendKeys("4");
		
		WebElement btnsetaccess = driver.findElementById("com.shireburn.indigo:id/textSetAccessCode");
		btnsetaccess.click();
		
		WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
		btnallow.click();
		
		WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']"));
		btnpermission.click();
		
		//Thread.sleep(10000);
		WebElement profile = driver.findElement(By.id("com.shireburn.indigo:id/cvUserImage"));
		profile.click();
		
		WebElement btnconfirm = driver.findElement(By.id("com.shireburn.indigo:id/tvLogout"));
		btnconfirm.click();
		
		WebElement btncancel = driver.findElement(By.xpath("//android.widget.Button[@text='CANCEL']"));
		btncancel.click();
		
		
	}

	
	@Test(priority = 2)
	public void LogoutfromApp() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		WebElement username = driver.findElementById("com.shireburn.indigo:id/etUsername");
		username.sendKeys("mis@narola.email");
		
		WebElement btncontinue = driver.findElementById("com.shireburn.indigo:id/textLogin");
		btncontinue.click();
		
		driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("Narol@123!!!");
		driver.findElementById("com.shireburn.indigo:id/btnConstraint").click();
		
		driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']")).click();
		
		WebElement firstcode = driver.findElementById("com.shireburn.indigo:id/etCode1");
		firstcode.sendKeys("1");
		WebElement secondcode = driver.findElementById("com.shireburn.indigo:id/etCode2");
		secondcode.sendKeys("2");
		WebElement thirdcode = driver.findElementById("com.shireburn.indigo:id/etCode3");
		thirdcode.sendKeys("3");
		WebElement fourthcode = driver.findElementById("com.shireburn.indigo:id/etCode4");
		fourthcode.sendKeys("4");
		
		WebElement btnsetaccess = driver.findElementById("com.shireburn.indigo:id/textSetAccessCode");
		btnsetaccess.click();
		
		WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
		btnallow.click();
		
		WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']"));
		btnpermission.click();
		
		//Thread.sleep(10000);
		WebElement profile = driver.findElement(By.id("com.shireburn.indigo:id/cvUserImage"));
		profile.click();
		
		Thread.sleep(5000);
		WebElement btnconfirm = driver.findElement(By.id("com.shireburn.indigo:id/rlLogout"));
		btnconfirm.click();
		//driver.findElementByXPath("//android.widget.TextView[@text='Logout']").click();
		WebElement btnlogout = driver.findElement(By.xpath("//android.widget.Button[@text='LOGOUT']"));
		btnlogout.click();
		
		System.out.println("User logged out successfully");
	}
	
}
