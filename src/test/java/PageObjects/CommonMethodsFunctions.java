package PageObjects;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Driver.desiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CommonMethodsFunctions extends desiredCapabilities{
	
	/**
	 * 
	 * @param count
	 * @return
	 */
	public String randomAlphaNumeric(int count) {
		final String token = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder builder = new StringBuilder();
		builder.append("Staff");
		while (count-- != 0) {
			int character = (int) (Math.random() * token.length());
			builder.append(token.charAt(character));
		}
		return builder.toString();
	}
	
	/**
	 * 
	 * @param count
	 * @return
	 */
	public String randomNumber(int count) {
		final String token = "567890";
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * token.length());
			builder.append(token.charAt(character));
		}
		return builder.toString();
	}
	
	
	/**
	 * 
	 * @param text
	 * @param driver
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public void scrollToText(String text, AppiumDriver<MobileElement> driver)
			throws MalformedURLException, InterruptedException {
	    	 MobileElement el = (MobileElement) ((FindsByAndroidUIAutomator) driver)
					    .findElementByAndroidUIAutomator("new UiScrollable("
					        + "new UiSelector().scrollable(true)).scrollIntoView("                      
					        + "new UiSelector().textContains(\""+text+"\"));");
	}
	
	/**
	 * 
	 * @param text
	 * @param driver
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public void scrollToTextWithClick(String text, AppiumDriver<MobileElement> driver)
			throws MalformedURLException, InterruptedException {
	    	 MobileElement el = (MobileElement) ((FindsByAndroidUIAutomator) driver)
					    .findElementByAndroidUIAutomator("new UiScrollable("
					        + "new UiSelector().scrollable(true)).scrollIntoView("                      
					        + "new UiSelector().textContains(\""+text+"\"));");
			  el.click();
	}
	
	@SuppressWarnings("rawtypes")
	public static void topBottomScroll(AppiumDriver<MobileElement> driver, double startYprc, double endYprc) {
		
	    System.out.println("Scroll Top to bottom...");
		Dimension size = driver.manage().window().getSize();
	    int startX = size.width / 2;
	    int startY = (int) (size.height * startYprc);
	    int endY = (int) (size.height * endYprc);
	    
	    System.out.println("Scroll: "+startX+", "+startY+", "+endY+" and Size: "+size);
	    new TouchAction(driver).press(PointOption.point(startX, startY))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(100))).moveTo(PointOption.point(startX, endY))
		.release().perform();
	   	System.out.println("Page Scrolled...");
	   	
	}
	
    /**
     * 
     * @param element
     * @param driver
     * @throws InterruptedException
     */
	public void clickAction(WebElement element, AppiumDriver<MobileElement> driver) throws InterruptedException {
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
        builder.moveToElement(element).click();
        builder.perform();
	}
}
