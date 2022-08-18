package Mavenproj.IndigoAutomation;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseIndigo {
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{

	//public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		File appDirectory = new File("src");
		File app = new File(appDirectory, "Indigo_1.0.32.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//To run a script in emulator
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
		
		//To run a script in real device 
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		//AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URl("http://127.0.0.1:2347/wd/hub"), cap);
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
		
			
	}

}
