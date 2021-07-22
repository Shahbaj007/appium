package appium1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class api_Demos {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1851");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "8606081");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MobileElement view = (MobileElement) driver.findElementByAccessibilityId("Views");
		driver.tap(1, view, 500);
		
		MobileElement controls = (MobileElement) driver.findElementByAccessibilityId("Controls");
		driver.tap(1, controls, 500);
		
		MobileElement darkTheme = (MobileElement) driver.findElementByAccessibilityId("2. Dark Theme");
		driver.tap(1, darkTheme, 500);
		
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Shahbaj");
		
		MobileElement checkBox = (MobileElement) driver.findElementByAccessibilityId("Checkbox 1");
		driver.tap(1, checkBox, 500);
		
		MobileElement radioButton = (MobileElement) driver.findElementByAccessibilityId("RadioButton 1");
		driver.tap(1, radioButton, 500);
		
		

	}

}
