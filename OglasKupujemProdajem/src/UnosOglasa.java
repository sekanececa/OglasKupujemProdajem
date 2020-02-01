
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UnosOglasa {
	private static WebElement element = null;
	
	
	//Naslov oglasa
	public static WebElement getNazivOglasaInput(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='data[name]']")));
		//element=driver.findElement(By.xpath("//input[@id='data[name]']"));
		return element;
	}
				
	public static void setNazivOglasaInput(WebDriver driver) {	
		getNazivOglasaInput(driver).sendKeys("Stolica stara 150 godina");
	}
	
	//Nudim RadioButton
	public static WebElement getNudimRadioButton(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ad_type_sell']")));
		//element=driver.findElement(By.xpath("//input[@id='ad_type_sell']"));
		return element;
	}
				
	public static void setNudimRadioButton(WebDriver driver) {	
		getNudimRadioButton(driver).sendKeys(Keys.RETURN);
	}
	
	//Stanje - Korisceno RadioButton
	public static WebElement getKoriscenoRadioButton(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='data[condition]used']")));
		//element=driver.findElement(By.xpath("//input[@id='data[condition]used']"));
		return element;
	}
					
	public static void setKoriscenoRadioButton(WebDriver driver) {	
		getKoriscenoRadioButton(driver).click();
	}
	
	//Cena
	public static WebElement getCenaInput(WebDriver driver) {	
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='price_number']")));
		//element=driver.findElement(By.xpath("//input[@id='price_number']"));
		return element;
	}
					
	public static void setCenaInput(WebDriver driver) {	
		getCenaInput(driver).sendKeys("250");
	}
	
	//Evro radio button
	public static WebElement getERadioButton(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='currency_eur']")));
		//element=driver.findElement(By.xpath("//input[@id='currency_eur']"));
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
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("thumbHolder")));
		//element = driver.findElement(By.xpath("//div[@id='addPhotoButtonInList']"));	
		//return element;	
		/*
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		StringSelection stringSelectoion= new StringSelection("C:\\Users\\User\\Desktop\\OglasKupujemProdajem\\187785124.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectoion, null);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		*/
		/*
		 * 
		 */
		return element;
		
		

	}
	
	public static void setDodajSliku(WebDriver driver) throws AWTException {
		//getDodajSliku(driver).sendKeys("C:\\Users\\User\\Desktop\\OglasKupujemProdajem\\187785124.jpg");
		getDodajSliku(driver).click();
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		StringSelection stringSelectoion= new StringSelection("C:\\Users\\User\\Desktop\\OglasKupujemProdajem\\187785124.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelectoion, null);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
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
		WebDriverWait wait=new WebDriverWait(driver,10);	
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='table with-border']//div[@class='adFormPostButtonHolder']//input[@class='submit-button']")));
		//element = driver.findElement(By.xpath("//div[@class='table with-border']//div[@class='adFormPostButtonHolder']//input[@class='submit-button']"));	
		return element;		
	}
	
	public static void setSledeciButtonn(WebDriver driver) {
		getSledeciButton(driver).click();
	}
}	

