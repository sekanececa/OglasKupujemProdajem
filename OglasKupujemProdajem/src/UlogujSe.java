import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UlogujSe {

	private static WebElement element = null;
	//Email
	public static WebElement getEmailInput(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")));		
		//element=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		return element;
	}
	
	public static void setEmailInput(WebDriver driver) {
		getEmailInput(driver).sendKeys("superovejica@yahoo.com");
	}
	
	
	//Password
	public static WebElement getPasswordInput(WebDriver driver) {
		element=driver.findElement(By.id("inputPassword"));
		return element;
	}
		
	public static void setPasswordInput(WebDriver driver) {
		getPasswordInput(driver).sendKeys("Superovejica18");
	}
		
		
	//LogIN Button
	public static WebElement getLogInButton(WebDriver driver) {		
		element=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/input[1]"));
		return element;
	}
				
	public static void setLogInButton(WebDriver driver) {	
		getLogInButton(driver).click();;
	}
			
}
