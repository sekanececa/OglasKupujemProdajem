import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojKP {
	

	private static WebElement element = null;
	//Postavi oglas
	public static WebElement getPostaviOglasButton(WebDriver driver) {
		element=driver.findElement(By.xpath("//a[@class='bigLink submitAd']"));
		return element;	
	}
	
	public static void setPostaviOglasButton(WebDriver driver) {
		getPostaviOglasButton(driver).click();
	}

}
