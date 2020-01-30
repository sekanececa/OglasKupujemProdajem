//import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

import utility.Constant;;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get(Constant.URL);
		
		Thread.sleep(1000);
		
		NavBar.setLogInButton(driver);
		
		Thread.sleep(1000);
		
		UlogujSe.setEmailInput(driver);
		UlogujSe.setPasswordInput(driver);
		UlogujSe.setLogInButton(driver);
		
		Thread.sleep(1000);
		
		MojKP.setPostaviOglasButton(driver);
		
		Thread.sleep(1000);
		
		IzborKategorije.setStvarRadioButton(driver);
		Thread.sleep(1000);
		
		//Kategorija
		
		IzborKategorije.setKategorijaDropDown(driver);
		Thread.sleep(1000);
		IzborKategorije.setKategorijaNamestaj(driver);
		Thread.sleep(1000);
		
		//Grupa
	
		IzborKategorije.setGrupaDropDown(driver);
		Thread.sleep(1000);
		IzborKategorije.setGrupaStoloviISTolice(driver);
		Thread.sleep(1000);
		
		UnosOglasa.setNazivOglasaInput(driver);
		UnosOglasa.setKoriscenoRadioButton(driver);
		UnosOglasa.setCenaInput(driver);
		Thread.sleep(1000);
		UnosOglasa.setERadioButton(driver);
		
	
		Thread.sleep(1000);
		UnosOglasa.actionkeysDown(driver);
	
		Thread.sleep(3000);
		
		//ne radi
		//UnosOglasa.setDodajSliku(driver);
		
		//nije potreban unos licnih podatak automatski su uneti u aplikaciji
		//UnosOglasa.setMestoGradDropDown(driver);
		//UnosOglasa.setBorDropDown(driver);
		UnosOglasa.setSledeciButtonn(driver);
		Thread.sleep(5000);
		
		IzborPromocije.setStandardnaVidljivostRadioButton(driver);
		IzborPromocije.setSledeceButtonn(driver);
		driver.quit();

        }
}
