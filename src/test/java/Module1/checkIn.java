package Module1;

import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import java.net.URL;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.offset.PointOption;

public class checkIn {
	@Test
	public class test1 {
		public void AppiumTest2() throws MalformedURLException, InterruptedException {
			
				AppiumDriverLocalService  service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\dell\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
					.withIPAddress("127.0.0.1").usingPort(4723).build();
					service.start();							
					
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("Pixel 7 API 31");
//		options.setApp("C:\\Users\\dell\\eclipse-workspace\\RealmeFramework\\src\\test\\resources\\Resources\\R-Retail-dev.apk");
		options.setApp("C:\\Users\\dell\\Downloads\\FOS.apk");

		
		AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		//http://127.0.0.1:4723

		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Allow")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("(//android.widget.EditText)[" + indexToFind + "]"));
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='5']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='5']")).clear();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='5']")).sendKeys("FOS1013");
		Thread.sleep(2000);	
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='7']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='7']")).sendKeys("Realme@123");
		Thread.sleep(2000);
		// Scroll up using UiScrollable
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"LOGIN\"));"));
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("LOGIN")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.id("com.ntpl.realme.hrmsapp.dev:id/btn_positive_action")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/allow_always_radio_button")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Back")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Open Settings")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Check In\"]")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Shutter")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		Thread.sleep(4000);		
		driver.findElement(AppiumBy.accessibilityId("Crop")).click();
		Thread.sleep(7000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=\"0\"]")).click(); //collection
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("UPI")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='1']")).click(); 
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='1']")).sendKeys("test amount");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Select Bank")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("YES Bank")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='9']")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='6']")).sendKeys("test amount collected");
		Thread.sleep(2000);
		/*
		 * driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='7']")).
		 * click(); Thread.sleep(3000);
		 * driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='7']")).
		 * sendKeys("1000"); Thread.sleep(3000);
		 */
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
	//	driver.findElement(AppiumBy.accessibilityId("SUBMIT")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=\"1\"]")).click(); //notes
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index=\"1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index=\"1\"]")).sendKeys("this is test note");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		Thread.sleep(30000);
		driver.findElement(AppiumBy.accessibilityId("CheckOut Visit")).click();
		Thread.sleep(3000);	
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='7']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='7']")).sendKeys("Good Visit");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("CHECKOUT")).click();
		Thread.sleep(5000);
		driver.quit();
		service.stop();		
		}
	}
}

