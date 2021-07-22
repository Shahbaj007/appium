package appium1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GenerealStoreAddToCart {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "vivo 1851");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "8606081");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.EditText[@text='Enter name here']").sendKeys("shahbaj");
		
		MobileElement radioButton = (MobileElement) driver.findElementByXPath("//android.widget.RadioButton[@text='Male']");
		driver.tap(1, radioButton, 500);
		
		MobileElement letsShop = (MobileElement) driver.findElementByXPath("//android.widget.Button[@resource-id='com.androidsample.generalstore:id/btnLetsShop']");
		driver.tap(1, letsShop, 500);
		
		
		MobileElement addToCart = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']");
		driver.tap(1, addToCart, 500);
		
		MobileElement cart = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));
		driver.tap(1, cart, 500);
		
		String Shoe = "Air Jordan 4 Retro";
		
		MobileElement addedProduct = (MobileElement) driver.findElement(By.id("com.androidsample.generalstore:id/productName"));
		
		if(Shoe.equalsIgnoreCase(addedProduct.getText())) {
			System.out.println("Added Product is Correct");
		}else {
			System.out.println("Added Product is Wrong");
		}
		
		

	}

}
