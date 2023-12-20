package Module1;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.offset.PointOption;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import java.io.File;
import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
//import jdk.internal.classfile.impl.Options;

@Test
public class Leave {
	public void AppiumTest1() throws MalformedURLException, InterruptedException {
		
			AppiumDriverLocalService  service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\dell\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
				service.start();							
				
	UiAutomator2Options options= new UiAutomator2Options();
	options.setDeviceName("Pixel 7 API 31");
//	options.setApp("C:\\Users\\dell\\eclipse-workspace\\RealmeFramework\\src\\test\\resources\\Resources\\R-Retail-dev.apk");
	options.setApp("C:\\Users\\dell\\Downloads\\FOS.apk");

	
	AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	//http://127.0.0.1:4723
	Thread.sleep(4000);
//	driver.findElement(AppiumBy.accessibilityId("Skip")).click();
	//driver.findElement(AppiumBy.accessibilityId("Done")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Allow")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
	Thread.sleep(3000);
	
//	driver.findElement(By.xpath("(//android.widget.EditText)[" + indexToFind + "]"));
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
//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"LOGIN\"));"));
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
	Thread.sleep(3000);
	driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
	Thread.sleep(4000);
	driver.findElement(AppiumBy.accessibilityId("Day Start")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Ok")).click();
	Thread.sleep(2000);
    driver.findElement(AppiumBy.xpath("//android.view.View[@index='5']")).click();
    Thread.sleep(3000);
	 driver.findElement(AppiumBy.accessibilityId("Reason")).click();
	 Thread.sleep(2000);
	 driver.findElement(AppiumBy.accessibilityId("Earned Leave")).click();
	Thread.sleep(2000);
	 driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='3']")).click();
	 driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='3']")).sendKeys("test leave");
	 Thread.sleep(2000);
	 driver.findElement(AppiumBy.accessibilityId("SUBMIT")).click();
	 Thread.sleep(4000);
	 new TouchAction<>(driver).tap(PointOption.point(562, 1348)).perform();
	 Thread.sleep(4000);

	driver.quit();
	service.stop();
	
	}
}
