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

public class createVisit {
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
	//	driver.findElement(AppiumBy.accessibilityId("Skip")).click();
		//driver.findElement(AppiumBy.accessibilityId("Done")).click();
		Thread.sleep(15000);
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
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
		Thread.sleep(4000);
		new TouchAction<>(driver).tap(PointOption.point(918, 805)).perform();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Open Settings")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.accessibilityId("Daily Plan")).click();
		Thread.sleep(2000);
		/*
		 * boolean canScrollMorre = (Boolean) ((JavascriptExecutor)
		 * driver).executeScript("mobile: scrollGesture", ImmutableMap.of( "left", 100,
		 * "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0
		 * ));
		 */
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Add Visits\")[1]);")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Add Visits\"])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.className("android.widget.EditText")).click();
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("tester ad");
		new TouchAction<>(driver).tap(PointOption.point(241, 441)).perform();
	//	driver.findElement(AppiumBy.xpath("//android.view.View[@index='3']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Visit Plan Preview\"]")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='4']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='4']")).clear();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='4']")).sendKeys("Daily visit");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='6']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='6']")).clear();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='6']")).sendKeys("Rohtak");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("SUBMIT")).click();
		Thread.sleep(9000);
		
		driver.quit();
		service.stop();		
		}
	}
}

