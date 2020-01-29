import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IzborKategorije {
	
	private static WebElement element = null;
	//Izaberi rucno Stvar RadioButton
	public static WebElement getStvarRadioButton(WebDriver driver) {		
		element=driver.findElement(By.xpath("//input[@id='data[ad_kind]goods']"));
		return element;
	}
				
	public static void setStvarRadioButton(WebDriver driver) {	
		getStvarRadioButton(driver).click();;
	}
	
	//Kategorija padajuci meni
	public static WebElement getKategorija(WebDriver driver) {		
		element=driver.findElement(By.xpath("//div[@id='categorySelection']//span[@class='labelHolder'][contains(text(),'Izaberite')]"));
		return element;
	}
				
	public static void setKategorija(WebDriver driver) {	
		getKategorija(driver).click();
	}
	
	//Kategorija Namestaj unos teksta	
	public static WebElement getKategorijaDropDown(WebDriver driver) {		
		element=driver.findElement(By.xpath("//div[@id='categorySelection']//div[@class='uiMenuButton']//div[@class='uiMenuButtonSelectionHolder']//div[@class='uiInlineBlock uiMenuHolder']//div//input"));
		return element;
	}
				
	public static void setKategorijaDropDown(WebDriver driver) {	
		getKategorijaDropDown(driver).sendKeys("Namestaj");
	}
	
	//Kategorija Namestaj
	public static WebElement getKategorijaNamestaj(WebDriver driver) {		
		element=driver.findElement(By.xpath("//div[contains(text(),'Name')]"));
		return element;
	}
					
	public static void setKategorijaNamestaj(WebDriver driver) {	
		getKategorijaNamestaj(driver).click();;
	}
	
	
	//Grupa padajuci meni
	public static WebElement getGrupa(WebDriver driver) {		
		element=driver.findElement(By.xpath("//span[@class='labelHolder'][contains(text(),'Grupa')]"));
		return element;
	}
					
	public static void setGrupa(WebDriver driver) {	
		getGrupa(driver).click();
	}
		
	//Grupa unos teksta
	public static WebElement getGrupaDropDown(WebDriver driver) {		
		element=driver.findElement(By.xpath("//div[@id='groupSelection']//div[@class='uiMenuButton']//div[@class='uiMenuButtonSelectionHolder']//div[@class='uiInlineBlock uiMenuHolder']//div//input"));
		return element;
	}
					
	public static void setGrupaDropDown(WebDriver driver) {	
		getGrupaDropDown(driver).sendKeys("Stolovi i stolice");
	}
	//Grupa Stolovi I Stolice
	public static WebElement getGrupaStoloviISTolice(WebDriver driver) {		
		element=driver.findElement(By.xpath("//span[@id='groupInsertSpot']//div[@id='menuGroup2']//div[4]"));
		return element;
	}
						
	public static void setGrupaStoloviISTolice(WebDriver driver) {	
		getGrupaStoloviISTolice(driver).click();;
	}
}


