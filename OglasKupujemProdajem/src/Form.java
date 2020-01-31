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
		
		
		NavBar.setLogInButton(driver);
		
	
		UlogujSe.setEmailInput(driver);
		UlogujSe.setPasswordInput(driver);
		UlogujSe.setLogInButton(driver);
		
		
		MojKP.setPostaviOglasButton(driver);
		
		
		IzborKategorije.setStvarRadioButton(driver);	
		//Kategorija
		
		IzborKategorije.setKategorijaDropDown(driver);
		IzborKategorije.setKategorijaNamestaj(driver);
		
		//Grupa
	
		IzborKategorije.setGrupaDropDown(driver);
		IzborKategorije.setGrupaStoloviISTolice(driver);
		
		
		
		UnosOglasa.setNazivOglasaInput(driver);
		UnosOglasa.setKoriscenoRadioButton(driver);
		UnosOglasa.setCenaInput(driver);
		UnosOglasa.setERadioButton(driver);
		
	
	
		UnosOglasa.actionkeysDown(driver);
	
		Thread.sleep(3000);
		
		//ne radi
		//UnosOglasa.setDodajSliku(driver);
		
		//nije potreban unos licnih podatak automatski su uneti u aplikaciji
		//UnosOglasa.setMestoGradDropDown(driver);
		//UnosOglasa.setBorDropDown(driver);
		UnosOglasa.setSledeciButtonn(driver);

		Thread.sleep(3000);
		IzborPromocije.setStandardnaVidljivostRadioButton(driver);
		IzborPromocije.setSledeceButtonn(driver);
		
		Identifikacija.setVaseImeInput(driver);
		Identifikacija.setPrezimeInput(driver);
		Identifikacija.setMestoStanovanjaInput(driver);
		Identifikacija.setUlicaIBrojInput(driver);
		Identifikacija.setJMBGInput(driver);
		Identifikacija.setJMBGInput(driver);
		Identifikacija.setBrLicneKarteInput(driver);
		Identifikacija.setMestoIzdavanjaLKInput(driver);
		Identifikacija.setGarantujemTacnostRadioButton(driver);
		Identifikacija.setPrihvatamPravilaRadioButton(driver);
		
		
		//Postavka OGLASA
		//Identifikacija.setPostaviteOglasButton(driver);
		driver.quit();

        }
}
