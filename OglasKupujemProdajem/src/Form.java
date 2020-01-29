import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kupujemprodajem.com/");
		
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
		IzborKategorije.setKategorija(driver);
		
		Thread.sleep(1000);
		IzborKategorije.setKategorijaDropDown(driver);
		Thread.sleep(1000);
		IzborKategorije.setKategorijaNamestaj(driver);
		Thread.sleep(1000);
		IzborKategorije.setGrupa(driver);
		Thread.sleep(1000);
		IzborKategorije.setGrupaDropDown(driver);
		Thread.sleep(1000);
		IzborKategorije.setGrupaStoloviISTolice(driver);
		
		driver.quit();

        }
}
