import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MojKP {
	

	private static WebElement element = null;
	//Postavi oglas
	public static WebElement getPostaviOglasButton(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='bigLink submitAd']")));
		//element=driver.findElement(By.xpath("//a[@class='bigLink submitAd']"));
		return element;	
	}
	
	public static void setPostaviOglasButton(WebDriver driver) {
		getPostaviOglasButton(driver).click();
	}

}
