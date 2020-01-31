import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Identifikacija {
    
	private static WebElement element = null;
	
	
	//Vase ime 
	public static WebElement getVaseImeInput(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'personEdit')]")));
		return element;
	}
				
	public static void setVaseImeInput(WebDriver driver) {	
		getVaseImeInput(driver).sendKeys("Milena");
	}
	
	//Prezime
	public static WebElement getPrezimeInput(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'personLastNameEdit')]")));
		return element;
	}
				
	public static void setPrezimeInput(WebDriver driver) {	
		getPrezimeInput(driver).sendKeys("Toroman");
	}
	
	//Mesto stanovanja
	public static WebElement getMestoStanovanjaInput(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'data[d_person_location]')]")));
		return element;
	}
				
	public static void setMestoStanovanjaInput(WebDriver driver) {	
		getMestoStanovanjaInput(driver).sendKeys("Bor");
	}
	
	//Ul. i br. stanovanja
	public static WebElement getUlicaIBrojInput(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'data[d_person_address]')]")));
		return element;
	}
				
	public static void setUlicaIBrojInput(WebDriver driver) {	
		getUlicaIBrojInput(driver).sendKeys("Milana Vitezovica 22a");
	}
	
	//JMBG
	public static WebElement getJMBGInput(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'data[d_jmbg]')]")));
		return element;
	}
				
	public static void setJMBGInput(WebDriver driver) {	
		getJMBGInput(driver).sendKeys("1312986715678");
	}
	
	//Broj licne karte
	public static WebElement getBrLicneKarteInput(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'data[d_id_card_number]')]")));
		return element;
	}
				
	public static void setBrLicneKarteInput(WebDriver driver) {	
		getBrLicneKarteInput(driver).sendKeys("86715678");
	}
	//Mesto izdavanja lk
	public static WebElement getMestoIzdavanjaLKInput(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'data[d_id_card_location]')]")));
		return element;
	}
				
	public static void setMestoIzdavanjaLKInput(WebDriver driver) {	
		getMestoIzdavanjaLKInput(driver).sendKeys("Bor");
	}
	
	//Garantujem za tacnost unetih podataka
	public static WebElement getGarantujemTacnostRadioButton(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'swear_yes')]")));
		return element;
	}
				
	public static void setGarantujemTacnostRadioButton(WebDriver driver) {	
		getGarantujemTacnostRadioButton(driver).click();
	}
	
	//Prihvatam pravila
	public static WebElement getPrihvatamPravilaRadioButton(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'accept_yes')]")));
		return element;
	}
				
	public static void setPrihvatamPravilaRadioButton(WebDriver driver) {	
		getPrihvatamPravilaRadioButton(driver).click();
	}
	
	//Postavite oglas
	public static WebElement getPostaviteOglasButton(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@type,'button')])[14]")));
		return element;
	}
				
	public static void setPostaviteOglasButton(WebDriver driver) {	
		getPostaviteOglasButton(driver).click();
	}
}
