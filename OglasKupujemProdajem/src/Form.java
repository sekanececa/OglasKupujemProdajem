import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


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
		UnosOglasa.setERadioButton(driver);
		
		Thread.sleep(1000);
		UnosOglasa.setTekstOglasaInput(driver);
		
		driver.quit();

        }
}
