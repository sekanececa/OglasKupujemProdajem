import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBar {
	
	private static WebElement element = null;
	//Log I
	public static WebElement getLogInButton(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Ulogujte se')]")));
		//element=driver.findElement(By.xpath("//a[contains(text(),'Ulogujte se')]"));
		return element;
	}
		
	public static void setLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}

}
