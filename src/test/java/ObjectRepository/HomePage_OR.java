package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.desiredCapabilities;

public class HomePage_OR extends desiredCapabilities{

	@FindBy(xpath ="//android.widget.TextView[contains(@text,'Watch OkStaff Help Video')]")
	public static WebElement WatchOkStaffVideo;
	
	@FindBy(xpath ="//android.widget.TextView[contains(@text,'Salary Due')]")
	public static WebElement SalaryDue;
	
}
