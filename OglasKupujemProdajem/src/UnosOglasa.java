import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


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
		getKoriscenoRadioButton(driver).click();
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
		getERadioButton(driver).click();
		
	}
	
	//Put do Inputa za Oglas
	public static void actionkeysDown(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.sendKeys(driver.findElement(By.xpath("//input[contains(@id,'data[price_fixed]')]")),Keys.TAB).
		sendKeys(driver.findElement(By.xpath("//input[@id='exchange_yes']")),Keys.TAB).
		sendKeys(("Stolica je kupljena u Budimpesti u antikarnici. Restaurirana je 2009. Mebl je jako ocuvan i kvalitetan. Prodajemo je jer prelazimo u drugi, manji stan."),Keys.TAB).
		//sendKeys(Keys.RETURN).
		build().perform();	
	}
	
	//Tekst Oglasa
	public static WebElement getTekstOglasaInput(WebDriver driver) {	
		element = driver.findElement(By.cssSelector(".mceContentBody "));	
		return element;
			
	}
						
	public static void setTekstOglasaInput(WebDriver driver) {	
		getTekstOglasaInput(driver).sendKeys("Stolica je kupljena u Budimpesti u antikarnici. Restaurirana je 2009. Mebl je jako ocuvan i kvalitetan. Prodajemo je jer prelazimo u drugi, manji stan.");
	}
	
	//Dodavanje slike
	public static WebElement getDodajSliku(WebDriver driver) {	
		element = driver.findElement(By.id("addPhotoButtonInList"));	
		return element;		
	}
	
	public static void setDodajSliku(WebDriver driver) {
		getDodajSliku(driver).sendKeys("C:\\Users\\User\\Desktop\\OglasKupujemProdajem\\187785124.jpg");
	}
		

	//MestoGrad
	public static WebElement getMestoGradDropDown(WebDriver driver) {	
		element = driver.findElement(By.xpath("//div[@id='locationSelection']//span[@class='labelHolder'][contains(text(),'Izaberite')]"));
		return element;		
	}
	
	public static void setMestoGradDropDown(WebDriver driver) {
		getMestoGradDropDown(driver).click();;
	}
	
	public static WebElement getBorDropDown(WebDriver driver) {	
		element = driver.findElement(By.id("//div[@data-text='Bor']"));	
		return element;		
	}
	
	public static void setBorDropDown(WebDriver driver) {
		getBorDropDown(driver).click();
	}
	
	
	//Button sledece
	public static WebElement getSledeciButton(WebDriver driver) {	
		element = driver.findElement(By.xpath("//div[@class='table with-border']//div[@class='adFormPostButtonHolder']//input[@class='submit-button']"));	
		return element;		
	}
	
	public static void setSledeciButtonn(WebDriver driver) {
		getSledeciButton(driver).click();
	}
}	

