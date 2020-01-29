import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

public class UnosOglasa {
	private static WebElement element = null;
	
	
	//Naslov oglasa
	public static WebElement getNazivOglasaInput(WebDriver driver) {		
		element=driver.findElement(By.xpath("//input[@id='data[name]']"));
		return element;
	}
				
	public static void setNazivOglasaInput(WebDriver driver) {	
		getNazivOglasaInput(driver).sendKeys("Stolica stara 150 godina");
	}
	
	//Nudim RadioButton
	public static WebElement getNudimRadioButton(WebDriver driver) {		
		element=driver.findElement(By.xpath("//input[@id='ad_type_sell']"));
		return element;
	}
				
	public static void setNudimRadioButton(WebDriver driver) {	
		getNudimRadioButton(driver).sendKeys(Keys.RETURN);
	}
	
	//Stanje - Korisceno RadioButton
	public static WebElement getKoriscenoRadioButton(WebDriver driver) {		
		element=driver.findElement(By.xpath("//input[@id='data[condition]used']"));
		return element;
	}
					
	public static void setKoriscenoRadioButton(WebDriver driver) {	
		getKoriscenoRadioButton(driver).sendKeys(Keys.RETURN);
	}
	
	//Cena
	public static WebElement getCenaInput(WebDriver driver) {		
		element=driver.findElement(By.xpath("//input[@id='price_number']"));
		return element;
	}
					
	public static void setCenaInput(WebDriver driver) {	
		getCenaInput(driver).sendKeys("250");
	}
	
	//Evro radio button
	public static WebElement getERadioButton(WebDriver driver) {		
		element=driver.findElement(By.xpath("//input[@id='currency_eur']"));
		return element;
	}
					
	public static void setERadioButton(WebDriver driver) {	
		getERadioButton(driver).sendKeys(Keys.RETURN);
	}
	
	//Tekst Oglasa
		public static WebElement getTekstOglasaInput(WebDriver driver) {
			//Actions action = new Actions(driver);
			//action.keyDown(Keys.TAB).build().perform();
			//action.keyDown(Keys.TAB).build().perform();
			//action.keyDown(Keys.TAB).build().perform();
			element=driver.findElement(By.id("tinymce"));
			return element;
			
		}
						
		public static void setTekstOglasaInput(WebDriver driver) {	
			getTekstOglasaInput(driver).sendKeys("Stolica je kupljena u Budimpesti u antikarnici. Restaurirana je 2009. Mebl je jako ocuvan i kvalitetan. Prodajemo je jer prelazimo u drugi, manji stan.");
		}
}
