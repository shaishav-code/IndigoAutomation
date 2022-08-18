package Mavenproj.IndigoAutomation;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Mavenproj.IndigoAutomation.login.android.WelcomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTestcases extends BaseIndigo{
	
	
	@Test (priority = 1)
	public void LoginWithoutInsertValue() throws MalformedURLException 
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WelcomePage welcomepage = new WelcomePage(driver);
		//welcomepage.logbutton();
		
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		WebElement btncontinue = driver.findElementById("com.shireburn.indigo:id/textLogin");
		btncontinue.click();
		
		//System.out.println(driver.findElement(By.id("com.shireburn.indigo:id/txtUserPlaceHolder")).getText());
		String errormessage = driver.findElement(By.id("com.shireburn.indigo:id/txtUserPlaceHolder")).getText();
		Assert.assertEquals(errormessage, "Username is required.");
		
	}
	
	
	@Test (priority = 2)
	public void LoginWithoutPassword() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		//driver.findElementByXPath("//android.widget.TextView[@Text='Log in to your Indigo account']").click();
		
		WebElement username = driver.findElementById("com.shireburn.indigo:id/etUsername");
		username.sendKeys("invalidusername");
		
		WebElement btncontinue = driver.findElementById("com.shireburn.indigo:id/textLogin");
		btncontinue.click();
		
		WebElement btnconitinuepsw = driver.findElementById("com.shireburn.indigo:id/btnConstraint");
		btnconitinuepsw.click();
		
		//System.out.println(driver.findElementById("com.shireburn.indigo:id/txtPasswordPlaceHolder").getText());
		String errormessage = driver.findElementById("com.shireburn.indigo:id/txtPasswordPlaceHolder").getText();
		Assert.assertEquals(errormessage, "Password is required.");
		
		
			
	}
	
	
	@Test (priority = 3)
	public void InvalidCredentials() throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement loginclick = driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']"));
		loginclick.click();
		
		//driver.findElementByXPath("//android.widget.TextView[@Text='Log in to your Indigo account']").click();
		WebElement username = driver.findElementById("com.shireburn.indigo:id/etUsername");
		username.sendKeys("invalidusername");
		
		WebElement btncontinue = driver.findElementById("com.shireburn.indigo:id/textLogin");
		btncontinue.click();
		
		WebElement password = driver.findElementById("com.shireburn.indigo:id/etPassword");
		password.sendKeys("password");
		
		WebElement btnconitinuepsw = driver.findElementById("com.shireburn.indigo:id/btnConstraint");
		btnconitinuepsw.click();
		
		//System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Invalid username or password. Please enter your credentials again.'")).getText());
		//System.out.println(driver.findElementById("com.shireburn.indigo:id/txtLgnTitle").getText());
		String errormessage = driver.findElementById("com.shireburn.indigo:id/txtLgnTitle").getText();
		Assert.assertEquals(errormessage, "Enter your Password");
		
			
	}
	
	
	@Test (priority = 4)
	public void ViewPassword() throws MalformedURLException
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
		
		//driver.findElement(By.id("com.shireburn.indigo:id/ivPass")).click();
		//WebElement showpsw = driver.findElement(By.className("android.widget.ImageView"));
		WebElement showpsw = driver.findElementById("com.shireburn.indigo:id/ivPass");
		showpsw.click();
		
		System.out.println("Password shown");
		
	}
	
	
	@Test (priority = 5)
	public void ValidCredentials() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
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
		
		Thread.sleep(5000);
		WebElement btnagree = driver.findElementByXPath("//android.widget.Button[@text='AGREE']");
		btnagree.click();
		//driver.findElement(By.id("android:id/button1")).click();
		
		Thread.sleep(10000);
		driver.findElementById("com.shireburn.indigo:id/etCode1").sendKeys("1");
		driver.findElementById("com.shireburn.indigo:id/etCode2").sendKeys("2");
		driver.findElementById("com.shireburn.indigo:id/etCode3").sendKeys("3");
		driver.findElementById("com.shireburn.indigo:id/etCode4").sendKeys("4");
		
		WebElement btnsetaccess = driver.findElementById("com.shireburn.indigo:id/textSetAccessCode");
		btnsetaccess.click();
		
		WebElement btnallow = driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']"));
		btnallow.click();
		
		WebElement btnpermission = driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']"));
		btnpermission.click();
		
		System.out.println("User logged in successfully in the indigo application");
		
	}
	
		
	/*
		@Test (priority = 6)
		public void logout() throws MalformedURLException, InterruptedException
		{
			AndroidDriver<AndroidElement> driver = capabilities();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Log in to your Indigo account']")).click();
			
			driver.findElementById("com.shireburn.indigo:id/etUsername").sendKeys("mis@narola.email");
			driver.findElementById("com.shireburn.indigo:id/textLogin").click();
			
			driver.findElementById("com.shireburn.indigo:id/etPassword").sendKeys("Narol@123!!!");
			driver.findElementById("com.shireburn.indigo:id/btnConstraint").click();
			
			driver.findElement(By.xpath("//android.widget.Button[@text='AGREE']")).click();
			
			driver.findElementById("com.shireburn.indigo:id/etCode1").sendKeys("1");
			driver.findElementById("com.shireburn.indigo:id/etCode2").sendKeys("2");
			driver.findElementById("com.shireburn.indigo:id/etCode3").sendKeys("3");
			driver.findElementById("com.shireburn.indigo:id/etCode4").sendKeys("4");
			
			driver.findElementById("com.shireburn.indigo:id/textSetAccessCode").click();
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Allow Access']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='While using the app']")).click();
			
			//Thread.sleep(10000);
			driver.findElement(By.id("com.shireburn.indigo:id/cvUserImage")).click();
			
			driver.findElement(By.id("com.shireburn.indigo:id/tvLogout")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='LOGOUT']")).click();
			
			System.out.println("User logged out successfully");
			 
						
		}
		*/
		
		
}

