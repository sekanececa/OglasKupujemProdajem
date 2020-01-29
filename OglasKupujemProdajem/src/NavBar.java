import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBar {
	
	private static WebElement element = null;
	//Log I
	public static WebElement getLogInButton(WebDriver driver) {
		element=driver.findElement(By.xpath("//a[contains(text(),'Ulogujte se')]"));
		return element;
	}
		
	public static void setLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}

}
