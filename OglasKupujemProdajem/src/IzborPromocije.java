import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IzborPromocije {
	
    private static WebElement element = null;
	
	
	//Radio Button standardna vidljivost
	public static WebElement getStandardnaVidljivostRadioButton(WebDriver driver) {		
		element=driver.findElement(By.xpath("//input[@id='data[promo_type]none']"));
		return element;
	}
				
	public static void setStandardnaVidljivostRadioButton(WebDriver driver) {	
		getStandardnaVidljivostRadioButton(driver).click();
	}
	
	//Button sledece
		public static WebElement getSledeceButton(WebDriver driver) {	
			element = driver.findElement(By.xpath("//div[@id='adFormPromo']//div[@class='adFormPostButtonHolder']//input[@class='submit-button']"));	
			return element;		
		}
		
		public static void setSledeceButtonn(WebDriver driver) {
			getSledeceButton(driver).click();
		}
}
