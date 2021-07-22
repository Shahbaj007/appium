package appium1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class tap {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName","vivo 1851");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","9");
		dc.setCapability("UDID","8606081");
		dc.setCapability("appPackage","com.android.bbkcalculator");
		dc.setCapability("appActivity",".Calculator");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MobileElement five = (MobileElement) driver.findElement(By.id("com.android.bbkcalculator:id/digit5"));
		driver.tap(1, five, 500);
		
		
		MobileElement plus= (MobileElement) driver.findElement(By.id("com.android.bbkcalculator:id/plus"));
		driver.tap(1, plus, 500);
		
		
		MobileElement three = (MobileElement) driver.findElement(By.id("com.android.bbkcalculator:id/digit3"));
		driver.tap(1, three, 500);
		
		
		MobileElement equal = (MobileElement) driver.findElement(By.id("com.android.bbkcalculator:id/equal"));
		driver.tap(1, equal, 500);
		
		
		String value = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"8\"]")).getText();
		System.out.println(value);


	}

}
