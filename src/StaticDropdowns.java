import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\Calidad de Software\\Automation\\FilesDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Dropdown with select tag - static
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown); //Creando un objeto de la clase Select que tiene Selenium para poder acceder a los metodos/acciones sobre un droppdown
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");//selecciona opcion AED
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");//Selecciona por el valor del atributo value del html
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
	}

}
